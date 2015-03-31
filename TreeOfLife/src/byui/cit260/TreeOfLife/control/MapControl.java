/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.exceptions.InventoryControlException;
import byui.cit260.TreeOfLife.model.Actors;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Scene;
import byui.cit260.TreeOfLife.model.Map;


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

    public static int movePlayersToStartLocation(Map[][] points) {
        //for every actor
        Actors[] actors = Actors.values();
        
        for (Actors actor : actors){
            Map coordinates = actor.getCoordinates();
            int returnValue = MapControl.moveActorToLocation(actor, coordinates);
        }
        return 0;      
       
    }

    private static void assignScenesToLocations(Location[][] locations, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public static double calcAverageAttributes(double faithValue, double obedienceValue, double knowledgeValue)
                    throws InventoryControlException{
       if (faithValue > 100 || obedienceValue > 100 || knowledgeValue > 100){
	throw new InventoryControlException("Cannot Calculate Average of Attributes "
                                        + "Faith" + faithValue + "," + "Obedience" + obedienceValue + "," + "Knowledge"+ knowledgeValue
                                        + "One of the above Attributes is greater than 100.");
       }
       if (faithValue < 0 || obedienceValue < 0 || knowledgeValue < 0){
	throw new InventoryControlException("Cannot Calculate Average of Attributes "
                                        + "Faith" + faithValue + "," + "Obedience" + obedienceValue + "," + "Knowledge"+ knowledgeValue
                                        + "One of the above Attributes is less than 0.");
       }
       else {
           double valueTotal = faithValue + obedienceValue + knowledgeValue;
           double valueAverage = valueTotal / 3;
           return valueAverage;
       }
       
   }

    private static int moveActorToLocation(Actors actor, Map coordinates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double calcEndLevel(double faithValue, double obedienceValue, double knowledgeValue, double sOfFValue, double sWOfGValue, double bOfRValue)
                    throws InventoryControlException{
        if (faithValue > 100 || obedienceValue > 100 || knowledgeValue > 100){
            throw new InventoryControlException("Cannot Calculate Average of Attributes "
                                        + "Faith" + faithValue + "," + "Obedience" + obedienceValue + "," + "Knowledge"+ knowledgeValue
                                        + "One of the above Attributes is greater than 100.");
        }
        if (faithValue < 0 || obedienceValue < 0 || knowledgeValue < 0){
            throw new InventoryControlException("Cannot Calculate Average of Attributes "
                                        + "Faith" + faithValue + "," + "Obedience" + obedienceValue + "," + "Knowledge"+ knowledgeValue
                                        + "One of the above Attributes is less than 0.");
        }
        if (sOfFValue > 1 || sWOfGValue > 1 || bOfRValue > 1){
            throw new InventoryControlException("Cannot Calculate Average of Attributes "
                                        + "Shield of Faith" + sOfFValue + "," + "Sword of God" + sWOfGValue + "," + "Breastplate of Righteousness"+ bOfRValue
                                        + "One of the above Armor Items is greater than 1.");
        }
        if (sOfFValue < 0 || sWOfGValue < 0 || bOfRValue < 0){
                        throw new InventoryControlException("Cannot Calculate Average of Attributes "
                                        + "Shield of Faith" + sOfFValue + "," + "Sword of God" + sWOfGValue + "," + "Breastplate of Righteousness"+ bOfRValue
                                        + "One of the above Armor Items is less than 0.");

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
