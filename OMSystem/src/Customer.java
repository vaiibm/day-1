
public class Customer {
	public static void main(String[] args) {
		Datawarehouse datawarehouse = order();
		datawarehouse.getStatus();
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	private String name;

	public static Datawarehouse order() {
		Datawarehouse datawarehouse = new Datawarehouse(ITEMS.MILK, "MyAddress");
		System.out.println("I ordered");
		return datawarehouse;
	}

}
