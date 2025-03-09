package a;

public class Teacher extends Person {
	@Override
	public boolean equals(Object obj) {
		Teacher s = (Teacher) obj;
		if(s.name != name) return false;
		if(s.birthDate.year != birthDate.year) return false;
		if(s.birthDate.month != birthDate.month) return false;
		if(s.birthDate.day != birthDate.day) return false;
		
		return true;
	}

	public Project proposedProjects[] = new Project[10];
}
