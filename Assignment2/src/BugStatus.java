
public class BugStatus {
	public STATUS status;

	BugStatus(STATUS status) {
		this.status = status;
	}

	BugStatus() {
		this.status = status.NEW;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		if (status == status.ASSIGNED) {
			System.out.println("assigned to developer. mailed respective pm and developer");
			this.status = status;
		}
	}

}
