package Model;

import java.util.ArrayList;

public class PCS {

    private Payment pay;
    PaymentList payment;

    public PCS(){
        payment = new PaymentList();
    }

    public void createPayment(String name, CreditCard cc, User user) {
        Payment pay = new Payment(user, cc, name);
        payment.addPayment(pay);
    }

}

