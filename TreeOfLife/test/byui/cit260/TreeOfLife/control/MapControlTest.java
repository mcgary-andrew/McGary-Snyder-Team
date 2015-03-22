/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.exceptions.MapControlException;
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
     * @throws byui.cit260.TreeOfLife.exceptions.MapControlException
     */
    @Test
    public void testCalcAverageAttributes() throws MapControlException {
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
        double result = MapControl.calcAverageAttributes(faithValue, obedienceValue, knowledgeValue);
        
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
        result = MapControl.calcAverageAttributes(faithValue, obedienceValue, knowledgeValue);
        
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
    public void testCalcArmorStatusValue() throws MapControlException {
        System.out.println("calcArmorStatusValue");
        /*****************
         * Test Case #1
         *****************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double sOfFValue = 100;
        double sWOfGValue = 100;
        double bOfRValue = 100;
        
        double expResult = 100; //expected output returned value
        
        //create instance of MapControl class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcArmorStatusValue(sOfFValue, sWOfGValue, bOfRValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*****************
         * Test Case #2
         *****************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        sOfFValue = 100;
        sWOfGValue = 0;
        bOfRValue = 0;
        
        expResult = -999; //expected output returned value
        
        //call function to run test
        result = instance.calcArmorStatusValue(sOfFValue, sWOfGValue, bOfRValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*****************
         * Test Case #3
         *****************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        sOfFValue = 0;
        sWOfGValue = 100;
        bOfRValue = 0;
        
        expResult = -999; //expected output returned value
        
        //call function to run test
        result = instance.calcArmorStatusValue(sOfFValue, sWOfGValue, bOfRValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*****************
         * Test Case #4
         *****************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        sOfFValue = 0;
        sWOfGValue = 0;
        bOfRValue = 100;
        
        expResult = -999; //expected output returned value
        
        //call function to run test
        result = instance.calcArmorStatusValue(sOfFValue, sWOfGValue, bOfRValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calcEndLevel method, of class MapControl.
     */
    @Test
    public void testCalcEndLevel() throws MapControlException {
        System.out.println("calcEndLevel");
        /*****************
        * Test Case #1
        ******************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double faithValue = 100.0;
        double obedienceValue = 60.0;
        double knowledgeValue = 70.0;
        double sOfFValue = 0.0;
        double sWOfGValue = 1.0;
        double bOfRValue = 0.0;
        
        double expResult = ((230.0/300.0)+(2.0/4.0))/2.0;
        
        // create instance of MapControl class
        MapControl instance = new MapControl();
        
        // call function to run test
        double result = instance.calcEndLevel(faithValue, obedienceValue, knowledgeValue, sOfFValue, sWOfGValue, bOfRValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************
        * Test Case #2
        ******************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        faithValue = -20.0;
        obedienceValue = 40.0;
        knowledgeValue = 80.0;
        sOfFValue = 1.0;
        sWOfGValue = 1.0;
        bOfRValue = 1.0;
        
        expResult = -999;
              
        // call function to run test
        result = instance.calcEndLevel(faithValue, obedienceValue, knowledgeValue, sOfFValue, sWOfGValue, bOfRValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.00001);
        
        /*****************
        * Test Case #3
        ******************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        faithValue = 153.0;
        obedienceValue = 74.0;
        knowledgeValue = 50.0;
        sOfFValue = 0.0;
        sWOfGValue = 0.0;
        bOfRValue = 0.0;
        
        expResult = -999;
              
        // call function to run test
        result = instance.calcEndLevel(faithValue, obedienceValue, knowledgeValue, sOfFValue, sWOfGValue, bOfRValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.00001);
        
        /*****************
        * Test Case #4
        ******************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        faithValue = 90.0;
        obedienceValue = 60.0;
        knowledgeValue = 45.0;
        sOfFValue = -1.0;
        sWOfGValue = 1.0;
        bOfRValue = 1.0;
        
        expResult = -999;
              
        // call function to run test
        result = instance.calcEndLevel(faithValue, obedienceValue, knowledgeValue, sOfFValue, sWOfGValue, bOfRValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /*****************
        * Test Case #5
        ******************/
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        faithValue = 100.0;
        obedienceValue = 74.0;
        knowledgeValue = 50.0;
        sOfFValue = -1.0;
        sWOfGValue = 1.0;
        bOfRValue = 1.0;
        
        expResult = -999;
              
        // call function to run test
        result = instance.calcEndLevel(faithValue, obedienceValue, knowledgeValue, sOfFValue, sWOfGValue, bOfRValue);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.00001);
    }
    
}
    
