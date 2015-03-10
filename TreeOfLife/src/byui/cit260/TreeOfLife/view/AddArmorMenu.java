/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.ArmorItem;
import byui.cit260.TreeOfLife.model.ArmorPiece;
import byui.cit260.TreeOfLife.model.Player;
import java.util.Scanner;
import treeoflife.TreeOfLife;
import static treeoflife.TreeOfLife.player;

/**
 *
 * @author Andrew
 */
public class AddArmorMenu extends View {
    public AddArmorMenu() { 
            super("\n"
            + "\n-----------------------------------------"
            + "\n| Add Armor Menu"
            + "\n-----------------------------------------"
            + "\nF - Add Sheild of Faith"
            + "\nS - Add Sword of God"
            + "\nR - Add Breastplate of Righteousness"
            + "\nE - Exit"
            + "\n-----------------------------------------");
            }
   

    @Override
    public void doAction(Object obj) {
        
        char value = (char) obj;
        
        switch (value){
            case 'F': // Begin game
                this.addSofF();
                break;
            case 'S': // Help
                this.addSofG();
                break;
            case 'R': //Save
                this.addBofR();
                break;
            case 'E': // Exit
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }

    private void addSofG() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addBofR() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addSofF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
