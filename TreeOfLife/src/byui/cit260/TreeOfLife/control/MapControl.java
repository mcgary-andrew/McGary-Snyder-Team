/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Scene;

/**
 *
 * @author Andrew
 */
public class MapControl {

    public static Location createMap() {
        Location location = new Location(20, 20);
               
        //create a List of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the differen scenes to locations in the map
        assignScenesToLocation(location, scenes);
        
        return location;        
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
