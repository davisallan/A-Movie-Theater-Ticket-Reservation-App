package Model;
//
//public class Refund {
//
//    private String date;
//    private double amount;
//
//    public Refund(String date, double amount) {
//        setDate(date);
//        setAmount(amount);
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//
//    public void setAmount(double amount) {
//        this.amount = amount;
//    }
//}

public interface Refund {

    // input the cost of the movie
    public double CalculateRefund(double amount);
}