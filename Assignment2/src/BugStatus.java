
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
//TODO:TO BE COMEPLETED
	public void setStatus(STATUS status) {
		if (status == STATUS.ASSIGNED) {
			System.out.println("assigned to developer. mailed respective pm and developer");
		} else if (status == STATUS.RETEST) {
			System.out.println("developer has fixed this and marked it for Retest");
		} else if (status == STATUS.CLOSED) {
			System.out.println("TESTER CLOSE THIS BUG");
		} else if (status == STATUS.DEFERRED) {
			System.out.println("Developer Deferred bug");
		}
		this.status = status;

	}
}
