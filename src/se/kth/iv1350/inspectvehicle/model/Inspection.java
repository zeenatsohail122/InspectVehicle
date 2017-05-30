
package se.kth.iv1350.inspectvehicle.model;
import  se.kth.iv1350.inspectvehicle.integration.Printer;
import  se.kth.iv1350.inspectvehicle.integration.ResultRegistry;
import  se.kth.iv1350.inspectvehicle.integration.ListOfInspection;



/**
 * Inspection is used to calculate the cost of inspection, print receipt and inspection result.
 * 
 */
public class Inspection {
    
    /**
     * Creates new instance
     */
    public Inspection(){
    }
    
    /**
     * Get a cost according to List of Inspection
     * @param listOfInspection  list of specified inspection instruction
     * @return                  price/cost of specified inspection 
     */
    public int getInspectionPrice(ListOfInspection listOfInspection){
        int price = listOfInspection.getInspectionListString().size() * 100;
        return price;
    }
    
    /**
     * Print receipt for the payment
     * @param receipt   of the performed payment
     * @param printer   Interface to Printer
     */
    public void printReceipt(Receipt receipt, Printer printer){
        printer.printReceipt(receipt);
    }
    
    /**
     * 
     * @param resultRegistry        gets result from the database
     * @param printer               Interface to Printer
     */
    public void printResult(ResultRegistry resultRegistry, Printer printer){
        printer.printResult(resultRegistry);
    }
    
}
