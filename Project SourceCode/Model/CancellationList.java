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
}
