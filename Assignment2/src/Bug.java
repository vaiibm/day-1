public class Bug {
	public Bug(String bugID, String bugName, String projectID, int priority) {
		this.bugID = bugID;
		this.bugName = bugName;
		this.projectID = projectID;
		this.priority = priority;
		// TODO Auto-generated constructor stub
	}

	String bugID = new String();
	String bugName = new String();
	String projectID = new String();
	int developerID;
	int priority;
	// String description;
	BugStatus bugStatus = new BugStatus();

}