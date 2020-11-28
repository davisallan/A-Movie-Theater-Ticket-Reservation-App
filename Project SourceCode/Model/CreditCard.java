package Model;

public class CreditCard {

	private String cardHolderName;
	private String cardNumber;
	private int CVC;
	private String expiry;
	
	public CreditCard(String cardHolderName, String cardNumber, int CVC, String expiry) {
		setCardHolderName(cardHolderName);
		setCardNumber(cardNumber);
		setCVC(CVC);
		setExpiry(expiry);
	}
	
	public void chargeCancellationFee() {
		
	}
	
	public void chargeAnnualFee() {
		
	}
	
	public void chargeReservationFee() {
		
	}
	
	public void receiveRefund() {
		
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCVC() {
		return CVC;
	}

	public void setCVC(int CVC) {
		this.CVC = CVC;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	@Override
	public String toString() {
		return "Card Name: " + getCardHolderName() +
				"CC Number: " + getCardNumber() + "\n" +
				"CVC: " + getCVC() + "\n" +
				"Expiry " + getExpiry() + "\n";
	}
}
