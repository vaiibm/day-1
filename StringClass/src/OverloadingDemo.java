
public class OverloadingDemo {
public static void main(String[] args) {
	Student1 s1 = new Student1();
	s1.study();
	s1.study(1);
	
}
}
class Student1{
	public void study(int duration, String subject) {
		System.out.println("study.. for "+duration+" hour"+subject);
		
	}
	public void study(int duration) {
		System.out.println("study ... fir "+duration+" hour");
	}
	public void study()
{
		System.out.println("study...");
		}
}
