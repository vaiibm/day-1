
public class Teacher extends Human{
private String name;





public String gethQualification() {
	return hQualification;
}

public void sethQualification(String hQualification) {
	this.hQualification = hQualification;
}

private String hQualification;

Teacher(String name, byte age/*, String hQString*/)
{
	//sethQualification(hQString);
	setAge(age);
	setName(name);
}

void teach()
{
	System.out.println(this.name+" is teaching");
	
}
}
