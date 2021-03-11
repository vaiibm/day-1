
public class FinalKeyword {
public static void main(String[] args) {
	Parent child= new Child();
	child.m1();
	child.m2();
}
}
 class Parent {
	final String name="vai";
 void m1() {
		System.out.println("parent");
		
	}
 
 void m2()
 {
	 System.out.println("parentm2");
 }
}
class Child extends Parent{
	void m1() {
		System.out.println("Child");
	}
	//@Override
	void m2() {
		System.out.println("Childm2");
	}
}