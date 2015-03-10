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
public abstract class  View implements ViewInterface {
    
    private String promptMessage;

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

 
    @Override 
    public void display() {
        
        char value;
        do {
            System.out.println(this.promptMessage); //display the main menu
            
            String input; 
            input = this.getInput();//get the user's selection
            value = input.charAt(0);//get the first character of string
            
            this.doAction(value); //do action based on selection
            
        }
            while (value != 'E'); // a selection is not "Exit"
    }

    @Override    
    public String getInput() {
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
}
