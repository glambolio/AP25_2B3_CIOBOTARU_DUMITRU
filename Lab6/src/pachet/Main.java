package pachet;

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
		
		
	}
	
	
}
