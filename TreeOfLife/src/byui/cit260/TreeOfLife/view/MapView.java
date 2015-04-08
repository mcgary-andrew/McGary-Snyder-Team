/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Question;
import byui.cit260.TreeOfLife.model.QuestionArray;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class MapView extends View {

    MapView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Location Menu"
            + "\n-----------------------------------------"
            + "\nA - Answer Question"
            + "\nG - Game Menu"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    } 

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
                
        switch (value){
            case "A": // Answer Question
               LocationView locationView = null;
        try {
            locationView = new LocationView();
        } catch (MapControlException ex) {
            Logger.getLogger(MapView.class.getName()).log(Level.SEVERE, null, ex);
        }
               locationView.display();
                return true;
            case "G": // Go to game menu
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;
            case "E": // Exit
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
            default:
                this.console.println("\n*** Invalid Selection ***");
                break;
        }
        
        return true;
    }
    private void answerLocationQuestion() {
        
        QuestionArray locationQuestion = new QuestionArray();
        
        }
    private String locationQuestionInput() {
        boolean valid = false; //indicates if the input has been recieved
        String response = "";
        try {
            while (!valid) { //while valid string
                  response = this.keyboard.readLine();
            break; //out of the (exit) the repitition
            }

        } catch (Exception e) { //program said it was IOException
             ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return response; 

    }
}
