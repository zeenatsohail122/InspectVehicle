//zeenat
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.inspectvehicle.model;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.inspectvehicle.integration.Printer;
import se.kth.iv1350.inspectvehicle.integration.ResultRegistry;
import se.kth.iv1350.inspectvehicle.integration.ListOfInspection;

/**
 *
 * @author ZeenatAli.
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
        listOfInspection.addInspectionList("Tire   ");
        listOfInspection.addInspectionList("Engine  ");
        Inspection instance = new Inspection();
        int expResult = 499;
        int result = instance.getInspectionPrice(listOfInspection);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of printReceipt method, of class Inspection.
     */
    @Test
    public void testPrintReceipt() {
        System.out.println("printReceipt");
        Receipt receipt = null;
        Printer printer = null;
        Inspection instance = new Inspection();
        instance.printReceipt(receipt, printer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printResult method, of class Inspection.
     */
    @Test
    public void testPrintResult() {
        System.out.println("printResult");
        ResultRegistry resultRegistry = null;
        Printer printer = null;
        Inspection instance = new Inspection();
        instance.printResult(resultRegistry, printer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
