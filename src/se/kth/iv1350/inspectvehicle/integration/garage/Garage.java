
package se.kth.iv1350.inspectvehicle.integration.garage;

public class Garage {

    private Door door;
    private QueueNumberDisplay queueNumDisp;

    public Garage() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: new           se/kth/iv1350/garage/Door
         * 8: dup
         * 9: invokespecial se/kth/iv1350/garage/Door."<init>":()V
         * 12: putfield      se/kth/iv1350/garage/Garage.door:Lse/kth/iv1350/garage/Door;
         * 15: aload_0
         * 16: new           se/kth/iv1350/garage/QueueNumberDisplay
         * 19: dup
         * 20: invokespecial se/kth/iv1350/garage/QueueNumberDisplay."<init>":()V
         * 23: putfield      se/kth/iv1350/garage/Garage.queueNumDisp:Lse/kth/iv1350/garage/QueueNumberDisplay;
         * 26: return
         *  */
        // </editor-fold>
    }

    public void nextCustomer() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      se/kth/iv1350/garage/Garage.door:Lse/kth/iv1350/garage/Door;
         * 4: invokevirtual se/kth/iv1350/garage/Door.open:()V
         * 7: aload_0
         * 8: getfield      se/kth/iv1350/garage/Garage.queueNumDisp:Lse/kth/iv1350/garage/QueueNumberDisplay;
         * 11: invokevirtual se/kth/iv1350/garage/QueueNumberDisplay.nextNumber:()V
         * 14: return
         *  */
        // </editor-fold>
    }

    public void closeDoor() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      se/kth/iv1350/garage/Garage.door:Lse/kth/iv1350/garage/Door;
         * 4: invokevirtual se/kth/iv1350/garage/Door.close:()V
         * 7: return
         *  */
        // </editor-fold>
    }
}