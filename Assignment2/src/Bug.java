import java.util.Date;

public class Bug {
	public Bug(float buildVersion, Date submitOn, int id, String name, int productID, SEVERITY severity) {
		this.setBuildVersion(buildVersion);
		this.setSubmitOn(submitOn);
		this.setId(id);
		this.setName(name);
		this.setProductID(productID);
		this.setSeverity(severity);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeveloperID() {
		return developerID;
	}

	public void setDeveloperID(int developerID) {
		this.developerID = developerID;
	}

	public int getTesterID() {
		return testerID;
	}

	public void setTesterID(int testerID) {
		this.testerID = testerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(float buildVersion) {
		this.buildVersion = buildVersion;
	}

	public Date getSubmitOn() {
		return submitOn;
	}

	public void setSubmitOn(Date submitOn) {
		this.submitOn = submitOn;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public SEVERITY getSeverity() {
		return severity;
	}

	public void setSeverity(SEVERITY severity) {
		this.severity = severity;
	}

	public BugStatus getBugStatus() {
		return bugStatus;
	}

	public void setBugStatus(BugStatus bugStatus) {
		this.bugStatus = bugStatus;
	}

	private int id;
	private int developerID;
	private int testerID;
	private String name;
	private String location;
	private float buildVersion;
	private Date submitOn;
	private int productID;
	private SEVERITY severity;

	private BugStatus bugStatus = new BugStatus();

}