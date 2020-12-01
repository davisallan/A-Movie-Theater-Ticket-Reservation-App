
package Model;

public class Payment {

	private User user;
	private CreditCard cc;
	private String name;

	public Payment(User user, CreditCard cc, String name){
		setUser(user);
		setCc(cc);
		setName(name);
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CreditCard getCc() {
		return cc;
	}

	public void setCc(CreditCard cc) {
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User: " + getUser() + ", CreditCard: " + getCc() + ", Name: " + getName();
	}
}

