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

    static ArmorPiece[] createArmorPiece() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    private static class createArmorPiece{

        public createArmorPiece() {
        
            ArmorPiece[] armorPiece = new ArmorPiece[2];
        
            armorPiece SofG = new createArmorPiece();
            SofG.setDescription("Sword of God");
            SofG.setQuantityInStock(0);
            SofG.setRequriedAmount(0);
            armorPiece[Item.SofG.ordinal()] = SofG;

            ArmorPiece BofR = new ArmorPiece();
            BofR.setDescription("Breastplate of Righteousness");
            BofR.setQuantityInStock(0);
            BofR.setRequriedAmount(0);
            armor[Item.BofR.ordinal()] = BofR;

            ArmorPiece SofF = new ArmorPiece();
            SofF.setDescription("Sheild of Faith");
            SofF.setQuantityInStock(0);
            SofF.setRequriedAmount(0);
            armor[Item.SofF.ordinal()] = SofF;

            return armor;
        }
    }
}
