/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

/**
 *
 * @author Andrew
 */
public class MapControl {
   public double calcAverageAttributes(double faithValue, double obedienceValue, double knowledgeValue){
       if (faithValue > 100 || obedienceValue > 100 || knowledgeValue > 100){
	return -999;
       }
       if (faithValue < 0 || obedienceValue < 0 || knowledgeValue < 0){
	return -999;
       }
       else {
           double valueTotal = faithValue + obedienceValue + knowledgeValue;
           double valueAverage = valueTotal / 3;
           return valueAverage;
       }
   }
   public double calcArmorStatusValue(double hOfSValue, double sOfFValue, double sWOfGValue, double bOfRValue){
       if (hOfSValue > 100 || sOfFValue > 100 || sWOfGValue > 100 || bOfRValue > 100){
	return -999;
       }
       if (hOfSValue < 0 || sOfFValue < 0 || sWOfGValue < 0 || bOfRValue < 0){
	return -999;
       }
       else {
           double valueTotal = hOfSValue + sOfFValue + sWOfGValue + bOfRValue;
           double valueAverage = valueTotal / 4;
           return valueAverage;
       }
   }
    public double calcEndLevel(double faithValue, double obedienceValue, double knowledgeValue, double hOfSValue, double sOfFValue, double sWOfGValue, double bOfRValue){
        if (faithValue > 100 || obedienceValue > 100 || knowledgeValue > 100){
            return -999;
        }
        if (faithValue < 0 || obedienceValue < 0 || knowledgeValue < 0){
            return -999;
        }
        if (hOfSValue > 1 || sOfFValue > 1 || sWOfGValue > 1 || bOfRValue > 1){
            return -999;
        }
        if (hOfSValue < 0 || sOfFValue < 0 || sWOfGValue < 0 || bOfRValue < 0){
            return -999;
        }
        else{
            double valueTotal = faithValue + obedienceValue + knowledgeValue;
            double valueAverage = valueTotal / 300;
            double armorTotal = hOfSValue + sOfFValue + sWOfGValue + bOfRValue;
            double armorAverage = armorTotal / 4;
            double totalAverage = (valueAverage + armorAverage)/2;
            return totalAverage;
        }  
    }
}