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
    private Menu menu;
    private MainController mainController;

    public GUIController() {
        setLoginForm(new LoginForm());
        setRegistrationForm(new RegistrationForm());
        setMenu(new Menu());

        //setting up all action listeners
        loginForm.signUpButton(new SignUpButton());
        loginForm.loginButton(new LoginButton());
        loginForm.continueAsGuestButton(new ContinueAsGuest());
        registrationForm.registerButton(new RegisterButton());

        loginForm.setVisible(true);
    }

    //action listener for launching the registration form
    private class SignUpButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            loginForm.setVisible(false);
            registrationForm.setVisible(true);
        }
    }

    //action listener for logging in a user
    private class LoginButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            boolean login = mainController.login(loginForm.getEmail().getText(), new String((loginForm.getPassword().getPassword())));
            if (login) {
                loginForm.getErrorMsg().setText("Logging in!");
                loginForm.setVisible(false);
                menu.setVisible(true);
            } else {
                loginForm.getErrorMsg().setText("Incorrect email or password");
            }
        }
    }

    private class ContinueAsGuest implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            loginForm.setVisible(false);
            menu.setVisible(true);
        }
    }

    //Action listener for registering a new registered user
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
    private class MakeReservation implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
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
