import java.util.Date;

public class Bug {
	public Bug(float buildVersion, Date submitOn, int id, String name, int productID, SEVERITY severity) {
		this.buildVersion = buildVersion;
		this.submitOn = submitOn;
		this.id = id;
		this.name = name;
		this.productID = productID;
		this.severity = severity;
	}

	int id;
	int developerID;
	int testerID;
	String name;
	String location;
	float buildVersion;
	Date submitOn;
	int productID;
	SEVERITY severity;

	BugStatus bugStatus = new BugStatus();

}