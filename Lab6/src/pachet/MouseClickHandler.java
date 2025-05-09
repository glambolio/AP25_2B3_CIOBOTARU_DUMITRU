package pachet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

	class MouseClickHandler extends MouseAdapter {
		 
		public int x;
		public int y;
		 public void mouseClicked(MouseEvent e) 
		 {
			 x = e.getX();
			 y = e.getY();
			 String s = "Mouse clicked: X = "+ x
			 + " Y = " + y;
			 System.out.println(s);
		 }
		}



