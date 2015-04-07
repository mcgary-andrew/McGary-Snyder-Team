/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Scene;
import java.awt.Point;
import java.io.PrintWriter;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class MapView extends View {
    public MapView() {
        super("\n"
                + "\n========================================"
                + "\n| Map Menu                             |"
                + "\n========================================"
                + "\nE - Enter Map Coordinates"
                //           +"\nT - Temple"
                //            +"\nM - Mantle"
                //            +"\nA - Armor Shop"
                //            +"\nC - Choose Level Menu" 
                + "\nH - Help Menu"
                + "\nG - Game Menu"
                + "\nL - Print List of Locations and Description"
                //            +"\nQ - Return to Main Menu" 
                + "\n========================================");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); //convert to all upper case
        char selection = value.charAt(0); //get first character entered
        switch (selection) {

            case 'H': // go to the Main Menu  
                this.displayHelpMenu();
                break;
            case 'G':  // Go To the Game Menu
                this.displayGameMenu();
                break;
            case 'L':  // Print a list of all map locations
                this.printLocations();
                break;
            case 'E':  // Print a list of all map locations
                this.enterCoordinates();
                break;
            default:
                ErrorView.display("MapView", "\n*** Invalid map menu selection *** Try again");
                break;
        }
        return true;
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void printLocations() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the list of locations is to be saved.");

        String filePath = this.getInput();

        try {

            // save the game to the specified file
            this.printScenes(filePath);
        } catch (Exception ex) {
            ErrorView.display("MapLocationsView", ex.getMessage());
        }
        this.displayGameMenu();
    }

    private void printScenes(String filePath) {
        try (PrintWriter output = new PrintWriter(filePath)) {

            String locList = "\n\nList of all Locations";

            try {

                SceneType[] scenes = SceneType.values();
                for (SceneType item : scenes) {
                    char locName = item.name().charAt(0);
                    String locationDescription = item.getLocationDescription();
                    locList += ("\n" + locName + " - " + locationDescription);
                }

            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input " + e.getMessage());
            }

            output.println(locList); //write the locList ArrayList out to file

        } catch (Exception e) {
            ErrorView.display("MapLocationsView", e.getMessage());
        }
        //check file size
        if (filePath.length() > 1) {
            this.console.println("Congrats! Your location list has printed to the specified file.");

        }

    }

   
    private void enterCoordinates() {
        //Code to get input for map movement
        this.console.println("\n\nEnter the Coordinates to move to a different location."
                + "\nFirst enter Row Number and then Column Number."
                + "\n(Example 1,0 will take you to the Temple)");

        String value = this.getInput();
            if(value.indexOf(",")== -1){
                ErrorView.display("MapView", "Please use the following format to enter coordinates: 0,2 "
                        );
            }else{
            String[] values = value.split("\\s*,\\s*");
            try{
                int x = Integer.parseInt(values[0]);
                int y = Integer.parseInt(values[1]);
            
        if (x < 0 || x > TreeOfLife.getCurrentGame().getMap().getNumberOfRows()) {
            ErrorView.display("MapView", "You have entered an incorrect row number. Please enter a value between 0 and 3.");
            return;
        }
        if (y < 0 || y > TreeOfLife.getCurrentGame().getMap().getNumberOfColumns()) {
            ErrorView.display("MapView", "You have entered an incorrect column number. Please enter a value between 0 and 2.");
            return;
        }
        Location location = TreeOfLife.getCurrentGame().getMap().getLocations()[x][y];
        Scene scene = new Scene();
        if(scene.isBlocked() == true){
            ErrorView.display("MapView", "This location is blocked. Please try another ");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMap();
        }
        else {
            //moveCharacterToLocation
            MapControl.moveActorToLocation(TreeOfLife.getCurrentGame().getActors(), new Point(x, y));
            //get location
            Location[][] locations = TreeOfLife.getCurrentGame().getMap().getLocations();
            Location currentLocation = locations[x][y];
            //display the location scene
            //display scene descrption
            String description = currentLocation.getScene().getDescription();
            this.console.println(description);

            if (currentLocation == locations[0][0]){
                //currentLocation.getScene().setSceneView(new ArmorShopMenuView());
                View myView = new AddArmorMenu();
                if (myView != null){
                myView.display();
                }
            }else{
                View myView = currentLocation.getScene().getSceneView();
            if (myView != null){
                myView.display();
            }
            }   
            }
          
        }catch (NumberFormatException nfe){
                ErrorView.display("MapView", "You must enter a number, no letters please!");
            }
            }
    }
}
