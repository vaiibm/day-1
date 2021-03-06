
public class Developer {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Developer(int developerID) {
		this.id = developerID;
	}

	int setBugStatus(Bug bug) {
		if (bug == null) {
			System.out.println("Some error");
			return -1;
		}
		bug.getBugStatus().setStatus(STATUS.RETEST);

		return 1;

	}

	Bug getMyBug() {
		Bug bug;
		bug = Project.bug[0];
		if (bug == null) {
			System.out.println("some error");
			return null;

		}
		if (bug.getDeveloperID() == getId() && bug.getBugStatus().status == STATUS.ASSIGNED) {
			return bug;
		}
		return null;
	}

	public int setBugStatus(Bug bug1, STATUS deferred) {
		if (bug1 == null) {
			System.out.println("Some error");
			return -1;
		}
		bug1.getBugStatus().setStatus(STATUS.DEFERRED);

		return 1;
	}
}
