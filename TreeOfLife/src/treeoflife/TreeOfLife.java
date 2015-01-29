/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeoflife;

import byui.cit260.TreeOfLife.model.Player;

/**
 *
 * @author Andrew
 */
public class TreeOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Player playerThree = new Player();
        
        playerOne.setPlayerName("Lehi");
        playerTwo.setPlayerName("Nehpi");
        playerThree.setPlayerName("Sam");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
