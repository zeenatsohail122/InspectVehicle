
package se.kth.iv1350.inspectvehicle.integration;
import  java.util.ArrayList;
import  java.util.List;
import  se.kth.iv1350.inspectvehicle.model.VehicleLicenseNo;
import  se.kth.iv1350.inspectvehicle.model.ListOfInspection;


/**
 *
 * @author ZeenatAli
 */
public class InspectionRegistry {
    
    InspectionRegistry(){
        
    }
    
    public ListOfInspection findInspection(VehicleLicenseNo vehicleLicenseNo){
        ListOfInspection listOfInspection = new ListOfInspection();
        
        //inspection generation
        List<String> inspectionDatabase = new ArrayList<>();
        inspectionDatabase.add("Clutch ");
        inspectionDatabase.add("Air conditioner ");
        inspectionDatabase.add("Tire ");
        inspectionDatabase.add("Brake ");
        inspectionDatabase.add("Battery ");
        inspectionDatabase.add("Steering ");
        inspectionDatabase.add("Locks");
        inspectionDatabase.add("Engine");
        inspectionDatabase.add("Locks");
        inspectionDatabase.add("Exhaust");
        
       
        int startPoint = vehicleLicenseNo.getVehicleLicense()%100/10;
        int numPoint = vehicleLicenseNo.getVehicleLicense()%100/10;
        for(int i=startPoint; i<=(startPoint+numPoint); i++){
            int iMod = i%10;
            listOfInspection.addInspectionList(inspectionDatabase.get(iMod));
        }
        return listOfInspection;       
    }   
}
