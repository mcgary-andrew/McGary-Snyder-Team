/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import byui.cit260.TreeOfLife.model.ArmorPiece;

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
            + "\nR - Armor Report"
            + "\nE - Exit"
            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        
        char value = (char) obj;
        
        switch (value){
            case 'A': // Begin game
                this.addArmorMenu();
                break;
            case 'C': // Help
                this.checkArmor();
                break;
            case 'R':
                this.armorReport();
                break;
            case 'E': // Exit
                return false;
            default:
                this.console.println("\n*** Invalid Selection ***");
                break;
        }
        return true;
    }

    private void addArmorMenu() {
        
        
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

    private void armorReport() {
        ArmorReportView armorrpt = new ArmorReportView();
    }
}

