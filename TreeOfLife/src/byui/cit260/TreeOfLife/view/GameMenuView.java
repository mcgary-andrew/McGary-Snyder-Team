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
            + "\nR - Resume game"
            + "\nV - View player stats"
            + "\nA - Go to armor shop"
            + "\nM - Display map"
            + "\nH - Help"
            + "\nS - Save game"
            + "\nE - Exit game without saving"
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
            case 'V': // Go to Actor Report View
                ActorReportView actorReportView = new ActorReportView();
                actorReportView.display();
                break;
            case 'A': // Go to Armor Shop
                this.displayAddArmorMenu();
                break;
            case 'M':
                this.displayMap();
                break;
            case 'H':
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.display();
                break;
            case 'S': // Save
                this.saveGame();
                break;
            case 'E': // Exit
                this.returnMainMenuView(); 
                break;
            default:
                this.console.println("\n*** Invalid Selection ***");
                break;
        }
        return true;
    }
    
    private void resumeGame() {
        this.console.println("*** resumeGame function called ***");
    }
 
    private void displayAddArmorMenu() {
        AddArmorMenu addArmorMenu = new AddArmorMenu();
        addArmorMenu.display();
    }
    
    private void saveGame() {
       this.console.println("*** saveGame function called ***");
    }

    private void displayMap(){
       this.console.println("This function is not yet implemented.");
       GameMenuView gameMenuView = new GameMenuView();
       gameMenuView.display();
    }


    private void returnMainMenuView() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display(); 
    }

//    void displayMap() {
//        Location[][] locations = TreeOfLife.getCurrentGame().getMap().getLocations();
//
//        //DISPLAY title
//        System.out.println("Tree of Life Map");
//        //DISPLAY row of column numbers
//
//        System.out.println("\n | --0-- | --1-- | --2-- | --3-- | --4-- |");
//        for(int i = 0; i < locations.length; i++){
////             DISPLAY row divider
//                System.out.println("--------------------------------");
//
//            String grid = i + "|";
//            for(int j = 0; j<locations[i].length; j++){
//                Location location = locations[i][j];
//
//                   String symbol;
//                   Point currentCoordinates= TreeOfLife.getCurrentGame().getActors().getCoordinates();
//                   Location characterLocation = locations[currentCoordinates.x] [currentCoordinates.y];
//                   Scene scene = new Scene();
//                   if(location == characterLocation) {
//                       symbol = "You Are Here!";
//                   }
//                   else if(scene.isVisited() ) { 
//                       //get current game
//                        
//                       symbol = scene.getMapSymbol();
//                    }
//                    else {
//                       symbol = "?????";
//                    }
////                   DISPLAY column divider
//                     grid += ( " "+ symbol + " |");
//            }
//            System.out.println(grid);
////            System.out.println("|");
//        }
//
//        // DISPLAY ending row divider  
//        System.out.println("--------------------------------");
//        
//       
//        
//        
//        //print out map menu
//    MapView mapView = new MapView(); 
//    mapView.display();
//    }
    
}
