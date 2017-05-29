
package se.kth.iv1350.inspectvehicle.integration.garage;

import javax.swing.JLabel;

class QueueNumberDisplay {

    private static String HEADER;
    private int queueNumber;
    private JLabel queueNumberLabel;

    QueueNumberDisplay() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iconst_m1
         * 6: putfield      se/kth/iv1350/garage/QueueNumberDisplay.queueNumber:I
         * 9: aload_0
         * 10: new           javax/swing/JLabel
         * 13: dup
         * 14: ldc
         * 16: iconst_0
         * 17: invokespecial javax/swing/JLabel."<init>":(Ljava/lang/String;I)V
         * 20: putfield      se/kth/iv1350/garage/QueueNumberDisplay.queueNumberLabel:Ljavax/swing/JLabel;
         * 23: aload_0
         * 24: invokevirtual se/kth/iv1350/garage/QueueNumberDisplay.nextNumber:()V
         * 27: aload_0
         * 28: invokespecial se/kth/iv1350/garage/QueueNumberDisplay.contactDisplay:()V
         * 31: return
         *  */
        // </editor-fold>
    }

    final void nextNumber() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      se/kth/iv1350/garage/QueueNumberDisplay.queueNumberLabel:Ljavax/swing/JLabel;
         * 4: aload_0
         * 5: dup
         * 6: getfield      se/kth/iv1350/garage/QueueNumberDisplay.queueNumber:I
         * 9: iconst_1
         * 10: iadd
         * 11: dup_x1
         * 12: putfield      se/kth/iv1350/garage/QueueNumberDisplay.queueNumber:I
         * 15: invokestatic  java/lang/Integer.toString:(I)Ljava/lang/String;
         * 18: invokevirtual javax/swing/JLabel.setText:(Ljava/lang/String;)V
         * 21: return
         *  */
        // </editor-fold>
    }

    private void contactDisplay() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           javax/swing/JFrame
         * 3: dup
         * 4: getstatic     se/kth/iv1350/garage/QueueNumberDisplay.HEADER:Ljava/lang/String;
         * 7: invokespecial javax/swing/JFrame."<init>":(Ljava/lang/String;)V
         * 10: astore_1
         * 11: new           java/awt/Font
         * 14: dup
         * 15: ldc           Serif
         * 17: iconst_1
         * 18: bipush        30
         * 20: invokespecial java/awt/Font."<init>":(Ljava/lang/String;II)V
         * 23: astore_2
         * 24: aload_0
         * 25: getfield      se/kth/iv1350/garage/QueueNumberDisplay.queueNumberLabel:Ljavax/swing/JLabel;
         * 28: aload_2
         * 29: invokevirtual javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
         * 32: aload_1
         * 33: invokevirtual javax/swing/JFrame.getContentPane:()Ljava/awt/Container;
         * 36: getstatic     java/awt/Color.BLACK:Ljava/awt/Color;
         * 39: invokevirtual java/awt/Container.setBackground:(Ljava/awt/Color;)V
         * 42: aload_0
         * 43: getfield      se/kth/iv1350/garage/QueueNumberDisplay.queueNumberLabel:Ljavax/swing/JLabel;
         * 46: getstatic     java/awt/Color.WHITE:Ljava/awt/Color;
         * 49: invokevirtual javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
         * 52: aload_1
         * 53: invokevirtual javax/swing/JFrame.getContentPane:()Ljava/awt/Container;
         * 56: aload_0
         * 57: getfield      se/kth/iv1350/garage/QueueNumberDisplay.queueNumberLabel:Ljavax/swing/JLabel;
         * 60: invokevirtual java/awt/Container.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 63: pop
         * 64: aload_1
         * 65: sipush        600
         * 68: iconst_0
         * 69: sipush        200
         * 72: bipush        80
         * 74: invokevirtual javax/swing/JFrame.setBounds:(IIII)V
         * 77: aload_1
         * 78: iconst_1
         * 79: invokevirtual javax/swing/JFrame.setVisible:(Z)V
         * 82: return
         *  */
        // </editor-fold>
    }
}
