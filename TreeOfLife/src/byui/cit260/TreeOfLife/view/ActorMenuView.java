/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.Actors;
import java.util.Scanner;

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
    public void doAction(Object obj) {
        
        char value = (char) obj;
        
        switch (value){
            case 'L': // Lehi
                this.createLehi('L');
                break;
            case 'S': // Sam
                this.createSam('S');
                break;
            case 'N': //Nephi
                this.createNephi('N');
                break;
            case 'E': // Exit
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
        
        
    } 

    private void createLehi(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void createNephi(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void createSam(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
