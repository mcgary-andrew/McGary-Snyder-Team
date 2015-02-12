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
}
