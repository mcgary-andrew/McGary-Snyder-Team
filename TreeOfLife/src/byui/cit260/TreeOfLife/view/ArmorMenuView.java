/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.control.InventoryControl;
import byui.cit260.TreeOfLife.control.MapControl;
import byui.cit260.TreeOfLife.model.ArmorPiece;
import static byui.cit260.TreeOfLife.model.ArmorPiece.Faith;
import java.util.Scanner;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class ArmorMenuView extends View {
    public ArmorMenuView(){
    super("\n"
            + "\n-----------------------------------------"
            + "\n| Armor Menu"
            + "\n-----------------------------------------"
            + "\nA - Add Armor Attributes"
            + "\nC - Check Armor Levels"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    }

    @Override
    public void doAction(Object obj) {
        
        char value = (char) obj;
        
        switch (value){
            case 'A': // Begin game
                this.addArmorMenu();
                break;
            case 'C': // Help
                this.checkArmor();
                break;
            case 'E': // Exit
                return;
            default:
                this.console.println("\n*** Invalid Selection ***");
                break;
        }
    }

    private void addArmorMenu() {
        InventoryControl.addArmorItem(TreeOfLife.getArmorItem());
        
        //display the game menu
        AddArmorMenu addArmorMenu = new AddArmorMenu();
        addArmorMenu.display();
    }

    public void checkArmor(){
        ArmorPiece faithValue = ArmorPiece.Faith;
        ArmorPiece obedienceValue = ArmorPiece.Obedience;
        ArmorPiece knowledgeValue = ArmorPiece.Knowledge;
        //MapControl.calcAverageAttributes(faithValue, obedienceValue, knowledgeValue);
    }
    
}
