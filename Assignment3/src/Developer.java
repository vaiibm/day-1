
public class Developer {
	int id;

	public Developer(int developerID) {
		this.id = developerID;
	}

	int setFixedStatus(Bug bug) {
		if (bug == null) {
			System.out.println("Some error");
			return -1;
		}
		bug.bugStatus.setStatus(STATUS.RETEST);

		return 1;

	}

	Bug getMyBug() {
		Bug bug;
		bug = Project.bug[0];
		if (bug == null) {
			System.out.println("some error");
			return null;

		}
		if (bug.developerID == id && bug.bugStatus.status == STATUS.ASSIGNED) {
			return bug;
		}
		return null;
	}

	public int setFixedStatus(Bug bug1, STATUS deferred) {
		if (bug1 == null) {
			System.out.println("Some error");
			return -1;
		}
		bug1.bugStatus.setStatus(STATUS.DEFERRED);

		return 1;
	}
}
