package a;

public class Main {
	public static void main(String[] args) {
		
		Project p = new Project();
		p.setType(Project.Type.THEORETICAL);
		
		Student s = new Student();
		s.setName("Haralambie");
		//s.setBirthDate();
		s.birthDate.year = 1875;
		s.birthDate.month = 12;
		s.birthDate.day = 14;
		
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		
	}
}
