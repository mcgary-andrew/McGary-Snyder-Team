/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeoflife;

import byui.cit260.TreeOfLife.view.StartProgramView;
import byui.cit260.TreeOfLife.model.ArmorItem;
import byui.cit260.TreeOfLife.model.Game;
import byui.cit260.TreeOfLife.model.Player;
import byui.cit260.TreeOfLife.view.ArmorMenuView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


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
        // create StartProgramView and start the game
        StartProgramView startProgramView = new StartProgramView();
        
        try{
            // open character stream files for end user input and output
            TreeOfLife.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            TreeOfLife.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            TreeOfLife.logFile = new PrintWriter(filePath);
            
            try {
                startProgramView.startProgram();
        
            } catch (Throwable te){
                System.out.println(te.getMessage());
                te.printStackTrace();
                startProgramView.startProgram();
            }
            
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
        
        
        
        
        ArmorMenuView armorMenuView = new ArmorMenuView();
        try {
        armorMenuView.checkArmor();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            armorMenuView.checkArmor();
        }
    }        
} 

