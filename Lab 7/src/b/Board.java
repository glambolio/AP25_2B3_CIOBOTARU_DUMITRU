package b;

public class Board {
private int wordcount;
private final String words[] = new String[50];
public void addWord(Player player, String word) 
{
	words[wordcount] = word; 
	System.out.println(player.getName() + ": " + word);
}
@Override
public String toString() 
{
	return words.toString();
}
}