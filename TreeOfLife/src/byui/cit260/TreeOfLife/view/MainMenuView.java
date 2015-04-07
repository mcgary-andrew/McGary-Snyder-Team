/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private void startNewGame() {
        try {
            //create a new game
            GameControl.createNewGame(TreeOfLife.getPlayer());
        } catch (MapControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for the file where the game"
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
       this.console.println("\n\nEnter the file path for file where the game"
            + "is to be saved.");
       String filePath = this.getInput();
       
       try{
           //save the game to the specified file
           GameControl.saveGame(TreeOfLife.getCurrentGame(), filePath);
       }catch (Exception ex) {
           ErrorView.display("MainMenuView", ex.getMessage());
       }
    }
   @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'B':
                this.startNewGame();// Begin game
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
                System.exit(0);
            default:
                this.console.println("\n*** Invalid Selection ***");
                break;
        }
        return true;
        }
}
