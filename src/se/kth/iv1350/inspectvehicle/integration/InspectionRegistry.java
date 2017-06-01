
package se.kth.iv1350.inspectvehicle.integration;
import  java.util.ArrayList;
import  java.util.List;
import  se.kth.iv1350.inspectvehicle.model.VehicleLicenseNo;
import  se.kth.iv1350.inspectvehicle.model.ListOfInspection;

/**
 *
 * Includes all calls to the database, where inspections are stored
 */
public class InspectionRegistry {
    
    /**
     * Creates a new instance
     */
    InspectionRegistry(){
        
    }
    
    /**
     * findInspection finds the specified inspection from database according to the vehicleLicenseNo
     * @param vehicleLicenseNo      License for the car
     * @return                      specified inspection
     */
    
    public ListOfInspection findInspection(VehicleLicenseNo vehicleLicenseNo){
        ListOfInspection listOfInspection = new ListOfInspection();
        
        //inspection generation
        List<String> inspectionDatabase = new ArrayList<>();
        inspectionDatabase.add("Tire ");
        inspectionDatabase.add("Engine ");
        inspectionDatabase.add("Brake ");
        inspectionDatabase.add("Steer");
        inspectionDatabase.add("Clutch ");
        inspectionDatabase.add("Light ");
        inspectionDatabase.add("Battery");
        inspectionDatabase.add("Exhaust");
        inspectionDatabase.add("Locker ");
        inspectionDatabase.add("Air C ");
        
       
        int startPoint = vehicleLicenseNo.getVehicleLicense()%100/10;
        int numPoint = vehicleLicenseNo.getVehicleLicense()%100/10;
        for(int i=startPoint; i<=(startPoint+numPoint); i++){
            int iMod = i%10;
            listOfInspection.addInspectionList(inspectionDatabase.get(iMod));
        }
        return listOfInspection;       
    }   
}
