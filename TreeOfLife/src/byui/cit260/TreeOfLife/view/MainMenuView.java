/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.GameControl;
import java.util.Scanner;
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
            case 'H': // Help
                this.displayHelpMenu();
                break;
            case 'S': //Save
                this.saveGame();
                break;
            case 'E': // Exit
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }

    private void startNewGame() {
        GameControl.createNewGame(TreeOfLife.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void saveGame() {
       System.out.println("*** startExistingGame function called ***");
    }
    
}
