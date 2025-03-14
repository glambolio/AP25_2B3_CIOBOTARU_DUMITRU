package a;

public class Freighter

extends Aircraft

implements PassengerCapable, CargoCapable{

	public Freighter(double maximumPayload) {
		super();
		this.maximumPayload = maximumPayload;
	}

	public void setMaximumPayload(double maximumPayload) {
		this.maximumPayload = maximumPayload;
	}

	private double maximumPayload;
	
	@Override
	public double getMaximumPayload() {
		// TODO Auto-generated method stub
		return maximumPayload;
	}

	@Override
	public int getSeatCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
