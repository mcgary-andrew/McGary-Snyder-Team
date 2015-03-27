/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.view;

import java.io.PrintWriter;
import treeoflife.TreeOfLife;

/**
 *
 * @author Andrew
 */
public class ErrorView {
    private static final PrintWriter errorFile = TreeOfLife.getOutFile();
    private static final PrintWriter logFile = TreeOfLife.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.prinln(
                "---------------------------------------"
                + "\n - ERROR - " + errorMessage
                +"\n--------------------------------------");
        //log error
        logFile.println(className + " - " + errorMessage);
    }
}
