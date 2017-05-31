
package se.kth.iv1350.inspectvehicle.integration;
import  se.kth.iv1350.inspectvehicle.model.ListOfInspection;
import  se.kth.iv1350.inspectvehicle.model.Receipt;


public class Printer{
    
 /**
  * Print Receipt for the payment
  * @param receipt      Receipt of the current payment
  */
    public void printReceipt(Receipt receipt){
    System.out.println("--- RECEIPT ---");
    System.out.println("Cost of inspection: " + receipt.getInspectionPrice());
    System.out.println("Credit Card Number: " + receipt.getCreditCard().getNumber());
    System.out.println("Credit Holder's Name: " + receipt.getCreditCard().getCardHolder());
    System.out.println("--- ----- ---");
    }
    
    /**
     * Print Result of the specified inspection
     * @param resultRegistry    includes info about the result of specified inspection
     */
    public void printResult(ResultRegistry resultRegistry){
        System.out.println("--- Result ---");
        System.out.println("Inspection items | Result");
        for(int i=0; i<resultRegistry.getInspectionList().getInspectionListString().size(); i++){
            Boolean result = resultRegistry.getResultList().getResultListBoolean().get(i);
            String resultString = "Successful";
            if(result){
                resultString = "Unsuccessful";
            }
            System.out.println("  " + resultRegistry.getInspectionList().getInspectionListString().get(i) + "|" + resultString);
        }
        System.out.println("--- ----- ---");
    }
   
    
}
