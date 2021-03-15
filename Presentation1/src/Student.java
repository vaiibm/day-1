
public class Student {
	private int studentID;
	private String studentName;

	Student(int studentID, String name) {
		this.studentID = studentID;
		this.studentName = name;
	}

	public int studentID() {
		return studentID;
	}

	public String getName() {
		return studentName;
	}
}
