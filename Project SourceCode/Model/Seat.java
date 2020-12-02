package Model;

/**
 * The type Seat.
 */
public class Seat {

	private int seatNumber;
	private boolean reserved = false;

	/**
	 * Instantiates a new Seat.
	 *
	 * @param seatNumber the seat number
	 */
	public Seat(int seatNumber) {
		setSeatNumber(seatNumber);
	}

	/**
	 * Is reserved boolean.
	 *
	 * @return the boolean
	 */
	public boolean isReserved() {
		return reserved;
	}

	/**
	 * Sets reserved.
	 */
	public void setReserved() {
		reserved = true;
	}

	/**
	 * Sets not reserved.
	 */
	public void setNotReserved() {
		reserved = false;
	}

	/**
	 * Gets seat number.
	 *
	 * @return the seat number
	 */
	public int getSeatNumber() {
		return seatNumber;
	}

	/**
	 * Sets seat number.
	 *
	 * @param seatNumber the seat number
	 */
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "Seat #" + getSeatNumber();
	}
}
