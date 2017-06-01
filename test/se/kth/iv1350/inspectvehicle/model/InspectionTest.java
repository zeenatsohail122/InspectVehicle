package se.kth.iv1350.inspectvehicle.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.inspectvehicle.integration.Printer;
import se.kth.iv1350.inspectvehicle.model.Receipt;
import se.kth.iv1350.inspectvehicle.integration.ResultRegistry;
import se.kth.iv1350.inspectvehicle.integration.paymentAuthroization.CreditCard;

/**
 *
 * Test class to test Inspection
 */
public class InspectionTest {
    
    public InspectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getInspectionPrice method, of class Inspection.
     */
    @Test
    public void testGetInspectionPrice() {
        System.out.println("getInspectionPrice");
        ListOfInspection listOfInspection = new ListOfInspection();
        listOfInspection.addInspectionList("Tire ");
        listOfInspection.addInspectionList("Engine ");
        Inspection instance = new Inspection();
        int expResult = 200;
        int result = instance.getInspectionPrice(listOfInspection);
        assertEquals(expResult, result);
    }
   
}
