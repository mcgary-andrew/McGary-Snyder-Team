/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.Actors;
import java.util.Scanner;
import treeoflife.TreeOfLife;

/**
 *
 * @author Krystal
 */
public class ActorMenuView extends View {
    public ActorMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Select Your Character"
            + "\n-----------------------------------------"
            + "\nL - Lehi"
            + "\nN - Nephi"
            + "\nS - Sam"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    }
    
    
 @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        switch (value){
            case "L": // Lehi
                this.createActor("L");
                break;
            case "S": // Sam
                this.createActor("S");
                break;
            case "N": //Nephi
                this.createActor("N");
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

    private void createActor(String actor) {
        if (actor == "L") {
            TreeOfLife.currentGame.setActors(Actors.getLehi());
            TreeOfLife.currentGame.setFaith(5);
            TreeOfLife.currentGame.setKnowledge(10);
            TreeOfLife.currentGame.setObedience(5);
        }
        else if (actor == "S"){
            TreeOfLife.currentGame.setActors(Actors.getSam());
            TreeOfLife.currentGame.setFaith(5);
            TreeOfLife.currentGame.setKnowledge(5);
            TreeOfLife.currentGame.setObedience(10);
        }
        else if (actor == "N"){
            TreeOfLife.currentGame.setActors(Actors.getNephi());
            TreeOfLife.currentGame.setFaith(10);
            TreeOfLife.currentGame.setKnowledge(5);
            TreeOfLife.currentGame.setObedience(5);
        }
        ActorReportView ARView = new ActorReportView();
        ARView.display();
    }

}
