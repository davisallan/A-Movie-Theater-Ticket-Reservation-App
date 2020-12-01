package Model;

import java.util.Calendar;
import java.util.Date;

public class Refund {

    private Date date;
    private double amount;

    public Refund(double amount) {
        setDate(Calendar.getInstance().getTime());
        setAmount(amount);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Refund Date: %s \nRefund Amount: $%.2f",getDate(), getAmount());
    }
}
