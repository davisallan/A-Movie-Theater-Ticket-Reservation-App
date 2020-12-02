package Model;

import java.util.ArrayList;

/**
 * The type Cancellation list.
 */
public class CancellationList {

    private ArrayList<Cancellation> cancellations;

    /**
     * Instantiates a new Cancellation list.
     */
    public CancellationList() {
        cancellations = new ArrayList<>();
    }

    /**
     * Add cancellation.
     *
     * @param cancellation the cancellation
     */
    public void addCancellation(Cancellation cancellation) {
        cancellations.add(cancellation);
    }

    /**
     * Search voucher boolean.
     *
     * @param voucherID the voucher id
     * @return the boolean
     */
    public boolean searchVoucher(int voucherID) {
        for (Cancellation cancel: cancellations) {
            if (cancel.getVoucher().getVoucherID() == voucherID) {
                return true;
            }
        }
        return false;
    }
}
