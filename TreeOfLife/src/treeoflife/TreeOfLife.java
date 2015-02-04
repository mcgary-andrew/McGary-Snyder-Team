/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeoflife;

import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.model.ArmorPiece;
import byui.cit260.TreeOfLife.model.ArmorItem;



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
        playerOne.setKnowledge(1000);
        playerOne.setObedience(1000);
        playerOne.setFaith(1000);
        
        playerTwo.setPlayerName("Nehpi");
        playerTwo.setObedience(800);
        playerTwo.setKnowledge(500);
        playerTwo.setFaith(1000);
        
        playerThree.setPlayerName("Sam");
        playerThree.setObedience(500);
        playerThree.setKnowledge(200);
        playerThree.setFaith(300);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        ArmorPiece armorOne = new ArmorPiece();
        ArmorPiece armorTwo = new ArmorPiece();
        ArmorPiece armorThree = new ArmorPiece();
        ArmorPiece armorFour = new ArmorPiece();
        ArmorItem armorItemOne = new ArmorItem();
        ArmorItem armorItemTwo = new ArmorItem();

        
        armorOne.setArmorPieceName("Helmet of Salvation");
        armorOne.setFaithRequired(1100);
        armorOne.setKnowledgeRequired(1000);
        armorOne.setObedienceRequired(900);
        
        
        armorTwo.setArmorPieceName("Shield of Faith");
        armorTwo.setFaithRequired(900);
        
        armorThree.setArmorPieceName("Sword - spirit/word of God");
        armorThree.setKnowledgeRequired(900);
        
        armorFour.setArmorPieceName("Breastplate of Righteousness");
        armorFour.setObedienceRequired(900);
        
        
    }
    
}
