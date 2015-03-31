/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeoflife;

import byui.cit260.TreeOfLife.view.StartProgramView;
import byui.cit260.TreeOfLife.model.Actors;
import byui.cit260.TreeOfLife.model.ArmorPiece;
import byui.cit260.TreeOfLife.model.ArmorItem;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.view.ArmorMenuView;
import byui.cit260.TreeOfLife.view.ErrorView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Andrew
 */
public class TreeOfLife {

    private static Game currentGame = null;
    public static Player player = null;
    
    public static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TreeOfLife.logFile = logFile;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TreeOfLife.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TreeOfLife.inFile = inFile;
    }
    

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TreeOfLife.currentGame = currentGame;
    }

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
//    public static Player player = null;
    
    public static ArmorItem armorItem = null;
    
    public static void main(String[] args) {
        
        try{
            // open character stream files for end user input and output
            TreeOfLife.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            TreeOfLife.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            TreeOfLife.logFile = new PrintWriter(filePath);
            
        }catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());
        }
        
        finally{
            try {
                if (TreeOfLife.inFile != null)
                    TreeOfLife.inFile.close();
                
                if (TreeOfLife.outFile != null)
                    TreeOfLife.outFile.close();
                
                if (TreeOfLife.logFile != null)
                    TreeOfLife.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
        
        StartProgramView startProgramView = new StartProgramView();
        try {
        // create StartProgramView and start the game
        startProgramView.startProgram();
        
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.startProgram();
        }
        
        
        ArmorMenuView armorMenuView = new ArmorMenuView();
        try {
        armorMenuView.checkArmor();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            armorMenuView.checkArmor();
        }
    }
        
//        
//        Actors playerOne = new Actors();
//        Actors playerTwo = new Actors();
//        Actors playerThree = new Actors();
//        
////        playerOne.setPlayerName("Lehi");
////        playerOne.setKnowledge(100);
////        playerOne.setObedience(100);
////        playerOne.setFaith(100);
////        
////        playerTwo.setPlayerName("Nehpi");
////        playerTwo.setObedience(80);
////        playerTwo.setKnowledge(50);
////        playerTwo.setFaith(100);
////        
////        playerThree.setPlayerName("Sam");
////        playerThree.setObedience(50);
////        playerThree.setKnowledge(20);
////        playerThree.setFaith(30);
//        
//        String playerInfo = playerOne.toString();
//        this.console.println(playerInfo);
//        
////        ArmorPiece armorOne = new ArmorPiece();
//        ArmorPiece armorTwo = new ArmorPiece();
//        ArmorPiece armorThree = new ArmorPiece();
//        ArmorPiece armorFour = new ArmorPiece();
//        ArmorItem armorItemOne = new ArmorItem();
//        ArmorItem armorItemTwo = new ArmorItem();
//
//        
////        armorOne.setArmorPieceName("Helmet of Salvation");
////        armorOne.setFaithRequired(110);
////        armorOne.setKnowledgeRequired(100);
////        armorOne.setObedienceRequired(90);
//        
//        
//        armorTwo.setArmorPieceName("Shield of Faith");
//        armorTwo.setFaithRequired(90);
//        armorItemOne.setArmorAbility(10);
//        armorItemTwo.setArmorCost(5);
//        
//        armorThree.setArmorPieceName("Sword - spirit/word of God");
//        armorThree.setKnowledgeRequired(90);
//        armorItemOne.setArmorAbility(10);
//        armorItemTwo.setArmorCost(5);
//        
//        armorFour.setArmorPieceName("Breastplate of Righteousness");
//        armorFour.setObedienceRequired(90);
//        armorItemOne.setArmorAbility(10);
//        armorItemTwo.setArmorCost(5);
        
    } 

