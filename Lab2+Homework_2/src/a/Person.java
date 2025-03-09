package a;

public class Person {
	
	
	public String name;
	public Date birthDate = new Date();
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + birthDate.toString() + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate() {
	}
}
