/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.exceptions.InventoryControlException;
import byui.cit260.TreeOfLife.model.ArmorItem;

/**
 *
 * @author Andrew
 */
public class InventoryControl {
    public static void addArmorItem(ArmorItem armorItem){
        System.out.println("\n*** addArmorItem stub function called ***");
    }

    public double calcArmorStatusValue(double faithValue, double obedienceValue, double knowledgeValue) throws InventoryControlException {
        if (faithValue > 100 || obedienceValue > 100 || knowledgeValue > 100) {
            throw new InventoryControlException("Cannot Calculate Average of Attributes " + "Faith" + faithValue + "," + "Obedience" + obedienceValue + "," + "Knowledge" + knowledgeValue + "One of the above Attributes is greater than 100.");
        }
        if (faithValue < 0 || obedienceValue < 0 || knowledgeValue < 0) {
            throw new InventoryControlException("Cannot Calculate Average of Attributes " + "Faith" + faithValue + "," + "Obedience" + obedienceValue + "," + "Knowledge" + knowledgeValue + "One of the above Attributes is less than 0.");
        } else {
            double valueTotal = faithValue + obedienceValue + knowledgeValue;
            double valueAverage = valueTotal / 3;
            return valueAverage;
        }
    }

}
