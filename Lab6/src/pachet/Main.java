package pachet;

import java.awt.Color;
import java.awt.Graphics2D;

//Functioneaza urmatoarele: 
//butonul de exit
//generarea de puncte random in board.dots
//butonul de new game, care preia valoarea din spinner si deseneaza tot atatea puncte
//desenarea muchiilor intre puncte, depinzand de valoarea din matricea de adiacenta
//am pus provizoriu ca la fiecare new game sa se lege(cand e posibil):
//nodul 1 de nodul 4 cu id 1 (albastru)
//nodul 2 de nodul 3 cu id 2 (rosu)

public class Main {
public static void main(String[] args) {
		
		//Board b = new Board(5, 400, 400);
		//b.printDots();
		
		MainFrame main = new MainFrame();
		main.setVisible(true);
		//main.board.printDots();
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Board b = new Board(0, 400, 400);
		
		main.p1 = p1;
		main.p2 = p2;
		main.board = b;
		//if(main.board.getDotCount() >= 4) main.board.connect(1, 4, 1);
		//if(main.board.getDotCount() >= 4) main.board.connect(2, 3, 2);
		
		boolean gameCondition = true;
		int roundNum = 0;
		int currentPlayer;
		int mx;
		int my;
		
		
		
		while(gameCondition)
		{
			roundNum++;
			if(roundNum % 2 == 0) currentPlayer = 1;
			else currentPlayer = 2;
			
			mx = main.canvas.mouseHandler.x;
			my = main.canvas.mouseHandler.y;
			Dot d = new Dot(mx, my);
			
			boolean isInDot = false;
			//System.out.println("a" + main.canvas.mouseHandler.x);
			int i = 1;
			while(i <= main.board.getDotCount() && d.getDistanceTo(main.board.getDots()[i]) > main.canvas.getDotSize())
			{
				//if(d.getDistanceTo(main.board.getDots()[i]) <= main.canvas.getDotSize() + 5)
				//isInDot = true;
				i++;
			}
			if(i != main.board.getDotCount() + 1)
				{
				String s = "Mouse clicked: X = "+ mx
						 + " Y = " + my;
						 System.out.println(s);
						 System.out.println(i);
					main.board.connect(i, 1, currentPlayer);
				}
			
			main.canvas.paintLines(main.canvas.getGraphics());
			//gameCondition = false;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}
