
public class Institute {
public static void main(String[] args) {
	StudentAbstract student1= new CollegeStudent();
	student1.admit();
	student1.study();
	StudentAbstract student2= new HighSchoolStudent();
	student2.admit();
	student2.study();
	
}
}
