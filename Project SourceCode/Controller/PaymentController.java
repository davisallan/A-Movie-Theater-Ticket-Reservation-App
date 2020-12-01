package Controller;

import Model.*;

public class PaymentController {

    PCS paymentCtrlSys;

    public PaymentController(PCS paymentCtrlSys){
        setPaymentCtrlSys(paymentCtrlSys);
    }

    public void createPayment(String name, CreditCard cc, User user){
        paymentCtrlSys.createPayment(name, cc, user);
    }

    public PCS getPaymentCtrlSys() {
        return paymentCtrlSys;
    }

    public void setPaymentCtrlSys(PCS paymentCtrlSys) {
        this.paymentCtrlSys = paymentCtrlSys;
    }
}