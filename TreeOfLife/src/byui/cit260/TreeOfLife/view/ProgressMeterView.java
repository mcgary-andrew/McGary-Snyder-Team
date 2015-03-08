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
public class ProgressMeterView extends View {


    public String characterLevels = "";
    
    public String viewArmorObtained(){
    String armorObtained = "";
    return armorObtained; 
    }
    
    public String viewCharacterLevels(){
        String characterLevels = "";
        return characterLevels; 
    }
    
    public ProgressMeterView(){
    super("\n"
            + "\n-----------------------------------------"
            + "\n Progress Meter"
            + "\n-----------------------------------------"
            + "\n" + viewCharacterLevels()
            + "\n" + viewArmorObtained()
            + "\nA - Go to armor shop"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    }
    
    
 @Override
    public void doAction(Object obj) {
        
        char value = (char) obj;
        
        switch (value){
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
    

    
}