/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Scene;
import java.awt.Point;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class GameMenuView extends View {

//    public String gameMenu = "";    
    public GameMenuView(){
    super("\n"
            + "\n-----------------------------------------"
            + "\n Game Menu"
            + "\n-----------------------------------------"
            + "\nR - Resume" 
            + "\nS - Save"
            + "\nM - Display Map" 
            + "\nA - Go to armor shop"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    }
    
    
 @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase(); //convert to all upper case
        char select = value.charAt(0);
        switch (select){
            case 'R': // Resume Game
                this.resumeGame();
                break;
            case 'S': // Save
                this.saveGame();
                break;
            case 'M':
                this.displayMap();
                break;
            case 'A': // Go to Armor Shop
                this.displayAddArmorMenu();
                break;
            case 'E': // Exit
                return false;
            default:
                this.console.println("\n*** Invalid Selection ***");
                break;
        }
        return true;
    }
    
    private void saveGame() {
       this.console.println("*** saveGame function called ***");
    }

    private void resumeGame() {
        this.console.println("*** resumeGame function called ***");
    }

    private void displayAddArmorMenu() {
        AddArmorMenu addArmorMenu = new AddArmorMenu();
        addArmorMenu.display();
    }

    void displayMap() {
        Location[][] locations = TreeOfLife.getCurrentGame().getMap().getLocations();

        //DISPLAY title
        System.out.println("Tree of Life Map");
        //DISPLAY row of column numbers

        System.out.println("\n | --0-- | --1-- | --2-- | --3-- | --4-- |");
        for(int i = 0; i < locations.length; i++){
//             DISPLAY row divider
                System.out.println("--------------------------------");

            String grid = i + "|";
            for(int j = 0; j<locations[i].length; j++){
                Location location = locations[i][j];

                   String symbol;
                   Point currentCoordinates= TreeOfLife.getCurrentGame().getActors().getCoordinates();
                   Location characterLocation = locations[currentCoordinates.x] [currentCoordinates.y];
                   Scene scene = new Scene();
                   if(location == characterLocation) {
                       symbol = "URHere";
                   }
                   else if(scene.isVisited() ) { 
                       //get current game
                        
                       symbol = scene.getMapSymbol();
                    }
                    else {
                       symbol = "?????";
                    }
//                   DISPLAY column divider
                     grid += ( " "+ symbol + " |");
            }
            System.out.println(grid);
//            System.out.println("|");
        }

        // DISPLAY ending row divider  
        System.out.println("--------------------------------");
        
        
       
        
        
        //print out map menu
    MapView mapView = new MapView(); 
    mapView.display();
    }
    
}
