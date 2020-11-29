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
        menu.logoutButton(new LogoutButton());
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

            try {
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
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "An error occurred, please try again");
                return;
            }
            JOptionPane.showMessageDialog(null, "Thank you! Account created!");
            //TODO clear all of the text fields before making the form go away
            registrationForm.setVisible(false);
            loginForm.setVisible(true);
        }
    }
    private class MakeReservationButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    private class CancelReservationButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    private class LogoutButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            menu.setVisible(false);
            mainController.setLoggedInUser(null);
            loginForm.setVisible(true);
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
