package View;

import javax.swing.*;
import java.awt.*;

public class ReservationPage {
    public JFrame frame;
    private JPanel panel1;
    private JTextField textField1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JButton checkoutButton;
    private JTextArea textArea1;
    private JSlider slider1;


    public ReservationPage(){

        frame = new JFrame("Main Reservation Page");
        frame.setContentPane(this.panel1);
        frame.setPreferredSize(new Dimension(800, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);

    }

}
