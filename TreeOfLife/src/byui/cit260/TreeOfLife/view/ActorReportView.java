/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

//import java.io.BufferedReader;

import byui.cit260.TreeOfLife.model.Actors;
import treeoflife.TreeOfLife;

//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;

/**
 *
 * @author krystalsnyder
 */
public class ActorReportView extends View {
    
public ActorReportView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n Actor Report"    
            + "\n-----------------------------------------"
            + "\nActor = " + TreeOfLife.currentGame.getActors().name()
            + "\nDescription = " + TreeOfLife.currentGame.getActors().getDescription()
            + "\nFaith = " + TreeOfLife.currentGame.getFaith()
            + "\nObedience = " + TreeOfLife.currentGame.getObedience()            
            + "\nKnowledge = " + TreeOfLife.currentGame.getKnowledge()
            + "\n-----------------------------------------"
            + "\nE - Exit to Game Menu"
            + "\n-----------------------------------------");
    }

@Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        switch (value){
            case "E": // Exit
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
                break;
            default:
                this.console.println("\n*** Invalid Selection ***");
                break;
        }
        
        return true;
    }

//    private static PrintWriter actorReport = null;
//    private static PrintWriter logFile = null;
//    private static PrintWriter outFile = null;
//    private static PrintWriter inFile = null;
//    
//   
//    public static void ActorReportView(){
//        try{
//            ActorReportView.logFile = logFile;
//                new BufferedReader(new InputStreamReader(System.in));
//            ActorReportView.outFile = new PrintWriter(System.out, true);
//            
//        String filePath = "log.txt";
//        ActorReportView.logFile = new PrintWriter(filePath);
//        
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.toString() +
//                                "\nCause: " + e.getCause() +
//                                "\nMessage: " + e.getMessage());
//            e.printStackTrace();
//        }
//        
//        finally {
//            //try {
//                if (ActorReportView.inFile != null)
//                    ActorReportView.inFile.close();
//                
//                if (ActorReportView.outFile != null)
//                    ActorReportView.outFile.close();
//                
//                if (ActorReportView.logFile != null)
//                    ActorReportView.logFile.close();
//                
//                if (ActorReportView.actorReport != null)
//                ActorReportView.actorReport.close();
//                
//            //}  // catch (IOException ex) {
//                //System.out.println("Error closing files");
//                //return;
//           // } 
//        }
//    
//    }
//
//    public static PrintWriter getInFile() {
//        return inFile;
//    }
//
//    public static void setInFile(PrintWriter inFile) {
//        ActorReportView.inFile = inFile;
//    }
//
//    public static PrintWriter getActorReport() {
//        return actorReport;
//    }
//
//    public static void setActorReport(PrintWriter actorReport) {
//        ActorReportView.actorReport = actorReport;
//    }
//
//    public static PrintWriter getLogFile() {
//        return logFile;
//    }
//
//    public static void setLogFile(PrintWriter logFile) {
//        ActorReportView.logFile = logFile;
//    }
//
//    public static PrintWriter getOutFile() {
//        return outFile;
//    }
//
//    public static void setOutFile(PrintWriter outFile) {
//        ActorReportView.outFile = outFile;
//    }
    
    
}
