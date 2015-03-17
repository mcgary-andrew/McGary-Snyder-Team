/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.model.Player;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class ProgramControl {

    public static Player createPlayer(String Player) {
        if (Player == null){
            return null;
        }
        
        Player player = new Player();
        playerName.getPlayerName(playerName);
        
        TreeOfLife.setPlayer(player);
        
        return player;
    }
    
}
