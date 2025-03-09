package a;

public class Solution {
	
	public int count = 0;
	public Student Students[] = new Student[100];
	public Project Projects[] = new Project[100];
	
	public void printSolution()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(Students[i].toString());
			System.out.println("Is assigned:");
			System.out.println(Projects[i].toString());
			System.out.println();
		}
	}
	
}
