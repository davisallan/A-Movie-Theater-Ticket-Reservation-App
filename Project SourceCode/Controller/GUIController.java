package Controller;
import Model.CreditCard;
import View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the GUI
 */

public class GUIController {

    private LoginForm loginForm;
    private RegistrationForm registrationForm;
    private MainController mainController;

    public GUIController() {
        setLoginForm(new LoginForm());
        setRegistrationForm(new RegistrationForm());

        loginForm.signUpButton(new SignUpButton());
        registrationForm.registerButton(new RegisterButton());

        loginForm.setVisible(true);
    }

    private class SignUpButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            loginForm.setVisible(false);
            registrationForm.setVisible(true);
        }
    }

    private class RegisterButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "Thank you! Account created!");
            mainController.getUserCtrl().createRegisteredUser(500,
                    registrationForm.getFirstName().getText(),
                    registrationForm.getLastName().getText(),
                    registrationForm.getEmail().getText(),
                    registrationForm.getPassword().getText(),
                    new CreditCard(registrationForm.getFirstName().getText()
                            + " " + registrationForm.getLastName().getText(),
                            registrationForm.getCcNum().getText(),
                            Integer.parseInt(registrationForm.getExpiry().getText()),
                            registrationForm.getCvc().getText()));
            registrationForm.setVisible(false);
            loginForm.setVisible(true);
        }
    }

    public void setLoginForm(LoginForm loginForm) {
        this.loginForm = loginForm;
    }

    public LoginForm getLoginForm() {
        return loginForm;
    }

    public void setRegistrationForm(RegistrationForm registrationForm) {
        this.registrationForm = registrationForm;
    }

    public RegistrationForm getRegistrationForm() {
        return registrationForm;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
