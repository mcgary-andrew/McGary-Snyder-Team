/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.ArmorPiece;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Player;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class GameControl {
    
    public static void createNewGame(Player player){
        Game game = new Game(); //create new game
        TreeOfLife.setCurrentGame(game); //save in TreeOfLife
        
        game.setPlayer(player); //save player in game
        
        //create the inventory list and save in the game
        ArmorPiece[] armorPiece = InventoryControl.createArmorPiece();
        game.setArmorPiece(ArmorPiece);
        
        Location location = MapControl.createMap();
        game.setLocation(location); //save map in game
        
        //move players to starting position in the map
        MapControl.movePlayersToStartLocation(location);
    }
}