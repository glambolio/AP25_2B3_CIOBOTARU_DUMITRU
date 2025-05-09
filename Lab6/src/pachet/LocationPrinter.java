package pachet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LocationPrinter implements MouseListener {

	@Override
	  public void mouseClicked(MouseEvent me) {
	    int screenX = me.getXOnScreen();
	    int screenY = me.getYOnScreen();
	    System.out.println("screen(X,Y) = " + screenX + "," + screenY);
	  }

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
