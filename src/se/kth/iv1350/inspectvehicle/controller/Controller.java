
package se.kth.iv1350.inspectvehicle.controller;
import  se.kth.iv1350.inspectvehicle.model.Inspection;
import  se.kth.iv1350.inspectvehicle.model.VehicleLicenseNo;
import  se.kth.iv1350.inspectvehicle.model.ListOfInspection;
import  se.kth.iv1350.inspectvehicle.model.Receipt;
import  se.kth.iv1350.inspectvehicle.integration.garage.Garage;
import  se.kth.iv1350.inspectvehicle.integration.paymentAuthroization.PaymentAuthorization;
import  se.kth.iv1350.inspectvehicle.integration.Printer;
import  se.kth.iv1350.inspectvehicle.integration.paymentAuthroization.CreditCard;
import  se.kth.iv1350.inspectvehicle.integration.RegistryCreator;

/**
 *
 * This is the application's single controller. All calls to the model pass through here.
 */
public class Controller {
    private Garage garage = null;
    private RegistryCreator creator = null;
    private PaymentAuthorization paymentAuthorization = null;
    private Printer printer = null;
    private Inspection inspection = null;
    
    /**
     * Creates a new instance 
     * @param garage                   used to control the door and display queue number
     * @param creator                  used to initiate all registries
     * @param printer                  interface used for printing
     * @param paymentAuthorization     used to handle communication with payment authorizing system
     * @param inspection               used to calculate result and print receipt and result
     * 
     */
    public Controller(Garage garage, RegistryCreator creator, Printer printer, PaymentAuthorization paymentAuthorization,
                      Inspection inspection){
        this.garage = garage;
        this.creator = creator;
        this.printer = printer;
        this.paymentAuthorization = paymentAuthorization;
        this.inspection = inspection;
    }
  
    /**
     * Start new inspection on new Customer's Vehicle
     */
    public void startNewInspection(){
        this.garage.nextCustomer();
        this.garage.closeDoor();
        
    }
    
    /**
     * find inspection instructions for the given license Number
     * 
     * @param vehicleLicenseNo    is the license number for the car that requires inspection
     * @return                      Inspection instructions for the given License Number
     */
    public ListOfInspection findInspection(VehicleLicenseNo vehicleLicenseNo){
        return this.creator.getInspectionRegistry().findInspection(vehicleLicenseNo);
    }
    
    /**
     * Specify the cost of found Inspections
     * 
     * @param listOfInspections  determines the list of found inspections
     * @return                   cost for the found inspections
     */
    public int getInspectionPrice(ListOfInspection listOfInspections){
        return this.inspection.getInspectionPrice(listOfInspections);
    }
    
    /**
     * Perform payment with credit card, if the payment is successful print receipt
     * 
     * @param creditCard       stands for the credit card
     * @param price            cost of inspection
     * @return                 if payment successful <code>true</code>
     */
    public boolean payWithCreditCard(CreditCard creditCard, int price){
        Boolean amountPaid = this.paymentAuthorization.authorizePayment(creditCard, price);
        if(amountPaid){
            Receipt receipt = new Receipt(creditCard, price);
            this.inspection.printReceipt(receipt, printer);
        }
            return amountPaid;
    }
    
    /**
     * Store result in result database
     * @param inspection    represents one inspection item
     * @param result        result for one particular inspection
     *                      if successful <code>true</code>, if unsuccessful <code>false</code>
     */
    public void setResult(String inspection, Boolean result){
        this.creator.getResultRegistry().storeResult(inspection, result);
    }
    
    /**
     * Print result of an inspection
     */
    public void printResult(){
        this.inspection.printResult(this.creator.getResultRegistry(), printer);
    }
 }
