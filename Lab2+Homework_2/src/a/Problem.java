package a;

public class Problem {
	
	public int count = 0;
	public int countp = 0;
	public Person peopleInvolved[] = new Person[100];
	public Project assignedProjects[] = new Project[100];
	
	public Person[] getPeopleInvolved() {
		return peopleInvolved;
	}
	
	public int addPerson(Person p)
	{
		if (count != 99)
		{
			for(int i=0;i<count;i++)
			{
				if(peopleInvolved[i].equals(p)) return -1;
			}
			peopleInvolved[count++] = p;
			
		}
		return 0;
	}
	
	public int addProject(Project p)
	{
		if (countp != 99)
		{
			for(int i=0;i<countp;i++)
			{
				if(assignedProjects[i].equals(p)) return -1;
			}
			assignedProjects[countp++] = p;
			
		}
		return 0;
	}
	
	
	public Solution createSolution()
	{
		Solution sol = new Solution();
		for(int i=0;i<count;i++)
		{
			if(peopleInvolved[i] instanceof Student)
			{
				sol.count++;
				sol.Students[i] = (Student)peopleInvolved[i];
				int j = 0;
				while(addProject(sol.Students[i].acceptableProjects[j]) == -1)
				{
					j++;
				}
				if(j==10) return null;
				else  sol.Projects[i] = sol.Students[i].acceptableProjects[j];
			}
		}
		return sol;
	}
	
}
