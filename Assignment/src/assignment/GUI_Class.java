package assignment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI_Class {

    public static void showConfirmDialog(String s) {
        final JFrame parent = new JFrame();
        parent.setVisible(true);

        // JOptionPane.showInputDialog(parent, "What is your name?", null);
        final int showConfirmDialog = JOptionPane.showConfirmDialog(parent, s);
        switch (showConfirmDialog) {
            case 0:
                JOptionPane.showMessageDialog(parent, "Yes is return");
                break;

            case 1:
                JOptionPane.showMessageDialog(parent, "No is return");
                break;

            case 2:
                JOptionPane.showMessageDialog(parent, "Cacel is return");
                break;

        }
        parent.setVisible(false);
    }

    public static void showMessageBox(String message) {
        final JFrame parent = new JFrame();
        parent.setVisible(true);
        JOptionPane.showMessageDialog(parent, message, "Pop Up 1", 1);
        parent.setVisible(false);
    }

    public static void sayThanks() {
        final JFrame parent = new JFrame();
        parent.setVisible(true);
        JOptionPane.showMessageDialog(parent, "Thanks for purchase!", "Thanks and please come again", 1);
        parent.setVisible(false);
    }

    public static void exitSoftware() {
        final JFrame parent = new JFrame();
        final int showConfirmDialog = JOptionPane.showConfirmDialog(parent, "Are you sure you want to exit");
        switch (showConfirmDialog) {
            case 0:
                DB.Logger(3, 1);
                System.exit(0);
                break;

            case 1:
                parent.setVisible(false);
                break;

            case 2:
                parent.setVisible(false);
                break;

        }

    }
}
