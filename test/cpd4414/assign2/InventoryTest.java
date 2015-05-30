/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd4414.assign2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0633176
 */
public class InventoryTest {
    
    public InventoryTest() {
    }
    
    

    @Test
    public void testGetQuantityForIdReturnsErrorForNegativeID() {
        int id = -100;
        int expResult = -1;
        int result = Inventory.getQuantityForId(id);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testGetQuantityForIdReturnsValidResultForPositiveID() {
        int id = 4;
        int result = Inventory.getQuantityForId(id);
        assertTrue(result >= 0);        
    }
    
}