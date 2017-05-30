
package se.kth.iv1350.inspectvehicle.integration;

/**
 * This class initiates all registers
 * 
 */
public class RegistryCreator {
    private InspectionRegistry inspectionRegistry = new InspectionRegistry();
    private ResultRegistry resultRegistry = new ResultRegistry();
    
    /**
     * Get the value of inspectionRegistry
     * @return  the value of inspectionRegistry
     */
    public InspectionRegistry getInspectionRegistry(){
        return inspectionRegistry;
    }
    
    /**
     * Get the value resultRegistry
     * @return the value of resultRegistry
     */
    public ResultRegistry getResultRegistry(){
        return resultRegistry;
    }
    
}