import java.util.Date;

public class Project {
	static Bug[] bug = new Bug[10];

	public static void main(String[] args) {
		Bug bug1;
		boolean bugPresent = true;
		Tester tester = new Tester(11);
		Developer developer = new Developer(11);

		System.out.println("Developer build product and sent it to tester");

		if (bugPresent) {
			bug[0] = tester.createBugReport(1.1f, new Date("03/11/2021"), 1, "first bug", 55, SEVERITY.LEVEL1);
			tester.assignBug(bug[0], 11);

			System.out.println("Now Developer");

			bug1 = developer.getMyBug();
			if (bug1 == null) {
				System.out.println("No bug yet");
				return;
			}
			System.out.println("My bug details are id= " + bug1.id + ", Bugname= " + bug1.name + ", product id= "
					+ bug1.productID + ", Severity is = " + bug1.severity + " Date = " + bug1.submitOn);
			developer.setFixedStatus(bug1, STATUS.DEFERRED);
			// developer.setFixedStatus(bug1);

			;
			bug1 = tester.getRetestBug();
			if (bug1 == null) {
				System.out.println("No bug yet to retest");
				return;
			}
			bug[0] = tester.closeBug(bug1);
		}
	}
}
