
public class BugStatus {
	public STATUS status;

	BugStatus(STATUS status) {
		this.status = status;
	}

	BugStatus() {
		this.status = STATUS.NEW;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		if (status == STATUS.ASSIGNED) {
			System.out.println("assigned to developer. mailed respective pm and developer");
			this.status = status;
		} else if (status == STATUS.RETEST) {
			this.status = status;
			System.out.println("developer has fixed this and marked it for Retest");
		} else if (status == STATUS.CLOSED) {
			this.status = status;
			System.out.println("TESTER CLOSE THIS BUG");
		}

	}
}
