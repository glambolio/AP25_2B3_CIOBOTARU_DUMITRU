package pachet;

public class Player {
	

	private float scor;
	private int playerId;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public float getScor() {
		return scor;
	}

	public void setScor(float scor) {
		this.scor = scor;
	}
	
	public Player(int playerId) {
		super();
		this.scor = 0;
		this.playerId = playerId;
	}
	
}
