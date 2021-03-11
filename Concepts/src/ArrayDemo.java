
public class ArrayDemo {
	public static void main(String[] args) {
		int[] scores = new int[10];
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		int[] numbers = { 1, 2, 3, 4 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		boolean[] booleans = { true, false};
		for (boolean value : booleans) {
			System.out.println(value);
		}
		boolean[] booleans1 = new boolean[2];
		for (boolean value : booleans1) {
			System.out.println(value);
		}
		String[] names= new String[10];
		for (String name : names) {
			name="ram";
			System.out.println(name);
		}
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			Student student = new Student("ram"+i);
			students[i]=student;
			if (i==5)
				break;
		}
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName());
		}
		

	}
}

class Student {
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	private String name;
}
