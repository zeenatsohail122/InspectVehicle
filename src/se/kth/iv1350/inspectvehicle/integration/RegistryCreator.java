
package se.kth.iv1350.inspectvehicle.integration;

public class RegistryCreator {
    private InspectionRegistry inspectionRegistry = new InspectionRegistry();
    private ResultRegistry resultRegistry = new ResultRegistry();
    
    public InspectionRegistry getInspectionRegistry(){
        return inspectionRegistry;
    }
    
    public ResultRegistry getResultRegistry(){
        return resultRegistry;
    }
    
}