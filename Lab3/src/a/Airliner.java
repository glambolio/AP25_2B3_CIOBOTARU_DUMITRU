package a;

public class Airliner

extends Aircraft

implements PassengerCapable, CargoCapable
{
	
	public Airliner(int seatCount, double maximumPayload) {
		super();
		this.seatCount = seatCount;
		this.maximumPayload = maximumPayload;
	}

	private int seatCount;
	private double maximumPayload;

	@Override
	public double getMaximumPayload() {
		// TODO Auto-generated method stub
		return maximumPayload;
	}

	@Override
	public int getSeatCount() {
		// TODO Auto-generated method stub
		return seatCount;
	}

}
