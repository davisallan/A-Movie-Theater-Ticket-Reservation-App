package Model;

import java.util.ArrayList;

/**
 * The type Payment list.
 */
public class PaymentList {

    private ArrayList<Payment> paymentList;

    /**
     * Instantiates a new Payment list.
     */
    public PaymentList(){
        paymentList = new ArrayList<>();
    }

    /**
     * Add payment.
     *
     * @param pay the pay
     */
    public void addPayment(Payment pay){
        paymentList.add(pay);
    }
}
