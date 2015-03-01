/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import java.util.Scanner;

/**
 *
 * @author Krystal
 */
public class ProgressMeterView {


public String characterLevels = "";    
    
private final String MENU = "\n"
            + "\n-----------------------------------------"
            + "\n Progress Meter"
            + "\n-----------------------------------------"
            + "\n" + viewCharacterLevels()
            + "\n" + viewArmorObtained()
            + "\nA - Go to armor shop"
            + "\nE - Exit"
            + "\n-----------------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do{
            System.out.println(MENU);
            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        } 
        while (selection != 'E');
    }
    
    private String getInput() {
        boolean valid = false; // indicates if the selection has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){//while a valid selection has not been retrieved
            
            //prompt for the selection
            System.out.println("Select your choice:");
            
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
        
        return selection; // return the selection
    }
    
    private void doAction(char selection) {
        switch (selection){
            case 'A': // Faith, Knowledge and Obedience Level
                AddArmorMenu armorMenu = new AddArmorMenu();
                break;
            case 'E': // Exit
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }
    
    private String viewArmorObtained(){
        String armorObtained = "";
        return armorObtained; 
    }
    
    private String viewCharacterLevels(){
        String characterLevels = "";
        return characterLevels; 
    }
    
}