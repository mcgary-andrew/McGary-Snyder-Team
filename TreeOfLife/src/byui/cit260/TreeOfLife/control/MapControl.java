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

    public static Location[][] createMap() {
        //Create a two dimentional of location objects
        Location[][] locations = new Location[5][5];
        
        //Create all of the location objects and assign them to each positon in the locations two dimentional array.
        
        //create a List of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the differen scenes to locations in the map
        MapControl.assignScenesToLocations(locations, scenes);
        
        return locations;        
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void movePlayersToStartLocation(Location location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Location[][] locations, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public static double calcAverageAttributes(double faithValue, double obedienceValue, double knowledgeValue){
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
    public double calcEndLevel(double faithValue, double obedienceValue, double knowledgeValue, double sOfFValue, double sWOfGValue, double bOfRValue){
        if (faithValue > 100 || obedienceValue > 100 || knowledgeValue > 100){
            return -999;
        }
        if (faithValue < 0 || obedienceValue < 0 || knowledgeValue < 0){
            return -999;
        }
        if (sOfFValue > 1 || sWOfGValue > 1 || bOfRValue > 1){
            return -999;
        }
        if (sOfFValue < 0 || sWOfGValue < 0 || bOfRValue < 0){
            return -999;
        }
        else{
            double valueTotal = faithValue + obedienceValue + knowledgeValue;
            double valueAverage = valueTotal / 300;
            double armorTotal = sOfFValue + sWOfGValue + bOfRValue;
            double armorAverage = armorTotal / 3;
            double totalAverage = (valueAverage + armorAverage)/2;
            return totalAverage;
        }  
    }
}
