package a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.vertexCount = 9;
		g.initialize();
		g.constructEdges(3);
		g.display();
		System.out.println(g.countEdges());
		g.minAndMaxDegrees();
	}

}
