
public class Developer {
	int developerID;

	public Developer(int developerID) {
		this.developerID = developerID;
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
		bug = Tester.bug[0];
		if (bug == null) {
			System.out.println("some error");
			return null;

		}
		if (bug.developerID == developerID) {
			return bug;
		}
		return null;
	}
}
