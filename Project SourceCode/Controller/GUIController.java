package Controller;

import Model.CreditCard;
import Model.Movie;
import Model.ShowTime;
import Model.Theatre;
import View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

/**
 * Controller for the GUI
 */

public class GUIController {

    private LoginForm loginForm;
    private RegistrationForm registrationForm;
    private Menu menu;
    private ReservationForm reservationForm;
    private PaymentForm paymentForm;
    private AnnualFeeForm annualFeeForm;
    private SeatSelectionForm seatSelectionForm;
    private CancellationForm cancellationForm;
    private MainController mainController;

    public GUIController() {
        setLoginForm(new LoginForm());
        setRegistrationForm(new RegistrationForm());
        setMenu(new Menu());
        setReservationForm(new ReservationForm());
        setCancellationForm(new CancellationForm());
        setPaymentForm(new PaymentForm());
        setAnnualFeeForm(new AnnualFeeForm());
        setSeatSelectionForm(new SeatSelectionForm());

        //setting up all action listeners
        loginForm.signUpButton(new SignUpButton());
        loginForm.loginButton(new LoginButton());
        loginForm.continueAsGuestButton(new ContinueAsGuest());

        registrationForm.registerButton(new RegisterButton());

        menu.reservationButton(new MakeReservationButton());
        menu.cancelReservation(new CancelReservationButton());
        menu.logoutButton(new LogoutButton());

        reservationForm.returnToMenu(new ReturnToMenu());
        reservationForm.movieList(new MovieList());
        reservationForm.showTimeList(new ShowTimeList());
        reservationForm.seatSelection(new SeatSelection());

        seatSelectionForm.seatButtonListener(new SeatButton());
        seatSelectionForm.confirmSelection(new ConfirmSelection());
        seatSelectionForm.returnToReservation(new ReturnToReservation());

        annualFeeForm.submitAnnualFeePayment(new SubmitAnnualFeePayment());

        paymentForm.submitPayment(new SubmitPayment());
        paymentForm.returnToReservation(new ReturnToReservation());

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

    //action listener to continue as a guest in the system
    private class ContinueAsGuest implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            loginForm.setVisible(false);
            menu.setVisible(true);
        }
    }

    //action listener for registering a new registered user
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
            JOptionPane.showMessageDialog(null, "Thank you! Account created! You are now required to pay the annual fee of $20");

            registrationForm.setVisible(false);
            annualFeeForm.getSubTotal().setText("$20.00");
            annualFeeForm.getEmail().setText(registrationForm.getEmail().getText());
            annualFeeForm.getCardName().setText(registrationForm.getFirstName().getText() + " " + registrationForm.getLastName().getText());
            annualFeeForm.getCcNum().setText(registrationForm.getCcNum().getText());
            annualFeeForm.getExpiry().setText(registrationForm.getExpiry().getText());
            annualFeeForm.getCvc().setText(registrationForm.getCvc().getText());
            annualFeeForm.setVisible(true);
            registrationForm.clearAllFields();
        }
    }

    private class SubmitAnnualFeePayment implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "Thank you! Payment accepted, account now ready for use!");
            annualFeeForm.setVisible(false);
            annualFeeForm.clearAllTextFields();
            loginForm.setVisible(true);
        }
    }

    //action listener for making a reservation
    private class MakeReservationButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            menu.setVisible(false);

            DefaultListModel<String> model = new DefaultListModel<>();
            Theatre theatre = mainController.getTheatreCtrl().getTheatreCtrlSys().getTheatre();
            for (Movie movie: theatre.getMovieList()) {
                model.addElement(movie.getMovieName());
            }
            reservationForm.getMovies().setModel(model);
            reservationForm.setVisible(true);

        }
    }

    //action listener for cancelling a reservation
    //TODO implement the cancellation of a ticket
    private class CancelReservationButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    //action listener for logging out of the application
    private class LogoutButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            menu.setVisible(false);
            mainController.setLoggedInUser(null);
            loginForm.clearAllFields();
            loginForm.setVisible(true);
        }
    }

    //action listener for the movie list JList on the reservation page
    private class MovieList extends MouseAdapter {

        public void mouseClicked(MouseEvent me) {
            JList selection = (JList)me.getSource();
            int index = selection.locationToIndex(me.getPoint());
            Movie selected = mainController.getTheatreCtrl().getTheatreCtrlSys().getMovies().get(index);
            //setting the selected movie in the theatre controller
            mainController.getTheatreCtrl().setSelectedMovie(selected);
            DefaultListModel<String> model = new DefaultListModel<>();
            for (ShowTime time: selected.getShowTimeList()) {
                model.addElement("Date: " + time.getDate() + ", Time: " + time.getTime());
            }
            reservationForm.getShowtimes().setModel(model);
        }
    }

    //action listener for the show time list JList on the reservation page
    private class ShowTimeList extends MouseAdapter {

        public void mouseClicked(MouseEvent me) {
            JList selection = (JList)me.getSource();
            int index = selection.locationToIndex(me.getPoint());
            ShowTime selected = mainController.getTheatreCtrl().getSelectedMovie().getShowTimeList().get(index);
            System.out.println(mainController.getTheatreCtrl().getSelectedMovie());
            System.out.println(mainController.getTheatreCtrl().getSelectedMovie().getShowTimeList().get(index));
            //setting the selected showtime in the theatre controller
            mainController.getTheatreCtrl().setSelectedShowTime(selected);
        }
    }

    //action listener for the return to menu button on the reservation page
    private class ReturnToMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            reservationForm.setVisible(false);
            menu.setVisible(true);
        }
    }

    //action listener for continuing to the seat selection page from the reservation page
    private class SeatSelection implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            reservationForm.setVisible(false);
            seatSelectionForm.updateSeatMap(mainController.getTheatreCtrl().getSelectedShowTime().getSeats());
            seatSelectionForm.setVisible(true);
        }
    }

    //action listener for the radio buttons when you are selecting a seat, updates selection and price text fields
    private class SeatButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int index = 0;
            int numSelected = 0;
            StringBuilder selection = new StringBuilder();
            for (JRadioButton seat: seatSelectionForm.getButtons()) {
                if (seat.isSelected()) {
                    selection.append(index + 1).append(", ");
                    numSelected++;
                }
                index++;
            }
            seatSelectionForm.getSelection().setText(selection.toString());
            seatSelectionForm.getPrice().setText(String.valueOf(numSelected * 21.50));
        }
    }

    //action listener to confirm seat selection and open up the payment form, if the user is logged in it will remember their credit card
    private class ConfirmSelection implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            seatSelectionForm.setVisible(false);
            paymentForm.getSubTotal().setText(seatSelectionForm.getPrice().getText());
            paymentForm.getSeatsSelected().setText(seatSelectionForm.getSelection().getText());

            if (mainController.getLoggedInUser() != null) {
                paymentForm.getEmail().setText(mainController.getLoggedInUser().getEmail());
                paymentForm.getCardName().setText(mainController.getLoggedInUser().getCreditCard().getCardHolderName());
                paymentForm.getCcNum().setText(mainController.getLoggedInUser().getCreditCard().getCardNumber());
                paymentForm.getExpiry().setText(mainController.getLoggedInUser().getCreditCard().getExpiry());
                paymentForm.getCvc().setText(String.valueOf(mainController.getLoggedInUser().getCreditCard().getCVC()));
            }

            paymentForm.setVisible(true);
        }
    }

    //action listener for the payment form to return to the reservation page
    private class ReturnToReservation implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            seatSelectionForm.setVisible(false);
            paymentForm.setVisible(false);
            reservationForm.setVisible(true);
        }
    }

    //action listener for submitting payment, reserves the selected seats from the seat selection page
    private class SubmitPayment implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String[] selection = seatSelectionForm.getSelection().getText().split(",");

            for (int i = 0; i < selection.length - 1; i++) {
                int seatNum = Integer.parseInt(selection[i].stripLeading());
                //reserving the selected seats in that particular showtime
                mainController.getTheatreCtrl().getSelectedShowTime().getSeats().get(seatNum - 1).setReserved();
            }

            //TODO create an actual "ticket object" and add it to the masterTicketList

            JOptionPane.showMessageDialog(null, "Thank you for your purchase! " +
                    "Tickets have been emailed to :" + paymentForm.getEmail().getText());
            paymentForm.setVisible(false);
            menu.setVisible(true);
        }
    }

    public AnnualFeeForm getAnnualFeeForm() {
        return annualFeeForm;
    }

    public void setAnnualFeeForm(AnnualFeeForm annualFeeForm) {
        this.annualFeeForm = annualFeeForm;
    }

    public ReservationForm getReservationForm() {
        return reservationForm;
    }

    public void setReservationForm(ReservationForm reservationForm) {
        this.reservationForm = reservationForm;
    }

    public MainController getMainController() {
        return mainController;
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

    public PaymentForm getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(PaymentForm paymentForm) {
        this.paymentForm = paymentForm;
    }

    public SeatSelectionForm getSeatSelectionForm() {
        return seatSelectionForm;
    }

    public void setSeatSelectionForm(SeatSelectionForm seatSelectionForm) {
        this.seatSelectionForm = seatSelectionForm;
    }

    public CancellationForm getCancellationForm() {
        return cancellationForm;
    }

    public void setCancellationForm(CancellationForm cancellationForm) {
        this.cancellationForm = cancellationForm;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
