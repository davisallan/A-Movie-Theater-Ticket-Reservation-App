package Model;

import java.util.ArrayList;

public class PCS {

    private Payment pay;

    private ArrayList paymentList;
    public PCS(){
        paymentList = new ArrayList();
    }



    public ArrayList getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(ArrayList paymentList) {
        this.paymentList = paymentList;
    }


    public void createPayment(String name, CreditCard cc, User user) {
        Payment pay = new Payment(user, cc, name);
        addPayment(pay);
    }

    public void addPayment (Payment pay){
        paymentList.add(pay);
    }
}

