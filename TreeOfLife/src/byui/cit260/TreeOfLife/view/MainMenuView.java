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
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu"
            + "\n-----------------------------------------"
            + "\nB - Begin Game"
            + "\nH - Help"
            + "\nS - Save"
            + "\nE - Exit"
            + "\n-----------------------------------------";


    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput();//get the user's selection
            selection = input.charAt(0);//get the first character of string
            
            this.doAction(selection); //do action based on selection
            
            }while (selection != 'E'); // a selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; // indicates if the selection has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){//while a valid selection has not been retrieved
            
            //prompt for the selection
            System.out.println("Main Menu Selection:");
            
            //get the name from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            //if the name is invalid (less than two characters in length))
            if (selection.length() > 1){
                System.out.println("Invalid selection");
                continue; //and repeats again
                }
            break; //out of the (exit) the repetition
        }
        
        return selection; // return the name
    }

    private void doAction(char selection) {

        switch (selection){
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
        gameMenu.displayMenu();
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
       System.out.println("*** startExistingGame function called ***");
    }
    
}
