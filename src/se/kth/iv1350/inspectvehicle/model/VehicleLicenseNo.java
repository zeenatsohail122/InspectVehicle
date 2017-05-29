
package se.kth.iv1350.inspectvehicle.model;

/**
 *
 * VehiclLicenseNo contains information about the license of a car
 */
public class VehicleLicenseNo {
    private int vehicleLicenseNo;
    
    /**
     * Create New instance representing the car's license no.
     * @param vehicleLicenseNo represent license number of the car.
     */
    public VehicleLicenseNo(int vehicleLicenseNo){
        this.vehicleLicenseNo = vehicleLicenseNo;
    }
    
    public int getVehicleLicense(){
        return this.vehicleLicenseNo;
    }
    
}
