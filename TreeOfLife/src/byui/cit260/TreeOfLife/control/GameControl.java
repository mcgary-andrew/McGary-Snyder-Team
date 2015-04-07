/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.exceptions.GameControlException;
import byui.cit260.TreeOfLife.exceptions.MapControlException;
import byui.cit260.TreeOfLife.model.ArmorPiece;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Location;
import byui.cit260.TreeOfLife.model.Map;
import byui.cit260.TreeOfLife.model.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class GameControl {
    
    public static void createNewGame(Player player) throws MapControlException{
        Game game = new Game(); //create new game
        TreeOfLife.setCurrentGame(game); //save in TreeOfLife
        
        game.setPlayer(player); //save player in game
        
        //create the inventory list and save in the game
        ArmorPiece[] armorPieces = new ArmorPiece[3];
        game.setArmorPieces(armorPieces);
        
        //open ActorMenu
        
        
//        Location[][] locations = MapControl.createMap();
//        game.setLocation(locations); //save map in game
      
        //move players to starting position in the map
        //MapControl.movePlayersToStartLocation(Map[1][1]);
    }

    public static void saveGame(Game game, String filePath) 
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(IOException e){
            throw new GameControlException(e.getMessage());
        }
    }
    public static void getSavedGame(String filepath)
        throws GameControlException {
        Game game = null;
        try( FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); //read the game object from file
        }
        catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
        
        //close the output file
        TreeOfLife.setCurrentGame(game); //save in TreeOfLife
    }

}
