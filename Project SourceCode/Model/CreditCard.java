package Model;

public class CreditCard {

	private String cardHolderName;
	private int cardNumber;
	private int CVC;
	private int expiry;
	
	public CreditCard(String cardHolderName, int cardNumber, int CVC, int expiry) {
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

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCVC() {
		return CVC;
	}

	public void setCVC(int CVC) {
		this.CVC = CVC;
	}

	public int getExpiry() {
		return expiry;
	}

	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}
}
