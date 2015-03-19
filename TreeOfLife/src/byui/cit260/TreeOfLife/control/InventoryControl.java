/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.ArmorItem;
import byui.cit260.TreeOfLife.model.ArmorPiece;

/**
 *
 * @author Andrew
 */
public class InventoryControl {
    public static void addArmorItem(ArmorItem armorItem){
        System.out.println("\n*** addArmorItem stub function called ***");
    }

    public double calcArmorStatusValue(double faith, double obedience, double knowledge){
       if (faith > 100 || obedience > 100 || knowledge > 100){
	return -999;
       }
       if (faith < 0 || obedience < 0 || knowledge < 0){
	return -999;
       }
       else {
           double valueTotal = faith + obedience + knowledge;
           double valueAverage = valueTotal / 3;
           return valueAverage;
       }
    }
}
