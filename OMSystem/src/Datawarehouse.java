
public class Datawarehouse {
	STATUS status;
	Order[] orders = new Order[10];

	Datawarehouse(ITEMS item, String address) {
		
		this.status = STATUS.PROCESSING;
	}

	public STATUS getStatus() {
		System.out.println(status);
		System.out.println("status checked");
		return status;
	}

}
