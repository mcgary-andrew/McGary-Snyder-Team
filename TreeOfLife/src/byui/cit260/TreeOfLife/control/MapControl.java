/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.exceptions.InventoryControlException;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.Actors;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Scene;
import byui.cit260.TreeOfLife.model.Map;
import java.awt.image.BufferedImage;
import treeoflife.TreeOfLife;


/**
 *
 * @author Andrew
 */
public class MapControl {
    

    public static Location[][] createMap(Map map) throws MapControlException {
        //Create a two dimentional of location objects
        Location[][] locations = new Location[5][5];
        
        //create a List of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        MapControl.assignScenesToLocations(map, scenes);
        
        return locations;        
    }
    private enum SceneType{
        start,
        desert,
        building,
        river,
        path,
        tree,
        finish
    }
    private static Scene[] createScenes() throws MapControlException {
        BufferedImage image = null;
        
        Game game = TreeOfLife.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\nAnd we did come to the land which was called Bountiful,"
                + "because of its much fruit and also wild honey; and all"
                + "these things were perpared of the Lord that we might not"
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
//        ImageIcon startingSceneImage = MapControl.getImage(startingScene, 
//                "/citbyui/cit260/treeoflife/images/startingPoint.jpg");
//        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene desertScene = new Scene();
        desertScene.setDescription(
                "\tLevel 2: Desert");
        desertScene.setMapSymbol(" D ");
        desertScene.setBlocked(false);
//        ImageIcon startingSceneImage = MapControl.getImage(startingScene, 
//                "/citbyui/cit260/treeoflife/images/startingPoint.jpg");
//        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.desert.ordinal()] = desertScene;
        
        Scene buildingScene = new Scene();
        buildingScene.setDescription(
                "\tLevel 3: Great and Spacious Building");
        buildingScene.setMapSymbol(" B ");
        buildingScene.setBlocked(false);
//        ImageIcon startingSceneImage = MapControl.getImage(startingScene, 
//                "/citbyui/cit260/treeoflife/images/startingPoint.jpg");
//        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.building.ordinal()] = buildingScene;
        
        Scene riverScene = new Scene();
        riverScene.setDescription(
                "\tLevel 4: River");
        riverScene.setMapSymbol(" R ");
        riverScene.setBlocked(false);
//        ImageIcon startingSceneImage = MapControl.getImage(startingScene, 
//                "/citbyui/cit260/treeoflife/images/startingPoint.jpg");
//        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.river.ordinal()] = riverScene;
        
        Scene pathScene = new Scene();
        pathScene.setDescription(
                "\tLevel 5: Path to the Tree Of Life");
        pathScene.setMapSymbol(" P ");
        pathScene.setBlocked(false);
//        ImageIcon startingSceneImage = MapControl.getImage(startingScene, 
//                "/citbyui/cit260/treeoflife/images/startingPoint.jpg");
//        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.path.ordinal()] = pathScene;
        
        Scene treeScene = new Scene();
        treeScene.setDescription(
                "\tLevel 6: Tree If Life");
        treeScene.setMapSymbol(" T ");
        treeScene.setBlocked(false);
//        ImageIcon startingSceneImage = MapControl.getImage(startingScene, 
//                "/citbyui/cit260/treeoflife/images/startingPoint.jpg");
//        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.tree.ordinal()] = treeScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\nCongratulations! Well done thou good and faithful servant. "
                        + "You have made it to the Tree of Life!");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(true);
//        ImageIcon finishSceneImage = MapControl.getImage(finishScene, 
//                "/citbyui/cit260/treeoflife/images/finish.jpg");
//        finishScene.setIcon(finishSceneImage);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }
    
    public static int movePlayersToStartLocation(Map map) throws MapControlException {
        //for every actor
        Actors[] actors = Actors.values();
        
        for (Actors actor : actors){
            Map coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
        }
        return 0;      
       
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.building.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.building.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.river.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.river.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.path.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.path.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.tree.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.tree.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.tree.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.tree.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
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

   private static int moveActorToLocation(Actors actor, Map coordinates) throws MapControlException {
//        Map map = TreeOfLife.getCurrentGame().getMap();
//
//        actor.getCoordinates().x = coordinates.x;
//        actor.getCoordinates().y = coordinates.y;
//        //set location as visited
//        Location location = map.getLocations()[coordinates.x][coordinates.y];
//        location.setVisited(true);
//         //if moves to new level then setCurrentLevel
//        MapControl setLevel = new MapControl();
//        setLevel.setCurrentLevel(location);
//
    return 0;
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
