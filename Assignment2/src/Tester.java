
public class Tester {

	int id;

	public Tester(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	void assignBug(Bug bug, int developerID) {
		bug.developerID = developerID;
		bug.bugStatus.setStatus(STATUS.ASSIGNED);
		System.out.println("assined bug to developer with id= " + developerID);
	}

	public Bug createBugReport(String bugID, String bugName, String projectID, int priority) {
		Bug bug = new Bug(bugID, bugName, projectID, 0);
		System.out.println("Created bug report");
		return bug;
	}

}
