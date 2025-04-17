package pachet;
import java.util.Random;
public class Board {
	
	private float width;
	private float height;
	private int dotCount;
	private Dot dots[];
	
	//campurile din adjacency contin primul/al doilea playerId pt o conexiune albastra/rosie sau 0 pt nici o conexiune
	private int adjacency[][];
	
	//corespunde conectarii printr-o linie
	public void connect(int i, int j, int playerId)
	{
		adjacency[i][j] = playerId;
	}
	
	//constructor
	public Board(int dotCount, float width, float height) {
		
		super();
		this.dotCount = dotCount;
		this.width = width;
		this.height = height;
		dots = new Dot[dotCount + 1];
		adjacency = new int [dotCount + 1][dotCount + 1];
		
		
		Random rd = new Random();
		for(int i = 1; i <= dotCount ; i++)
		{
			float auxX = rd.nextFloat() * width;
			float auxY = rd.nextFloat() * height;
			Dot d = new Dot(auxX, auxY);
			dots[i] = d;
		}
		
		
		for(int i = 1; i <= dotCount ; i++)
		{
			for(int j = 1; j <= dotCount ; j++)
			{
				adjacency[i][j] = 0;
			}
		}
		
	}
	
	
	public int[][] getAdjacency() {
		return adjacency;
	}

	public void setAdjacency(int[][] adjacency) {
		this.adjacency = adjacency;
	}

	//afisare coordonate
	public void printDots()
	{
		for(int i = 1; i <= dotCount; i++)
		{
			System.out.print(String.format("For dot %d, x = %.3f, y = %.3f \n", i, dots[i].getX(), dots[i].getY()));
		}
	}


	public Dot[] getDots() {
		return dots;
	}


	public void setDots(Dot[] dots) {
		this.dots = dots;
	}

	public int getDotCount() {
		return dotCount;
	}

	public void setDotCount(int dotCount) {
		this.dotCount = dotCount;
	}
}
