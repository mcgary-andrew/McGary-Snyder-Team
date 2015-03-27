/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import treeoflife.TreeOfLife;

/**
 *
 * @author Krystal
 */
public abstract class  View implements ViewInterface {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = TreeOfLife.getInFile();
    protected final PrintWriter console = TreeOfLife.getOutFile();
    

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    
    public View() {
    }

 
    @Override 
    public void display() {
        
        char value;
        do {
            this.console.println(this.promptMessage); //display the main menu
            
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
        try{
        while(!valid){//while a valid selection has not been retrieved
            
            //prompt for the selection
            this.console.println("Main Menu Selection:");
            
            //get the name from the keyboard and trim off the blanks
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            //if the name is invalid (less than two characters in length))
            if (selection.length() > 1){
                this.console.println("Invalid selection");
                continue; //and repeats again
                }
            break; //out of the (exit) the repetition
        }
        } catch (Exception e) {
                this.console.println("Error reading input: " + e.getMessage());
                }
        
        return selection; // return the name
    }
}
