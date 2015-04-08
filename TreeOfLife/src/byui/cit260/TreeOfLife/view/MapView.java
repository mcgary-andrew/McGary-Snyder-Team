/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.Question;
import java.io.PrintWriter;

/**
 *
 * @author Andrew
 */
public class MapView extends View {

    MapView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Level Menu"
            + "\n-----------------------------------------"
            + "\nA - Answer Question"
            + "\nG - Game Menu"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        
        switch (value){
            case "A": // Lehi
                Question question = new Question();
                question.getQuestion();
                break;
            case "G": // Sam
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
    
}
