import java.util.Date;

public class Tester {

	private int id;

	public Tester(int id) {
		this.setId(id);
	}

	void assignBug(Bug bug, int developerID) {
		bug.setDeveloperID(developerID);
		bug.getBugStatus().setStatus(STATUS.ASSIGNED);
		System.out.println("assined bug to developer with id= " + developerID);
	}

	public Bug createBugReport(float buildVersion, Date submitOn, int id, String name, int productID,
			SEVERITY severity) {
		Bug bug = new Bug(buildVersion, submitOn, id, name, productID, severity);
		bug.setTesterID(getId());
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
		if (bug.getBugStatus().status == STATUS.RETEST) {
			System.out.println("Retest bug details are id= " + bug.getId() + ", Bugname= " + bug.getName() + ", product id= "
					+ bug.getProductID() + ", Severity is = " + bug.getSeverity());

			return bug;
		}
		return null;
	}

	public Bug closeBug(Bug bug1) {
		// TODO Auto-generated method stub
		bug1.getBugStatus().setStatus(STATUS.CLOSED);
		return null;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
