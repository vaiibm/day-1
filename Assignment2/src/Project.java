
public class Project {
	static Bug[] bug = new Bug[10];

	public static void main(String[] args) {
		Tester tester = new Tester(11);
		bug[0] = tester.createBugReport("777", "first bug", "firstProject", 0);
		tester.assignBug(bug[0], 1);

		Bug bug1;
		System.out.println("Now Developer");
		Developer d = new Developer(1);
		bug1 = d.getMyBug();
		if (bug1 == null) {
			System.out.println("No bug yet");
			return;
		}
		System.out.println("My bug details are id= " + bug1.id + ", Bugname= " + bug1.bugName + ", project name= "
				+ bug1.projectID);
		d.setFixedStatus(bug1);

		;
	}
}
