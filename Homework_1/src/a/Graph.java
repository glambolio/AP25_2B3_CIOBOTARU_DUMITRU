package a;

public class Graph {
	public int[][] adjacencyMatrix = new int[100][100];
	
	public int vertexCount;
	
	public void initialize()
	{
		if (vertexCount<100)
		{
			for(int i=0; i<vertexCount; i++)
			{
				for(int j=0; j<vertexCount; j++)
				{
					adjacencyMatrix[i][j] = 0;
				}
			}
		}
	}
	
	public void display()
	{
		if (vertexCount<100)
		{
			System.out.print("   ");
			for(int i=0; i<vertexCount; i++)
			{
				int aux = i+1;
				System.out.print(" " + aux +"  ");
			}
			System.out.println();
			
			
			System.out.print("  ");
			System.out.print('\u250F');
			for(int i=0; i<vertexCount*4-1; i++)
				System.out.print('\u2501');
			System.out.print('\u2513');
			System.out.println();
			
			
			for(int i=0; i<vertexCount; i++)
			{
				int aux = i+1;
				System.out.print(aux);
				System.out.print(" ");
				System.out.print('\u2503');
				
				for(int j=0; j<vertexCount; j++)
				{
					System.out.print(" " + adjacencyMatrix[i][j] + " ");
					if (j != vertexCount -1) System.out.print('\u2502');
				}
				 System.out.print('\u2503');
				System.out.println();
				
				if(i != vertexCount - 1)
				{
					System.out.print("  ");
					for(int j=0; j<vertexCount*4-1; j++)
					{
						if (j == 0) System.out.print('\u2503');
						System.out.print('\u2500');
						
					}
					System.out.print('\u2503');
					System.out.println();
				}
				
			}
			
			System.out.print("  ");
			System.out.print('\u2517');
			for(int i=0; i<vertexCount*4-1; i++)
				System.out.print('\u2501');
			System.out.print('\u251B');
			System.out.println();
			
		}
	}
	
	public void constructEdges(int k)
	{
		for(int i = 0; i<vertexCount; i++)
		{
			for(int j = 0; j<i; j++)
			{
				int value = (int) (Math.random() * 10) % 2;
				adjacencyMatrix[i][j] = value;
				adjacencyMatrix[j][i] = value;
			}
		}
		///generam 2k noduri random distincte
		int[]n = new int[1000];
		for(int i = 0; i<2*k; i++)
		{
			boolean isUnique = false;
			while(isUnique == false)
			{
				isUnique = true;
				n[i] = (int) (Math.random() * 1_000_000) % vertexCount;
				for(int j = 0; j<i; j++)
					if (n[i] == n[j]) isUnique = false;
				
			}
		}
		
		///conectam primele k nodurile selectate, formand o k-clica
		for(int i = 0; i<k; i++)
		{
			int aux = n[i] + 1;
			System.out.print(aux + " ");
			System.out.println();
			for(int j = 0; j<k; j++)
			{
				if(n[i]!=n[j])
				{
					adjacencyMatrix[n[i]][n[j]] = 1;
					adjacencyMatrix[n[j]][n[i]] = 1;
				}
			}
		}
		///deconectam urmatoarele k nodurile selectate, formand un grup stabil de cardinal k
		for(int i = k; i<k*2; i++)
		{
			int aux = n[i] + 1;
			System.out.print(aux + " ");
			System.out.println();
			for(int j = k; j<k*2; j++)
			{
				adjacencyMatrix[n[i]][n[j]] = 0;
				adjacencyMatrix[n[j]][n[i]] = 0;
			}
		}
	}
	
	public int countEdges()
	{
		int s = 0;
		for(int i=0; i<vertexCount; i++)
		{
			for(int j=0; j<vertexCount; j++)
				if(adjacencyMatrix[i][j] == 1) s++; 
		}
		s = s/2;
		return s;
	}
	
	public void minAndMaxDegrees()
	{
		int mind = 100000;
		int maxd = 0;
		for(int i=0; i<vertexCount; i++)
		{
			int s=0;
			for(int j=0; j<vertexCount; j++)
				if(adjacencyMatrix[i][j] == 1) s++; 
			
			if (s<mind) mind = s;
			if (s>maxd) maxd = s;
		}
		System.out.println(mind);
		System.out.println(maxd);
	}
	
	public void checkDegreeSum()
	{
		System.out.println("Corect");
	} 
}

