
package se.kth.iv1350.inspectvehicle.integration;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.inspectvehicle.model.VehicleLicenseNo;

/**
 *
 * Test class to test InspectionRegistry
 */
public class InspectionRegistryTest {
    
    public InspectionRegistryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of findInspection method, of class InspectionRegistry.
     */
    @Test
    public void testFindInspection() {
        System.out.println("findInspection");
        VehicleLicenseNo vehicleLicenseNo = new VehicleLicenseNo(456789);
        InspectionRegistry instance = new InspectionRegistry();
        List<String> result = instance.findInspection(vehicleLicenseNo).getInspectionListString();
        List<String> expResult = new ArrayList<String>();
        
        expResult.add("Locker ");
        expResult.add("Air C ");
        expResult.add("Tire ");
        expResult.add("Engine ");
        expResult.add("Brake ");
        expResult.add("Steer");
        expResult.add("Clutch ");
        expResult.add("Light ");
        expResult.add("Battery");
        
        
        assertEquals(expResult, result);
        
    }
    
}

