package Controller;

import Model.*;

/**
 * The type Payment controller.
 */
public class PaymentController {

    /**
     * The Payment ctrl sys.
     */
    PCS paymentCtrlSys;

    /**
     * Instantiates a new Payment controller.
     *
     * @param paymentCtrlSys the payment ctrl sys
     */
    public PaymentController(PCS paymentCtrlSys){
        setPaymentCtrlSys(paymentCtrlSys);
    }

    /**
     * Create payment.
     *
     * @param name the name
     * @param cc   the cc
     * @param user the user
     */
    public void createPayment(String name, CreditCard cc, User user){
        paymentCtrlSys.createPayment(name, cc, user);
    }

    /**
     * Gets payment ctrl sys.
     *
     * @return the payment ctrl sys
     */
    public PCS getPaymentCtrlSys() {
        return paymentCtrlSys;
    }

    /**
     * Sets payment ctrl sys.
     *
     * @param paymentCtrlSys the payment ctrl sys
     */
    public void setPaymentCtrlSys(PCS paymentCtrlSys) {
        this.paymentCtrlSys = paymentCtrlSys;
    }
}