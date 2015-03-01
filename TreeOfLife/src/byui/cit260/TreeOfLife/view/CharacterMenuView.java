/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.GameCharacter;
import java.util.Scanner;

/**
 *
 * @author Krystal
 */
public class CharacterMenuView {
    private final String MENU = "\n"
            + "\n-----------------------------------------"
            + "\n| Select Your Character"
            + "\n-----------------------------------------"
            + "\nL - Laman"
            + "\nN - Nephi"
            + "\nS - Sam"
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
            System.out.println("Select Your Character:");
            
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
        
        return selection; // return the character name
    }
    
    private void doAction(char selection) {
        switch (selection){
            case 'L': // Laman
                this.createNewCharacter('L');
                break;
            case 'S': // Sam
                this.createNewCharacter('S');
                break;
            case 'N': //Nephi
                this.createNewCharacter('N');
                break;
            case 'E': // Exit
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }
    
    private void createNewCharacter(char name){
        //create a new character
        GameCharacter selectedCharacter = new GameCharacter();
        
        //set the character attributes
        if (name=='L'){
            selectedCharacter.setName("Laman");
            selectedCharacter.setFaith(0);
            selectedCharacter.setObedience(0);
            selectedCharacter.setKnowledge(15);
        }
        else if (name=='S'){
            selectedCharacter.setName("Sam");
            selectedCharacter.setFaith(5);
            selectedCharacter.setObedience(10);
            selectedCharacter.setKnowledge(0);
        }
        else if (name=='N'){
            selectedCharacter.setName("Nephi");
            selectedCharacter.setFaith(5);
            selectedCharacter.setObedience(5);
            selectedCharacter.setKnowledge(5);
        }
        else{
            System.out.println("\n*** Invalid Selection ***");
            displayMenu();
        }
    }
}
