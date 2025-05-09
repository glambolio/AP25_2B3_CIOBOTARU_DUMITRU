package b;

import java.util.ArrayList;
import java.util.List;

public class Bag {
private final Tile contents[] = new Tile[260];
private int count = 0;
public Bag() 
	{
		for (char c = 'a'; c < 'z'; c++) {
			Tile temp = new Tile(c, (int)(Math.random() * 10) % 10);
			this.contents[count] = temp;
			count++;
		}
	}

public synchronized List<Tile> extractTiles(int howMany)
	{
		List<Tile> extracted = new ArrayList<>();
		for (int i = 0; i < howMany; i++) {
			if (count == 0) {
				break;
			}
			extracted.add(contents[count - 1]);
			}
		return extracted;
	}
}
