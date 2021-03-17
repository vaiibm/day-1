import java.util.Date;

public class Tester {

	int id;

	public Tester(int id) {
		this.id = id;
	}

	void assignBug(Bug bug, int developerID) {
		bug.developerID = developerID;
		bug.bugStatus.setStatus(STATUS.ASSIGNED);
		System.out.println("assined bug to developer with id= " + developerID);
	}

	public Bug createBugReport(float buildVersion, Date submitOn, int id, String name, int productID,
			SEVERITY severity) {
		Bug bug = new Bug(buildVersion, submitOn, id, name, productID, severity);
		bug.testerID = id;
		System.out.println("Tester Created bug report");
		return bug;
	}

	public Bug getRetestBug() {
		Bug bug;
		bug = Project.bug[0];
		if (bug == null) {
			System.out.println("some error");
			return null;

		}
		if (bug.bugStatus.status == STATUS.RETEST) {
			System.out.println("Retest bug details are id= " + bug.id + ", Bugname= " + bug.name + ", product id= "
					+ bug.productID + ", Severity is = " + bug.severity);

			return bug;
		}
		return null;
	}

	public Bug closeBug(Bug bug1) {
		// TODO Auto-generated method stub
		bug1.bugStatus.setStatus(STATUS.CLOSED);
		return null;

	}

}
