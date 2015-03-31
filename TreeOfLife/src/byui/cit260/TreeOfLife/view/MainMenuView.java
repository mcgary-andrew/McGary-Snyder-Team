/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import treeoflife.TreeOfLife;


/**
 *
 * @author Andrew
 */
public class MainMenuView extends View{
   
    public MainMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu"
            + "\n-----------------------------------------"
            + "\nB - Begin Game"
            + "\nG - Get and Start saved game"
            + "\nH - Help"
            + "\nS - Save"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    }

    @Override
    public void doAction(Object obj) {
        
        char value = (char) obj;
        
        switch (value){
            case 'B': // Begin game
                this.startNewGame();
                break;
            case 'G': // Get and start saved game
                this.startExistingGame();
                break;
            case 'H': // Help
                this.displayHelpMenu();
                break;
            case 'S': //Save
                this.saveGame();
                break;
            case 'E': // Exit
                return;
            default:
                this.console.println("\n*** Invalid Selection ***");
                break;
        }
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(TreeOfLife.getPlayer());
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void startExistingGame() {
        System.out.println("\n\nEnter the file path for the file where the game"
        + "is saved.");
        
        String filePath = this.getInput();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
         }catch (Exception ex) {
             ErrorView.display("MainMenuView", ex.getMessage());
         }
        
       //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void saveGame() {
       System.out.println("\n\nEnter the file path for file where the game"
            + "is to be saved.");
       String filePath = this.getInput();
       
       try{
           //save the game to the specified file
           GameControl.saveGame(TreeOfLife.getCurrentGame(), filePath);
       }catch (Exception ex) {
           ErrorView.display("MainMenuView", ex.getMessage());
       }
    }

    
    
}
