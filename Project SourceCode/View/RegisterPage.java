package View;

import javax.swing.*;
import java.awt.*;

public class RegisterPage {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton signUpButton;
    private JPanel panel1;
    private JPasswordField passwordField1;

    public RegisterPage(){

        JFrame frame = new JFrame("Registration");
        frame.setContentPane(this.panel1);
        frame.setPreferredSize(new Dimension(800, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);

    }


}


