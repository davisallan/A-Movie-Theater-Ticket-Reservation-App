package Model;

import java.util.ArrayList;

public class PCS {

    private Payment pay;
    PaymentList payment;

    public void createPayment(String name, CreditCard cc, User user) {
        Payment pay = new Payment(user, cc, name);
        payment.addPayment(pay);
    }

//    public void addPayment (Payment pay){
//        paymentList.add(pay);
//    }
}

