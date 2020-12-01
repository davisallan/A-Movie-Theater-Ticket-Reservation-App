package Model;

import java.util.ArrayList;

public class PaymentList {

    private ArrayList<Payment> paymentList;

    public PaymentList(){
        paymentList = new ArrayList<>();
    }


    public void addPayment(Payment pay){
        paymentList.add(pay);
        System.out.println("Added payemnt" + pay);
    }
}
