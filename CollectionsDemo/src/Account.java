
public class Account {
	private String name;
	private float balance;

	Account(String name, float balance) {
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "{Name : " + this.name + ", Balance : " + this.balance + "}";
	}

}
