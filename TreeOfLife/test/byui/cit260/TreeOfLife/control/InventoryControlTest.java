/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.control;

import byui.cit260.TreeOfLife.exceptions.InventoryControlException;
import byui.cit260.TreeOfLife.model.ArmorItem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of addArmorItem method, of class InventoryControl.
     */
    @Test
    public void testAddArmorItem() {
        System.out.println("addArmorItem");
        ArmorItem armorItem = null;
        InventoryControl.addArmorItem(armorItem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcArmorStatusValue method, of class InventoryControl.
     */
    @Test
    public void testCalcArmorStatusValue() throws InventoryControlException {
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
    
}
