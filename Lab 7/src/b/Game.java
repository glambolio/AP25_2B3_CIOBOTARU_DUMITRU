package b;

import java.util.ArrayList;
import java.util.List;

public class Game {
public Board getBoard() {
		return board;
	}
public Bag getBag() {
		return bag;
	}
private final Bag bag = new Bag();
private final Board board = new Board();
//private final Dictionary dictionary = new MockDictionary();
private final List<Player> players = new ArrayList<>();
public void addPlayer(Player player) {
players.add(player);
player.setGame(this);
}
public void play() {
for (Player player : players) {
	Runnable runnable = new Player(player.getName(), player.getGame(), player.isRunning());
	new Thread(runnable).start();
}
}
public static void main(String args[]) {
Game game = new Game();
game.addPlayer(new Player("Player 1"));
game.addPlayer(new Player("Player 2"));
game.addPlayer(new Player("Player 3"));
game.play();
}
}