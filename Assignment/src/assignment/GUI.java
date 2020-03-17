/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

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

    public void refresh() {

        initializeImageIcon();
        initializeName();
        initializePrice();

    }

    ArrayList<JLabel> stockPicAL = new ArrayList<>();

    public void initializePicToArrayList() {
        stockPicAL.add(No1pic);
        stockPicAL.add(No2pic);
        stockPicAL.add(No3pic);
        stockPicAL.add(No4pic);
        stockPicAL.add(No5pic);
        stockPicAL.add(No6pic);
        stockPicAL.add(No7pic);
        stockPicAL.add(No8pic);
        disablePicByAvail();
    }

    public void initializeImageIcon() {
        ArrayList<String> picUrl = DB.returnAllPicUrl();
        if (!(picUrl.size() <= 7)) {
            for (int i = 0; i < stockPicAL.size(); i++) {
                stockPicAL.get(i).setIcon(new ImageIcon((String) picUrl.get(i)));
            }
        } else {
            GUI_Class.showMessageBox("Not enough record in Database");
        }
    }

    public void disablePicByAvail() {
        ArrayList<String> avail = DB.returnAllStock();
        for (int i = 0; i < avail.size(); i++) {
            if ("0".equals(avail.get(i))) {
                stockPicAL.get(i).setEnabled(false);
            }
        }
    }

    ArrayList<JLabel> stockNameAL = new ArrayList<>();

    public void initializeStockNameToArrayList() {
        stockNameAL.add(Name1);
        stockNameAL.add(Name2);
        stockNameAL.add(Name3);
        stockNameAL.add(Name4);
        stockNameAL.add(Name5);
        stockNameAL.add(Name6);
        stockNameAL.add(Name7);
        stockNameAL.add(Name8);
    }

    public void initializeName() {
        ArrayList<String> stockName = DB.returnAllStockName();
        if (!(stockName.size() <= 7)) {
            for (int i = 0; i < stockNameAL.size(); i++) {
                stockNameAL.get(i).setText(stockName.get(i));
            }
        } else {
            GUI_Class.showMessageBox("Not enough record in Database");
        }
    }

    ArrayList<JLabel> priceAL = new ArrayList<>();

    public void initializeStockPriceToArrayList() {
        priceAL.add(Price1);
        priceAL.add(Price2);
        priceAL.add(Price3);
        priceAL.add(Price4);
        priceAL.add(Price5);
        priceAL.add(Price6);
        priceAL.add(Price7);
        priceAL.add(Price8);
    }

    public void initializePrice() {
        ArrayList<String> price = DB.returnAllStockPrice();
        if (!(price.size() <= 7)) {
            for (int i = 0; i < priceAL.size(); i++) {
                priceAL.get(i).setText(price.get(i));
            }
        } else {
            GUI_Class.showMessageBox("Not enough record in Database");
        }
    }

    ArrayList<JButton> buyBtnAL = new ArrayList<>();

    public void initializeBuyBtnToArrayList() {
        buyBtnAL.add(Buy1);
        buyBtnAL.add(Buy2);
        buyBtnAL.add(Buy3);
        buyBtnAL.add(Buy4);
        buyBtnAL.add(Buy5);
        buyBtnAL.add(Buy6);
        buyBtnAL.add(Buy7);
        buyBtnAL.add(Buy8);
        disableBtnByAvail();
    }

    public void disableBtnByAvail() {
        ArrayList<String> avail = DB.returnAllStock();
        for (int i = 0; i < avail.size(); i++) {
            if ("0".equals(avail.get(i))) {
                buyBtnAL.get(i).setEnabled(false);
            }
        }
    }

    public void disableAllBuyBtn() {
        for (int i = 0; i < buyBtnAL.size(); i++) {
            buyBtnAL.get(i).setEnabled(false);
        }
    }

    public void enableAllBuyBtn() {
        for (int i = 0; i < buyBtnAL.size(); i++) {
            buyBtnAL.get(i).setEnabled(true);
        }
    }

    ArrayList<JButton> payBtnAL = new ArrayList<>();

    public void initializePayBtnToArrayList() {
        payBtnAL.add(btnPay1);
        payBtnAL.add(btnPay2);
    }

    public void enableAllPayBtn() {
        for (int i = 0; i < payBtnAL.size(); i++) {
            payBtnAL.get(i).setEnabled(true);
        }
    }

    public void disenableAllPayBtn() {
        for (int i = 0; i < payBtnAL.size(); i++) {
            payBtnAL.get(i).setEnabled(false);
        }
    }

    /**
     * Creates new form GUI
     */
    public GUI() {
        // Swing component
        initComponents();
        // Button Component
        initializeBuyBtnToArrayList();
        initializePayBtnToArrayList();
        // Array List of component
        initializePicToArrayList();
        initializeStockNameToArrayList();
        initializeStockPriceToArrayList();
        // run initializer
        refresh();
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
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        No1pic = new javax.swing.JLabel();
        No2pic = new javax.swing.JLabel();
        No3pic = new javax.swing.JLabel();
        No4pic = new javax.swing.JLabel();
        No5pic = new javax.swing.JLabel();
        No6pic = new javax.swing.JLabel();
        No7pic = new javax.swing.JLabel();
        No8pic = new javax.swing.JLabel();
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
        Price3 = new javax.swing.JLabel();
        Price4 = new javax.swing.JLabel();
        Price5 = new javax.swing.JLabel();
        Price6 = new javax.swing.JLabel();
        Price7 = new javax.swing.JLabel();
        Price8 = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        Name4 = new javax.swing.JLabel();
        Name5 = new javax.swing.JLabel();
        Name6 = new javax.swing.JLabel();
        Name7 = new javax.swing.JLabel();
        Name8 = new javax.swing.JLabel();
        btnPay1 = new javax.swing.JButton();
        btnGoAdmin = new javax.swing.JButton();
        btnPay2 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTotalPayable = new javax.swing.JLabel();
        lblTotalReceived = new javax.swing.JLabel();
        lblRemainPayable = new javax.swing.JLabel();
        PayableBox = new javax.swing.JLabel();
        ReceivedBox = new javax.swing.JLabel();
        RemainingPayableBox = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        No1pic.setIcon(new javax.swing.ImageIcon(
                "D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No1pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 46, -1, -1));

        No2pic.setIcon(new javax.swing.ImageIcon(
                "D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No2pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 46, -1, -1));

        No3pic.setIcon(new javax.swing.ImageIcon(
                "D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No3pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 46, -1, -1));

        No4pic.setIcon(new javax.swing.ImageIcon(
                "D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No4pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 46, -1, -1));

        No5pic.setIcon(new javax.swing.ImageIcon(
                "D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No5pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 363, -1, -1));

        No6pic.setIcon(new javax.swing.ImageIcon(
                "D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No6pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 363, -1, -1));

        No7pic.setIcon(new javax.swing.ImageIcon(
                "D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No7pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 363, -1, -1));

        No8pic.setBackground(new java.awt.Color(255, 255, 255));
        No8pic.setForeground(new java.awt.Color(255, 255, 255));
        No8pic.setIcon(new javax.swing.ImageIcon(
                "D:\\Users\\ASUS\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\asset\\pic\\temp\\temp.jpg")); // NOI18N
        getContentPane().add(No8pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 363, -1, -1));

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
        getContentPane().add(Price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 120, -1));

        Price2.setText("Price");
        getContentPane().add(Price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 280, 120, -1));

        Price3.setText("Price");
        getContentPane().add(Price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 120, -1));

        Price4.setText("Price");
        getContentPane().add(Price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 280, 120, -1));

        Price5.setText("Price");
        getContentPane().add(Price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 600, 120, -1));

        Price6.setText("Price");
        getContentPane().add(Price6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 120, -1));

        Price7.setText("Price");
        getContentPane().add(Price7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, 120, -1));

        Price8.setText("Price");
        getContentPane().add(Price8, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 600, 120, -1));

        Name1.setText("Name");
        getContentPane().add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 297, 120, -1));

        Name2.setText("Name");
        getContentPane().add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 297, 120, -1));

        Name3.setText("Name");
        getContentPane().add(Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 297, 120, -1));

        Name4.setText("Name");
        getContentPane().add(Name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 297, 120, -1));

        Name5.setText("Name");
        getContentPane().add(Name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 614, 120, -1));

        Name6.setText("Name");
        getContentPane().add(Name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 614, 120, -1));

        Name7.setText("Name");
        getContentPane().add(Name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 614, 120, -1));

        Name8.setText("Name");
        getContentPane().add(Name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 614, 120, -1));

        btnPay1.setText("50 SEN");
        btnPay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPay1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 100, 50));

        btnGoAdmin.setText("Admin");
        btnGoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnGoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 100, 50));

        btnPay2.setText("RM 1");
        btnPay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPay2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 100, 50));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 100, 50));

        lblTotalPayable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTotalPayable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalPayable.setText("Total Payable :");
        getContentPane().add(lblTotalPayable, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 220, 70));

        lblTotalReceived.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTotalReceived.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalReceived.setText("Total Received :");
        getContentPane().add(lblTotalReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 220, 70));

        lblRemainPayable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRemainPayable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRemainPayable.setText("Remaining Payable :");
        getContentPane().add(lblRemainPayable, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 220, 70));

        PayableBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PayableBox.setText("|");
        getContentPane().add(PayableBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 160, 70));

        ReceivedBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ReceivedBox.setText("|");
        getContentPane().add(ReceivedBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, 160, 70));

        RemainingPayableBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RemainingPayableBox.setText("|");
        getContentPane().add(RemainingPayableBox,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 230, 160, 70));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/asset/pic/temp/bg.jpg"))); // NOI18N
        bg.setText("jLabel2");
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int selectedID;

    private void btnGoAdminActionPerformed(java.awt.event.ActionEvent evt) {//

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter a password:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[] { "OK", "Cancel" };
        int option = JOptionPane.showOptionDialog(null, panel, "The title", JOptionPane.NO_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[1]);

        char[] password = pass.getPassword();

        if ("password".equals(String.valueOf(password))) {
            adminPanel adminPL = new adminPanel();
            DB.Logger(2, 0);
            adminPL.setVisible(true);
            dispose();
        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        GUI_Class.exitSoftware();
        // dispose();
    }

    private void btnPay1ActionPerformed(java.awt.event.ActionEvent evt) {
        Double amount = 0.5;
        updateTotalReceived(amount);
    }

    private void btnPay2ActionPerformed(java.awt.event.ActionEvent evt) {
        Double amount = 1.00;
        updateTotalReceived(amount);
    }

    private void Buy1ActionPerformed(java.awt.event.ActionEvent evt) {
        int id = 1;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price);
    }

    private void Buy2ActionPerformed(java.awt.event.ActionEvent evt) {
        int id = 2;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price);
        selectedID = id;
    }

    private void Buy3ActionPerformed(java.awt.event.ActionEvent evt) {
        int id = 3;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price);
        selectedID = id;
    }

    private void Buy4ActionPerformed(java.awt.event.ActionEvent evt) {
        int id = 4;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price);
        selectedID = id;
    }

    private void Buy5ActionPerformed(java.awt.event.ActionEvent evt) {
        int id = 5;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price);
        selectedID = id;
    }

    private void Buy6ActionPerformed(java.awt.event.ActionEvent evt) {
        int id = 6;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price);
        selectedID = id;
    }

    private void Buy7ActionPerformed(java.awt.event.ActionEvent evt) {
        int id = 7;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price);
        selectedID = id;
    }

    private void Buy8ActionPerformed(java.awt.event.ActionEvent evt) {
        int id = 8;
        String price = DB.getStockPriceByID(String.valueOf(id));
        updateTotalPayable(price);
        selectedID = id;
    }

    public void updateTotalPayable(String addedPrice) {
        String current = PayableBox.getText();
        if ("".equals(current) || "|".equals(current)) {
            double s = Double.valueOf(addedPrice);
            DecimalFormat df = new DecimalFormat("###.###");
            String output = df.format(s);
            PayableBox.setText(String.valueOf(output));
        } else {
            double current1 = Double.parseDouble(current);
            double add = Double.parseDouble(addedPrice);
            current1 += add;
            DecimalFormat df = new DecimalFormat("###.###");
            String output = df.format(current1);
            PayableBox.setText(String.valueOf(output));
        }
        updateTotalRemaining();
    }

    public void updateTotalReceived(Double addedPrice) {
        // payable empty ? block ppl to change the data :
        // received box empty ?
        String payable = PayableBox.getText();
        if ("".equals(payable) || "|".equals(payable)) {
            GUI_Class.showMessageBox("Please choose an drink first ");
        } else {
            String current = ReceivedBox.getText();
            if ("".equals(current) || "|".equals(current)) {
                double s = addedPrice;
                DecimalFormat df = new DecimalFormat("###.###");
                String output = df.format(s);
                ReceivedBox.setText(String.valueOf(output));
                updateTotalRemaining();
            } else {
                double current1 = Double.parseDouble(current);
                double add = addedPrice;
                current1 += add;
                DecimalFormat df = new DecimalFormat("###.###");
                String output = df.format(current1);
                ReceivedBox.setText(String.valueOf(output));
                updateTotalRemaining();
            }
        }

    }

    public void updateTotalRemaining() {
        disableAllBuyBtn();
        String payable = PayableBox.getText();
        String received = ReceivedBox.getText();

        if (!("|".equals(payable) || "|".equals(received))) {
            // If it equal to | or is empty
            Double payable1 = Double.valueOf(payable);
            Double received1 = Double.valueOf(received);
            Double remaining = payable1 - received1;
            if (remaining < 0) {
                // Remaining is less then 0
                // Blocking ppl to use
                GUI_Class.showMessageBox("You are giving out too much money!\n Transaction cancel !");
                resetCounter();
            } else if (remaining > 0) {
                DecimalFormat df = new DecimalFormat("###.###");
                String output = df.format(remaining);
                // Remaining is more than 0
                // Ask ppl to pay
                RemainingPayableBox.setText(String.valueOf(output));
            } else {
                // Remaining is equal to 0
                // Set Check out
                DB.reduceStock(String.valueOf(selectedID));
                DB.Logger(0, selectedID);
                GUI_Class.sayThanks();
                resetCounter();
                enableAllBuyBtn();
                dispose();
                GUI gui = new GUI();
                gui.setVisible(true);
            }
        }
    }

    public void resetCounter() {
        PayableBox.setText("|");
        ReceivedBox.setText("|");
        RemainingPayableBox.setText("|");
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
    private javax.swing.JLabel PayableBox;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel Price3;
    private javax.swing.JLabel Price4;
    private javax.swing.JLabel Price5;
    private javax.swing.JLabel Price6;
    private javax.swing.JLabel Price7;
    private javax.swing.JLabel Price8;
    private javax.swing.JLabel ReceivedBox;
    private javax.swing.JLabel RemainingPayableBox;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGoAdmin;
    private javax.swing.JButton btnPay1;
    private javax.swing.JButton btnPay2;
    private javax.swing.JLabel lblRemainPayable;
    private javax.swing.JLabel lblTotalPayable;
    private javax.swing.JLabel lblTotalReceived;
    // End of variables declaration//GEN-END:variables
}
