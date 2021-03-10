
public class StaticKeyword {
public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();
	s2.setCount(1);
	System.out.println(s1.getCount());
	System.out.println(s2.getCount());
	
}
}

class Student{
	private static int count;
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count= count;
	}
}