package Model;

import java.util.ArrayList;

public class CancellationList {

    private ArrayList<Cancellation> cancellations;

    public CancellationList() {
        cancellations = new ArrayList<>();
    }

    public void addCancellation(Cancellation cancellation) {
        cancellations.add(cancellation);
    }

    public boolean searchVoucher(int voucherID) {
        for (Cancellation cancel: cancellations) {
            if (cancel.getVoucher().getVoucherID() == voucherID) {
                return true;
            }
        }
        return false;
    }
}
