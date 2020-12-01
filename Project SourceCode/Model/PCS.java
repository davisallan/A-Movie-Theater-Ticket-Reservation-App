package Model;


public class PCS {

    private Payment pay;
    private PaymentList payment;

    public PCS(){
        payment = new PaymentList();
    }

    public void createPayment(String name, CreditCard cc, User user) {
        Payment pay = new Payment(user, cc, name);
        payment.addPayment(pay);
    }

    public Payment getPay() {
        return pay;
    }

    public PaymentList getPayment() {
        return payment;
    }
}

