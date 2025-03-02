package a;

public class Graph {
	public int[][] adiacenceMatrix = new int[100][100];
	
		public void initialize(int n)
		{
			if (n<100)
			{
				for(int i=0; i<n; i++)
				{
					for(int j=0; j<n; j++)
					{
						adiacenceMatrix[i][j] = 0;
					}
				}
			}
		}

}
