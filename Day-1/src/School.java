
public class School {
	public static void main(String[] args) {
		
		
		
		System.out.println("hello");
		Student student = new Student("sa");
        for(int i=0; i<10;i++){
			Teacher teacher = new Teacher("shyam"+i, (byte)25);
		}
		//System.out.println(teacher.getName())
		System.out.println("name : "+ student.getName()+" with age "+ student.getAge());
		
		
		Teacher teacher1 = new Teacher("vaibhav", (byte)25/*, "ME"*/);
		System.out.println("teacher : "+ teacher1.gethQualification()+" with age "+ teacher1.getAge());
		
		
	}
	
	void printPattern() {
		int j=0;
		for(int i=0;i<5;i++) {
			j++;
			for(int k=0;k<j;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
	}
	}
	

}
