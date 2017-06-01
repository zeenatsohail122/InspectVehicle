
package se.kth.iv1350.inspectvehicle.model;
import  se.kth.iv1350.inspectvehicle.integration.paymentAuthroization.CreditCard;

/**
 *
 * Receipt is used for the receipt of payment.
 */
public class Receipt {
    private int price = 0;
    private CreditCard creditCard;
    
    /**
     * Creates a new instance
     * @param creditCard    represents a credit card
     * @param price         price of inspection
     */
    public Receipt(CreditCard creditCard, int price){
        this.creditCard = creditCard;
        this.price = price;
    }

    Receipt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the the cost of inspection
     * @return the cost of inspection
     */
    public int getInspectionPrice(){
        return price;
    }
    
    /**
     * Get credit card info
     * @return credit card info
     */
    public CreditCard getCreditCard(){
        return creditCard;
    }
    
}
