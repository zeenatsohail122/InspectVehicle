
package se.kth.iv1350.inspectvehicle.model;
import  se.kth.iv1350.inspectvehicle.integration.paymentAuthroization.CreditCard;

/**
 *
 * Receipt is used for the receipt of payment
 */
public class Receipt {
    private int price = 0;
    private CreditCard creditCard;
    
    /**
     * 
     * @param creditCard
     * @param price 
     */
    
    public Receipt(CreditCard creditCard, int price){
        this.creditCard = creditCard;
        this.price = price;
    }
    
    /**
     * 
     * @return 
     */
    
    public int getInspectionPrice(){
        return price;
    }
    
    /**
     * 
     * @return 
     */
    public CreditCard getCreditCard(){
        return creditCard;
    }
    
}
