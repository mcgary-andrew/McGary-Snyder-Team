/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.CharacterAttributes;
import java.util.Scanner;

/**
 *
 * @author Krystal
 */
public class CharacterMenuView extends View {
    public CharacterMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Select Your Character"
            + "\n-----------------------------------------"
            + "\nL - Laman"
            + "\nN - Nephi"
            + "\nS - Sam"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    }
    
    
 @Override
    public void doAction(Object obj) {
        
        char value = (char) obj;
        
        switch (value){
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
        CharacterAttributes selectedCharacter = new CharacterAttributes();
        
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
            display();
        }
    }
}
