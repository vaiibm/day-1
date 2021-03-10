package dataConversion;

public class Student extends Human {
public Student(String name) {
	this.setName(name);
}
public GENDER getGender() {
	return gender;
}
public void setGender(GENDER gender) {
	this.gender = gender;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
void eat() {
	super.eat();
	System.out.println("Student is eating");
}
private String name;
//private byte age;
private GENDER gender;

}
