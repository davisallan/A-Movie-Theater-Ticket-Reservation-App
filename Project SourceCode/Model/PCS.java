package Model;


/**
 * The type Pcs.
 */
public class PCS {

    private Payment pay;
    private PaymentList payment;

    /**
     * Instantiates a new Pcs.
     */
    public PCS(){
        payment = new PaymentList();
    }

    /**
     * Create payment.
     *
     * @param name the name
     * @param cc   the cc
     * @param user the user
     */
    public void createPayment(String name, CreditCard cc, User user) {
        Payment pay = new Payment(user, cc, name);
        payment.addPayment(pay);
    }

    /**
     * Gets pay.
     *
     * @return the pay
     */
    public Payment getPay() {
        return pay;
    }

    /**
     * Gets payment.
     *
     * @return the payment
     */
    public PaymentList getPayment() {
        return payment;
    }
}

