/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Andrew
 */
public class ArmorReportView {
    
    private static final PrintWriter armorReport = null;
    private static PrintWriter logFile = null;
    private static PrintWriter outFile = null;
    private static final PrintWriter inFile = null;
    
   
    public static void ArmorReport(){
        try{
            logFile = logFile;
                new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            
        String filePath = "log.txt";
        logFile = new PrintWriter(filePath);
        
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();
        }
        
        finally {
            //try {
                if (inFile != null)
                    inFile.close();
                
                if (outFile != null)
                    outFile.close();
                
                if (logFile != null)
                    logFile.close();
                
                if (armorReport != null)
                armorReport.close();
                
            //}  // catch (IOException ex) {
                //System.out.println("Error closing files");
                //return;
           // } 
        }
    
    }

    public static PrintWriter getInFile() {
        return inFile;
    }

    public static void setInFile(PrintWriter inFile) {
        inFile = inFile;
    }

    public static PrintWriter getArmorReport() {
        return armorReport;
    }

    public static void setArmorReport(PrintWriter armorReport) {
        armorReport = armorReport;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        outFile = outFile;
    }
}
