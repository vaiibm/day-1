
public class InnerClassDemo {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
	
	for(int i=0;i<accounts.length;i++) {
		Account account=new Account();
		accounts[i]=account;
	}
	for (Account account : accounts) {
		
	}
}
}

class Account {
	private Address[] addresses;
	private int number;
	public Account() {
		this.addresses=new Address[3];
	}
	class Address {
		private String streetname;
	}
	public Address[] getAddress() {
		return addresses;
	}
	public void setAddress(Address[] address) {
		this.addresses = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}