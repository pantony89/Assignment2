/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd4414.assign2;

import java.util.Date;
import java.util.List;
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
public class OrderTest {
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addPurchase method, of class Order.
     */
    @Test
    public void testAddPurchase() {
        System.out.println("addPurchase");
        System.out.println("getCustomerId");
        Order instance = new Order("","");
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        Purchase p=new Purchase("1",1);
        instance.addPurchase(p);
        assertEquals(instance.getListOfPurchases().size(),1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerId method, of class Order.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Order instance = new Order("","");
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCustomerId method, of class Order.
     */
    @Test
    public void testSetCustomerId() {
        System.out.println("getCustomerId");
        Order instance = new Order("","");
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerName method, of class Order.
     */
    @Test
    public void testGetCustomerName() {
        System.out.println("getCustomerId");
        Order instance = new Order("","");
        String expResult = "";
        String result = instance.getCustomerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerName method, of class Order.
     */
    @Test (expected = NullPointerException.class)
    public void testSetCustomerName() {
        System.out.println("setCustomerName");
        String customerName = "";
        Order instance = null;
        instance.setCustomerName(customerName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeReceived method, of class Order.
     */
    @Test
    public void testGetTimeReceived() {
        System.out.println("getTimeReceived");
        Order instance = null;
        Date expResult = null;
        Date result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTimeReceived method, of class Order.
     */
    @Test (expected = NullPointerException.class)
    public void testSetTimeReceived() {
        System.out.println("setTimeReceived");
        Date timeReceived = null;
        Order instance = null;
        instance.setTimeReceived(timeReceived);
        Date expResult = null;
        Date result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeProcessed method, of class Order.
     */
    @Test (expected = NullPointerException.class)
    public void testGetTimeProcessed() {
        System.out.println("getTimeProcessed");
        Order instance = null;
        Date expResult = null;
        Date result = instance.getTimeProcessed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeProcessed method, of class Order.
     */
    @Test (expected = NullPointerException.class)
    public void testSetTimeProcessed() {
        System.out.println("setTimeProcessed");
        Date timeProcessed = null;
        Order instance = null;
        instance.setTimeProcessed(timeProcessed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeFulfilled method, of class Order.
     */
    @Test (expected = NullPointerException.class)
    public void testGetTimeFulfilled() {
        System.out.println("getTimeFulfilled");
        Order instance = null;
        Date expResult = null;
        Date result = instance.getTimeFulfilled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeFulfilled method, of class Order.
     */
    @Test (expected = NullPointerException.class)
    public void testSetTimeFulfilled() {
        System.out.println("setTimeFulfilled");
        Date timeFulfilled = null;
        Order instance = null;
        instance.setTimeFulfilled(timeFulfilled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfPurchases method, of class Order.
     */
    @Test (expected = NullPointerException.class)
    public void testGetListOfPurchases() {
        System.out.println("getListOfPurchases");
        Order instance = null;
        List<Purchase> expResult = null;
        List<Purchase> result = instance.getListOfPurchases();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListOfPurchases method, of class Order.
     */
    @Test (expected = NullPointerException.class)
    public void testSetListOfPurchases() {
        System.out.println("setListOfPurchases");
        List<Purchase> listOfPurchases = null;
        Order instance = null;
        instance.setListOfPurchases(listOfPurchases);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class Order.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        System.out.println("getCustomerId");
        Order instance = new Order("","");
        instance.setNotes("a");
        String expResult = "a";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class Order.
     */
    
    @Test 
    public void testwhencustomerIDExistsandpurchasesExistthensettheTimeReceived(){
        
    }
    @Test 
    public void testwhencustomerIDExistsandpurchasesExistthenThrowException(){
        
    }
     @Test 
    public void testwhenorderinthesystemThenreturntheOrderearliesttimerecieveddoesnottimeprocessed(){
        
    }
     @Test 
    public void testwhenorderhastimeprocessedandtimerecievedThensetthetime(){
        
    }
      @Test 
    public void testwhenorderhasNotimeprocessedandtimerecievedThenThrowException(){
        
    }
     @Test 
    public void testwhenorderdoesNotHavetimerecievedThenThrowException(){
        
    }
      @Test 
    public void testwhenorderhastimerecievedThensetthetime(){
       
    }
    
}
