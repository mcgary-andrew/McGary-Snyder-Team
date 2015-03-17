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
        ArmorPiece[] armorPiece = GameControl.createArmorPiece();
        game.setArmorPiece(ArmorPiece);
        
        Location location = MapControl.createMap();
        game.setMap(map); //save map in game
        
        //move players to starting position in the map
        MapControl.movePlayersToStartLocation(map);
    }

    private static ArmorPiece[] createArmorPiece() {
          ArmorPiece[] armor =
                new ArmorPiece[Constants.2];
        
        ArmorPiece SofG = new ArmorPiece();
        SofG.setDescription("Sword of God");
        SofG.setQuantityInStock(0);
        SofG.setRequriedAmount(0);
        armor[Item.SofG.ordinal()] = SofG;
        
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
