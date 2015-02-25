/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.InventoryControl;
import java.util.Scanner;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class ArmorMenuView {
    private final String MENU = "\n"
            + "\n-----------------------------------------"
            + "\n| Armor Menu"
            + "\n-----------------------------------------"
            + "\nA - Add Armor Attributes"
            + "\nC - Check Armor Levels"
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
            System.out.println("Armor Menu Selection:");
            
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
            case 'A': // Begin game
                this.addArmorMenu();
                break;
            case 'C': // Help
                this.checkArmor();
                break;
            case 'E': // Exit
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }

    private void addArmorMenu() {
        InventoryControl.addArmorItem(TreeOfLife.getArmorItem());
        
        //display the game menu
        AddArmorMenu addArmorMenu = new AddArmorMenu();
        addArmorMenu.displayMenu();
    }

    private void checkArmor() {
        
    }
    
}
