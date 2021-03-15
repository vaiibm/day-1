
public class Array {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(i, "Vai" + i);
		}
		System.out.println(students.length);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].studentID() + " name : " +students[i].getName());
		}
	}
}
