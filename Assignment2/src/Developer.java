
public class Developer {
	static int developerID;

	public Developer(int developerID) {
		// TODO Auto-generated constructor stub
		this.developerID = developerID;
	}

	static int setStatus(Bug bug) {
		if (bug == null) {
			System.out.println("Some error");
			return -1;
		}
		bug.bugStatus.status = STATUS.FIXED;
		System.out.println("fixed and send for review");
		return 1;

	}

	static Bug getMyBug() {
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
