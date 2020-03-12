/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

import assignment.GUI_Class;

/**
 *
 * @author ASUS
 */
public final class GUI extends javax.swing.JFrame {

    private int totalPayable;
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void initializeImageIcon() {
        ArrayList<String> picUrl = DB.returnAllPicUrl();
        if (!(picUrl.size() <= 7)) {
            No1pic.setIcon(new ImageIcon((String) picUrl.get(0)));
            No2pic.setIcon(new ImageIcon((String) picUrl.get(1)));
            No3pic.setIcon(new ImageIcon((String) picUrl.get(2)));
            No4pic.setIcon(new ImageIcon((String) picUrl.get(3)));
            No5pic.setIcon(new ImageIcon((String) picUrl.get(4)));
            No6pic.setIcon(new ImageIcon((String) picUrl.get(5)));
            No7pic.setIcon(new ImageIcon((String) picUrl.get(6)));
            No8pic.setIcon(new ImageIcon((String) picUrl.get(7)));

        } else {
            GUI_Class.showMessageBox("Not enough record in Database");
        }
    }

    public void initializeName() {
        ArrayList<String> stockName = DB.returnAllStockName();
        if (!(stockName.size() <= 7)) {
            Name1.setText(stockName.get(0));
            Name2.setText(stockName.get(1));
            Name3.setText(stockName.get(2));
            Name4.setText(stockName.get(3));
            Name5.setText(stockName.get(4));
            Name6.setText(stockName.get(5));
            Name7.setText(stockName.get(6));
            Name8.setText(stockName.get(7));
        } else {
            GUI_Class.showMessageBox("Not enough record in Database");
        }
    }

    public void initializePrice() {
        ArrayList<String> price = DB.returnAllStockPrice();
        if (!(price.size() <= 7)) {
            Price1.setText(price.get(0));
            Price2.setText(price.get(1));
            Price3.setText(price.get(2));
            Price4.setText(price.get(3));
            Price3.setText(price.get(4));
            Price4.setText(price.get(5));
            Price7.setText(price.get(6));
            Price8.setText(price.get(7));
        } else {
            GUI_Class.showMessageBox("Not enough record in Database");
        }
    }

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        initializeImageIcon();
        initializeName();
        initializePrice();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        No3pic = new javax.swing.JLabel();
        No4pic = new javax.swing.JLabel();
        No1pic = new javax.swing.JLabel();
        No2pic = new javax.swing.JLabel();
        No7pic = new javax.swing.JLabel();
        No5pic = new javax.swing.JLabel();
        No8pic = new javax.swing.JLabel();
        No6pic = new javax.swing.JLabel();
        Buy1 = new javax.swing.JButton();
        Buy2 = new javax.swing.JButton();
        Buy3 = new javax.swing.JButton();
        Buy4 = new javax.swing.JButton();
        Buy5 = new javax.swing.JButton();
        Buy6 = new javax.swing.JButton();
        Buy7 = new javax.swing.JButton();
        Buy8 = new javax.swing.JButton();
        Price1 = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Price5 = new javax.swing.JLabel();
        Price6 = new javax.swing.JLabel();
        Name5 = new javax.swing.JLabel();
        Name6 = new javax.swing.JLabel();
        Price3 = new javax.swing.JLabel();
        Price4 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        Name4 = new javax.swing.JLabel();
        Price7 = new javax.swing.JLabel();
        Price8 = new javax.swing.JLabel();
        Name7 = new javax.swing.JLabel();
        Name8 = new javax.swing.JLabel();
        lblTotalPayable = new javax.swing.JLabel();
        Pay1 = new javax.swing.JButton();
        Pay2 = new javax.swing.JButton();
        Pay3 = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        Payable = new javax.swing.JLabel();
        Pay4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        No3pic.setIcon(new javax.swing.ImageIcon("D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No3pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 46, -1, -1));

        No4pic.setIcon(new javax.swing.ImageIcon("D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No4pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 46, -1, -1));

        No1pic.setIcon(new javax.swing.ImageIcon("D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No1pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 46, -1, -1));

        No2pic.setIcon(new javax.swing.ImageIcon("D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No2pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 46, -1, -1));

        No7pic.setIcon(new javax.swing.ImageIcon("D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No7pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 363, -1, -1));

        No5pic.setIcon(new javax.swing.ImageIcon("D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No5pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 363, -1, -1));

        No8pic.setBackground(new java.awt.Color(255, 255, 255));
        No8pic.setForeground(new java.awt.Color(255, 255, 255));
        No8pic.setIcon(new javax.swing.ImageIcon("D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No8pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 363, -1, -1));

        No6pic.setIcon(new javax.swing.ImageIcon("D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No6pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 363, -1, -1));

        Buy1.setText("Buy");
        Buy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy1ActionPerformed(evt);
            }
        });
        getContentPane().add(Buy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 322, 120, -1));

        Buy2.setText("Buy");
        Buy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy2ActionPerformed(evt);
            }
        });
        getContentPane().add(Buy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 322, 120, -1));

        Buy3.setText("Buy");
        Buy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy3ActionPerformed(evt);
            }
        });
        getContentPane().add(Buy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 322, 120, -1));

        Buy4.setText("Buy");
        Buy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy4ActionPerformed(evt);
            }
        });
        getContentPane().add(Buy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 322, 120, -1));

        Buy5.setText("Buy");
        Buy5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy5ActionPerformed(evt);
            }
        });
        getContentPane().add(Buy5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 639, 120, -1));

        Buy6.setText("Buy");
        Buy6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy6ActionPerformed(evt);
            }
        });
        getContentPane().add(Buy6, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 639, 120, -1));

        Buy7.setText("Buy");
        Buy7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy7ActionPerformed(evt);
            }
        });
        getContentPane().add(Buy7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 639, 120, -1));

        Buy8.setText("Buy");
        Buy8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy8ActionPerformed(evt);
            }
        });
        getContentPane().add(Buy8, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 639, 120, -1));

        Price1.setText("Price");
        getContentPane().add(Price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 277, 120, -1));

        Price2.setText("Price");
        getContentPane().add(Price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 277, 120, -1));

        Name1.setText("Name");
        getContentPane().add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 297, 120, -1));

        Name2.setText("Name");
        getContentPane().add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 297, 120, -1));

        Price5.setText("Price");
        getContentPane().add(Price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 594, 120, -1));

        Price6.setText("Price");
        getContentPane().add(Price6, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 594, 120, -1));

        Name5.setText("Name");
        getContentPane().add(Name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 614, 120, -1));

        Name6.setText("Name");
        getContentPane().add(Name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 614, 120, -1));

        Price3.setText("Price");
        getContentPane().add(Price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 277, 120, -1));

        Price4.setText("Price");
        getContentPane().add(Price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 277, 120, -1));

        Name3.setText("Name");
        getContentPane().add(Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 297, 120, -1));

        Name4.setText("Name");
        getContentPane().add(Name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 297, 120, -1));

        Price7.setText("Price");
        getContentPane().add(Price7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 594, 120, -1));

        Price8.setText("Price");
        getContentPane().add(Price8, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 594, 120, -1));

        Name7.setText("Name");
        getContentPane().add(Name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 614, 120, -1));

        Name8.setText("Name");
        getContentPane().add(Name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 614, 120, -1));

        lblTotalPayable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTotalPayable.setText("Total Payable :");
        getContentPane().add(lblTotalPayable, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 160, 70));

        Pay1.setText("50 SEN");
        getContentPane().add(Pay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 100, 50));

        Pay2.setText("RM 1");
        getContentPane().add(Pay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 100, 50));

        Pay3.setText("RM 5");
        getContentPane().add(Pay3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 100, 50));

        Exitbtn.setText("Exit");
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 100, 50));

        Payable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(Payable, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 160, 70));

        Pay4.setText("RM 10");
        getContentPane().add(Pay4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 100, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/asset/pic/temp/bg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void Buy1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Buy1ActionPerformed
        int id = 1;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price, id);
    }

    private void Buy2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Buy2ActionPerformed
        int id = 2;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price, id);
    }

    private void Buy3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Buy3ActionPerformed
        int id = 3;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price, id);
    }

    private void Buy4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Buy4ActionPerformed
        int id = 4;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price, id);
    }

    private void Buy5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Buy5ActionPerformed
        int id = 5;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price, id);
    }

    private void Buy6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Buy6ActionPerformed
        int id = 6;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price, id);
    }

    private void Buy7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Buy7ActionPerformed
        int id = 7;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price, id);
    }

    private void Buy8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Buy8ActionPerformed
        int id = 8;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price, id);
    }

    public void updateTotalPayable(String addedPrice, int id) {
        String current = Payable.getText();
        if ("".equals(current)) {
            System.out.println("add : " + addedPrice);
            double s = Double.valueOf(addedPrice);
            Payable.setText(String.valueOf(s));
        } else {
            double current1 = Double.parseDouble(current);
            double add = Double.parseDouble(addedPrice);
            current1 += add;
            current1 = Math.round(current1);
            Payable.setText(String.valueOf(current1));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buy1;
    private javax.swing.JButton Buy2;
    private javax.swing.JButton Buy3;
    private javax.swing.JButton Buy4;
    private javax.swing.JButton Buy5;
    private javax.swing.JButton Buy6;
    private javax.swing.JButton Buy7;
    private javax.swing.JButton Buy8;
    private javax.swing.JButton Exitbtn;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel Name5;
    private javax.swing.JLabel Name6;
    private javax.swing.JLabel Name7;
    private javax.swing.JLabel Name8;
    private javax.swing.JLabel No1pic;
    private javax.swing.JLabel No2pic;
    private javax.swing.JLabel No3pic;
    private javax.swing.JLabel No4pic;
    private javax.swing.JLabel No5pic;
    private javax.swing.JLabel No6pic;
    private javax.swing.JLabel No7pic;
    private javax.swing.JLabel No8pic;
    private javax.swing.JButton Pay1;
    private javax.swing.JButton Pay2;
    private javax.swing.JButton Pay3;
    private javax.swing.JButton Pay4;
    private javax.swing.JLabel Payable;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel Price3;
    private javax.swing.JLabel Price4;
    private javax.swing.JLabel Price5;
    private javax.swing.JLabel Price6;
    private javax.swing.JLabel Price7;
    private javax.swing.JLabel Price8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTotalPayable;
    // End of variables declaration//GEN-END:variables
}
