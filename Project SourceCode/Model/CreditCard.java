package Model;

/**
 * The type Credit card.
 */
public class CreditCard {

	private String cardHolderName;
	private String cardNumber;
	private int CVC;
	private String expiry;

	/**
	 * Instantiates a new Credit card.
	 *
	 * @param cardHolderName the card holder name
	 * @param cardNumber     the card number
	 * @param CVC            the cvc
	 * @param expiry         the expiry
	 */
	public CreditCard(String cardHolderName, String cardNumber, int CVC, String expiry) {
		setCardHolderName(cardHolderName);
		setCardNumber(cardNumber);
		setCVC(CVC);
		setExpiry(expiry);
	}

	/**
	 * Gets card holder name.
	 *
	 * @return the card holder name
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}

	/**
	 * Sets card holder name.
	 *
	 * @param cardHolderName the card holder name
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/**
	 * Gets card number.
	 *
	 * @return the card number
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * Sets card number.
	 *
	 * @param cardNumber the card number
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * Gets cvc.
	 *
	 * @return the cvc
	 */
	public int getCVC() {
		return CVC;
	}

	/**
	 * Sets cvc.
	 *
	 * @param CVC the cvc
	 */
	public void setCVC(int CVC) {
		this.CVC = CVC;
	}

	/**
	 * Gets expiry.
	 *
	 * @return the expiry
	 */
	public String getExpiry() {
		return expiry;
	}

	/**
	 * Sets expiry.
	 *
	 * @param expiry the expiry
	 */
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	@Override
	public String toString() {
		return "Card Name: " + getCardHolderName() + " \n" +
				"CC Number: " + getCardNumber() + " \n" +
				"CVC: " + getCVC() + " \n" +
				"Expiry " + getExpiry();
	}
}
