
package se.kth.iv1350.inspectvehicle.integration.garage;


import java.awt.Color;
import javax.swing.JLabel;

class Door {

    private static final String CLOSED_TEXT = "The door is closed";
    private static final String OPEN_TEXT = "The door is open";
    private static final Color CLOSED_COLOR = Color.red;
    private static final Color OPEN_COLOR = Color.green ;
    private JLabel doorStateLabel;

    Door() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: new           javax/swing/JLabel
         * 8: dup
         * 9: ldc
         * 11: iconst_0
         * 12: invokespecial javax/swing/JLabel."<init>":(Ljava/lang/String;I)V
         * 15: putfield      se/kth/iv1350/garage/Door.doorStateLabel:Ljavax/swing/JLabel;
         * 18: aload_0
         * 19: invokevirtual se/kth/iv1350/garage/Door.close:()V
         * 22: aload_0
         * 23: invokespecial se/kth/iv1350/garage/Door.contactDoor:()V
         * 26: return
         *  */
        // </editor-fold>
    }

    void open() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      se/kth/iv1350/garage/Door.doorStateLabel:Ljavax/swing/JLabel;
         * 4: getstatic     se/kth/iv1350/garage/Door.OPEN_COLOR:Ljava/awt/Color;
         * 7: invokevirtual javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
         * 10: aload_0
         * 11: getfield      se/kth/iv1350/garage/Door.doorStateLabel:Ljavax/swing/JLabel;
         * 14: ldc           The door is open
         * 16: invokevirtual javax/swing/JLabel.setText:(Ljava/lang/String;)V
         * 19: return
         *  */
        // </editor-fold>
    }

    void close() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      se/kth/iv1350/garage/Door.doorStateLabel:Ljavax/swing/JLabel;
         * 4: getstatic     se/kth/iv1350/garage/Door.CLOSED_COLOR:Ljava/awt/Color;
         * 7: invokevirtual javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
         * 10: aload_0
         * 11: getfield      se/kth/iv1350/garage/Door.doorStateLabel:Ljavax/swing/JLabel;
         * 14: ldc           The door is closed
         * 16: invokevirtual javax/swing/JLabel.setText:(Ljava/lang/String;)V
         * 19: return
         *  */
        // </editor-fold>
    }

    private void contactDoor() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           javax/swing/JFrame
         * 3: dup
         * 4: ldc           Physical Garage Door
         * 6: invokespecial javax/swing/JFrame."<init>":(Ljava/lang/String;)V
         * 9: astore_1
         * 10: new           java/awt/Font
         * 13: dup
         * 14: ldc           Serif
         * 16: iconst_1
         * 17: bipush        30
         * 19: invokespecial java/awt/Font."<init>":(Ljava/lang/String;II)V
         * 22: astore_2
         * 23: aload_0
         * 24: getfield      se/kth/iv1350/garage/Door.doorStateLabel:Ljavax/swing/JLabel;
         * 27: aload_2
         * 28: invokevirtual javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
         * 31: aload_1
         * 32: invokevirtual javax/swing/JFrame.getContentPane:()Ljava/awt/Container;
         * 35: getstatic     java/awt/Color.GRAY:Ljava/awt/Color;
         * 38: invokevirtual java/awt/Container.setBackground:(Ljava/awt/Color;)V
         * 41: aload_1
         * 42: invokevirtual javax/swing/JFrame.getContentPane:()Ljava/awt/Container;
         * 45: aload_0
         * 46: getfield      se/kth/iv1350/garage/Door.doorStateLabel:Ljavax/swing/JLabel;
         * 49: invokevirtual java/awt/Container.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 52: pop
         * 53: aload_1
         * 54: sipush        200
         * 57: iconst_0
         * 58: sipush        350
         * 61: bipush        50
         * 63: invokevirtual javax/swing/JFrame.setBounds:(IIII)V
         * 66: aload_1
         * 67: iconst_1
         * 68: invokevirtual javax/swing/JFrame.setVisible:(Z)V
         * 71: return
         *  */
        // </editor-fold>
    }
}

