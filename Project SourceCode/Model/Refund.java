package Model;

import java.util.Calendar;
import java.util.Date;

/**
 * The type Refund.
 */
public class Refund {

    private Date date;
    private double amount;

    /**
     * Instantiates a new Refund.
     *
     * @param amount the amount
     */
    public Refund(double amount) {
        setDate(Calendar.getInstance().getTime());
        setAmount(amount);
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Refund Date: %s \nRefund Amount: $%.2f",getDate(), getAmount());
    }
}
