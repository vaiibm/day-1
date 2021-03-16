
public class Developer {
	int id;

	public Developer(int developerID) {
		this.id = developerID;
	}

	int setFixedStatus(Bug bug) {
		System.out.println("I Fixed bug.");
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
		if (bug.developerID == id) {
			return bug;
		}
		return null;
	}
}
