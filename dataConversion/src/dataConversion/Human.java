package dataConversion;

public class Human {
private String name;
private byte age;
public String getName() {
	return name;
}
public void setName(String name) {
	if(name == null || name.trim().equals("")) {
		throw new IllegalArgumentException("Name is madt");
	}
	this.name = name;
}

void eat() {
	System.out.println("human is eating");
}

public byte getAge() {
	System.out.println(this.age);
	return age;
}

public void setAge(byte age) {
	
	this.age = age;
}

}
