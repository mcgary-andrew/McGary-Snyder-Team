/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcAverageAttributes method, of class MapControl.
     */
    @Test
    public void testCalcAverageAttributes() {
        System.out.println("calcAverageAttributes");
        /*****************
         * Test Case #1
         *****************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double faithValue = 100;
        double obedienceValue = 60;
        double knowledgeValue = 70;
        
        double expResult = 76.66; //expected output returned value
        
        //create instance of MapControl class
        MapControl instance = new MapControl();
        
        //call function to run test
        double result = instance.calcAverageAttributes(faithValue, obedienceValue, knowledgeValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*****************
         * Test Case #2
         *****************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        faithValue = -20;
        obedienceValue = 40;
        knowledgeValue = 80;
        
        expResult = -999; //expected output returned value
        
        //call function to run test
        result = instance.calcAverageAttributes(faithValue, obedienceValue, knowledgeValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*****************
         * Test Case #3
         *****************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        faithValue = 90;
        obedienceValue = -60;
        knowledgeValue = 45;
        
        expResult = -999; //expected output returned value
        
        //call function to run test
        result = instance.calcAverageAttributes(faithValue, obedienceValue, knowledgeValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*****************
         * Test Case #4
         *****************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        faithValue = 153;
        obedienceValue = 74;
        knowledgeValue = 50;
        
        expResult = -999; //expected output returned value
        
        //call function to run test
        result = instance.calcAverageAttributes(faithValue, obedienceValue, knowledgeValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
    }
    
}
