
package Model;

/**
 * The type Payment.
 */
public class Payment {

	private User user;
	private CreditCard cc;
	private String name;

	/**
	 * Instantiates a new Payment.
	 *
	 * @param user the user
	 * @param cc   the cc
	 * @param name the name
	 */
	public Payment(User user, CreditCard cc, String name){
		setUser(user);
		setCc(cc);
		setName(name);
	}


	/**
	 * Gets user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets user.
	 *
	 * @param user the user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets cc.
	 *
	 * @return the cc
	 */
	public CreditCard getCc() {
		return cc;
	}

	/**
	 * Sets cc.
	 *
	 * @param cc the cc
	 */
	public void setCc(CreditCard cc) {
		this.cc = cc;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name.
	 *
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User: " + getUser() + ", CreditCard: " + getCc() + ", Name: " + getName();
	}
}

