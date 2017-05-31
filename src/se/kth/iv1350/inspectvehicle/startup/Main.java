
package se.kth.iv1350.inspectvehicle.startup;
import  java.util.Random;
import  se.kth.iv1350.inspectvehicle.controller.Controller;
import  se.kth.iv1350.inspectvehicle.model.Inspection;
import  se.kth.iv1350.inspectvehicle.model.VehicleLicenseNo;
import  se.kth.iv1350.inspectvehicle.model.ListOfInspection;
import  se.kth.iv1350.inspectvehicle.integration.RegistryCreator;
import  se.kth.iv1350.inspectvehicle.integration.Printer;
import  se.kth.iv1350.inspectvehicle.integration.garage.Garage;
import  se.kth.iv1350.inspectvehicle.integration.paymentAuthroization.CreditCard;
import  se.kth.iv1350.inspectvehicle.integration.paymentAuthroization.PaymentAuthorization;

/**
 *
 * Performs complete startup of the application...
 */
public class Main {
    public static void main(String[] args){
        Garage garage= new Garage();
        RegistryCreator creator = new RegistryCreator();
        Printer printer = new Printer();
        PaymentAuthorization paymentAuthorization = new PaymentAuthorization();
        Inspection inspection = new Inspection();
        Controller contr = new Controller(garage, creator, printer, paymentAuthorization, inspection);
        
        //start new inspection
        System.out.println("StartNewIspection");
        contr.startNewInspection();
        
        //enter license no
        System.out.println("Enter License Number : 456789");
        VehicleLicenseNo vehicleLicenseNo = new VehicleLicenseNo(456789);
        ListOfInspection listOfInspection = contr.findInspection(vehicleLicenseNo);
        
        // return inspection instructions
        System.out.println("Inspections that needs to be performed are: ");
        for(int i=0; i<listOfInspection.getInspectionListString().size(); i++){
            System.out.println(listOfInspection.getInspectionListString().get(i) + " ");
        }
        
        // specify/return cost of inspection
        System.out.println();
        int price = contr.getInspectionPrice(listOfInspection);
        System.out.println("Cost for inpection is: " + price);
        
        //payment with credit card
        System.out.println("Payment: ");
        String number = "2030203";
        String holder = "Sara Carlson";
        int pin = 11111;
        int CVC = 314;
        CreditCard creditCard = new CreditCard(pin, number, holder, CVC);
        boolean amountPaid = contr.payWithCreditCard(creditCard, price);
        if(amountPaid){
            System.out.println("Successfully paid");
        }else{
            System.out.println("Payment Failed");
        }
        
        //perform Inspection and give inspection results
        System.out.println("Perform Inspection");
        Random result = new Random();
        for(int i=0; i<listOfInspection.getInspectionListString().size(); i++){
            boolean currentResult = result.nextBoolean();
            System.out.println("no." + i + " inspection is: " + listOfInspection.getInspectionListString().get(i));
            System.out.println ("Result of Inspection:" + currentResult);
            contr.setResult(listOfInspection.getInspectionListString().get(i),currentResult);
        }
   }
}
