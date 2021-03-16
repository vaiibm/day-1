
public class Tester {
	public static void main(String[] args) {

		bug[0] = createBugReport("1", "first", "firstProject", 0);
		assignBug(bug[0], 1);
		if (true) {
			// System.out.println("hey");
		}

		Bug bug1;
		Developer d = new Developer(1);
		bug1 = d.getMyBug();
		if (bug1 == null) {
			System.out.println("No bug yet");
			return;
		}
		System.out.println("My bug details are id= " + bug1.bugID + " Bugname= " + bug1.bugName + " project name= "
				+ bug1.projectID);
		d.setStatus(bug1);

		;
	}

	static Bug[] bug = new Bug[10];

	private static void assignBug(Bug bug, int developerID) {
		bug.developerID = developerID;
		bug.bugStatus.status = STATUS.ASSIGNED;
		System.out.println("assined bug to developer with id= " + developerID);
	}

	public static Bug createBugReport(String bugID, String bugName, String projectID, int priority) {
		Bug bug = new Bug(bugID, bugName, projectID, 0);
		System.out.println("Created bug report");
		return bug;
	}

}
