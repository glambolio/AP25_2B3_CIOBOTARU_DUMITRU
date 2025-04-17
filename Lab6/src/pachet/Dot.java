package pachet;

public class Dot {

	//x si y, coordonatele punctului
	private float x;
	private float y;
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	//Metoda pt obtinerea distantei intre puncte
	public float getDistanceTo(Dot d)
	{
		float f = (float) Math.sqrt((d.getX() - x) * (d.getX() - x) + (d.getY() - y) * (d.getY() - y));
		return f;
	}
	
	//constructor
	public Dot(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}
