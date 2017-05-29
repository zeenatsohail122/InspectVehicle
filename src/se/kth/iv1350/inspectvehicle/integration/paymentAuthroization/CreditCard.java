//zeenat
package se.kth.iv1350.inspectvehicle.integration.paymentAuthroization;

public final class CreditCard {

    private final int pin = 0;
    private final String number = "2030203";
    private final String holder = "Sara Carlson";
    private final int CVC = 000;

    public CreditCard(int pin, String number, String holder, int CVC) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iload_1
         * 6: putfield      se/kth/iv1350/payauth/CreditCard.pin:I
         * 9: aload_0
         * 10: aload_2
         * 11: putfield      se/kth/iv1350/payauth/CreditCard.number:Ljava/lang/String;
         * 14: aload_0
         * 15: aload_3
         * 16: putfield      se/kth/iv1350/payauth/CreditCard.holder:Ljava/lang/String;
         * 19: aload_0
         * 20: aload         4
         * 22: putfield      se/kth/iv1350/payauth/CreditCard.expiryDate:Ljava/time/YearMonth;
         * 25: aload_0
         * 26: iload         5
         * 28: putfield      se/kth/iv1350/payauth/CreditCard.CVC:I
         * 31: return
         *  */
        // </editor-fold>
    }

    public int getCVC() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      se/kth/iv1350/payauth/CreditCard.CVC:I
         * 4: ireturn
         *  */
        // </editor-fold>
        return CVC;
    }


    public String getCardHolder() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      se/kth/iv1350/payauth/CreditCard.holder:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
        return holder;
    }

    public String getNumber() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      se/kth/iv1350/payauth/CreditCard.number:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
        return number;
    }

    public int getPin() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      se/kth/iv1350/payauth/CreditCard.pin:I
         * 4: ireturn
         *  */
        // </editor-fold>
        return pin;
    }
}
