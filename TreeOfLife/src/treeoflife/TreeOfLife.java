/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeoflife;

import byui.cit260.TreeOfLife.view.StartProgramView;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.model.ArmorPiece;
import byui.cit260.TreeOfLife.model.ArmorItem;


/**
 *
 * @author Andrew
 */
public class TreeOfLife {

//    private static Game currentGame = null;

//    public static Game getCurrentGame() {
//        return currentGame;
//    }
//
//    public static void setCurrentGame(Game currentGame) {
//        TreeOfLife.currentGame = currentGame;
//    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TreeOfLife.player = player;
    }
    
    public static ArmorItem getArmorItem() {
        return armorItem;
    }

    public static void setArmorItem(ArmorItem armorItem) {
        TreeOfLife.armorItem = armorItem;
    }
    public static Player player = null;
    
    public static ArmorItem armorItem = null;
    
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Player playerThree = new Player();
        
//        playerOne.setPlayerName("Lehi");
//        playerOne.setKnowledge(100);
//        playerOne.setObedience(100);
//        playerOne.setFaith(100);
//        
//        playerTwo.setPlayerName("Nehpi");
//        playerTwo.setObedience(80);
//        playerTwo.setKnowledge(50);
//        playerTwo.setFaith(100);
//        
//        playerThree.setPlayerName("Sam");
//        playerThree.setObedience(50);
//        playerThree.setKnowledge(20);
//        playerThree.setFaith(30);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
//        ArmorPiece armorOne = new ArmorPiece();
        ArmorPiece armorTwo = new ArmorPiece();
        ArmorPiece armorThree = new ArmorPiece();
        ArmorPiece armorFour = new ArmorPiece();
        ArmorItem armorItemOne = new ArmorItem();
        ArmorItem armorItemTwo = new ArmorItem();

        
//        armorOne.setArmorPieceName("Helmet of Salvation");
//        armorOne.setFaithRequired(110);
//        armorOne.setKnowledgeRequired(100);
//        armorOne.setObedienceRequired(90);
        
        
        armorTwo.setArmorPieceName("Shield of Faith");
        armorTwo.setFaithRequired(90);
        armorItemOne.setArmorAbility(10);
        armorItemTwo.setArmorCost(5);
        
        armorThree.setArmorPieceName("Sword - spirit/word of God");
        armorThree.setKnowledgeRequired(90);
        armorItemOne.setArmorAbility(10);
        armorItemTwo.setArmorCost(5);
        
        armorFour.setArmorPieceName("Breastplate of Righteousness");
        armorFour.setObedienceRequired(90);
        armorItemOne.setArmorAbility(10);
        armorItemTwo.setArmorCost(5);
        
    } 
}
