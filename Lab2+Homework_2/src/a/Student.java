package a;

public class Student extends Person{
	
	@Override
	public boolean equals(Object obj) {
			Student s = (Student) obj;
			if(s.name != name) return false;
			if(s.birthDate.year != birthDate.year) return false;
			if(s.birthDate.month != birthDate.month) return false;
			if(s.birthDate.day != birthDate.day) return false;
			if(s.registrationNumber != registrationNumber) return false;
			return true;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String registrationNumber;
	
	public Project acceptableProjects[] = new Project[10];
}
