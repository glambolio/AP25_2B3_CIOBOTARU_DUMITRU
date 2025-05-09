package b;

import java.util.ArrayList;
import java.util.List;

public class Player implements Runnable {
public boolean isRunning() {
		return running;
	}
	public void setRunning(boolean running) {
		this.running = running;
	}
public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
private String name;
private Game game;
private boolean running;
public Player(String name) { this.name = name; }
private boolean submitWord() {
	List<Tile> extracted = game.getBag().extractTiles(7);
	if (extracted.isEmpty()) {
		return false;
	}
		String word = "";
		int value = 0;
			for (int i = 0; i < extracted.size(); i++) {
			    Tile t = extracted.get(i);
			    word = "" + t.getLetter();
			    value = value + t.getPoints();
			}
			
	game.getBoard().addWord(this, word);
	//make the player sleep 500ms;
	return true;
}

public void run()
{
	submitWord();
}
public Player(String name, Game game, boolean running) {
	super();
	this.name = name;
	this.game = game;
	this.running = running;
}



}