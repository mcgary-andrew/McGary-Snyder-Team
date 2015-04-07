/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import java.io.PrintWriter;

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
                + "\nH - Help Menu"
                + "\nG - Game Menu"
                + "\nL - Print List of Locations and Description"
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
}
