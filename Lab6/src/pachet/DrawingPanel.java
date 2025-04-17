package pachet;
import java.awt.*;

import javax.swing.*;


public class DrawingPanel extends JPanel 
{
	
private final MainFrame frame;
private int canvasWidth = 400, canvasHeight = 400;
private int dotSize = 10;
// The values above may be constant or configurable
//...
// Data structures storing the dots and the lines.
public DrawingPanel(MainFrame frame) {
	this.frame = frame;
	setPreferredSize(new Dimension(canvasWidth, canvasHeight));
//...
}


@Override
protected void paintComponent(Graphics graphics) {
	if (frame.board != null)
	{
		Graphics2D g = (Graphics2D) graphics;
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, canvasWidth, canvasHeight);
		g.setColor(Color.black);
		paintDots(g);
		paintLines(g);
	}
}

public void paintDots(Graphics g)
{
	for(int i = 1; i <= frame.board.getDotCount() ; i++)
	{
		//Imi cer sincere scuze pentru sintaxa asta 
		g.drawOval(Math.round(frame.board.getDots()[i].getX()), Math.round(frame.board.getDots()[i].getY()), dotSize, dotSize);
	}
}

public void paintLines(Graphics g)
{
	for(int i = 1; i <= frame.board.getDotCount() ; i++)
	{
		for(int j = 1; j <= frame.board.getDotCount() ; j++)
		{
			if(frame.board.getAdjacency()[i][j] == frame.p1.getPlayerId())
			{
				g.setColor(Color.blue);
				g.drawLine(Math.round(frame.board.getDots()[i].getX()), Math.round(frame.board.getDots()[i].getY()), Math.round(frame.board.getDots()[j].getX()), Math.round(frame.board.getDots()[j].getY()));
			}
			if(frame.board.getAdjacency()[i][j] == frame.p2.getPlayerId())
			{
				g.setColor(Color.red);
				g.drawLine(Math.round(frame.board.getDots()[i].getX()), Math.round(frame.board.getDots()[i].getY()), Math.round(frame.board.getDots()[j].getX()), Math.round(frame.board.getDots()[j].getY()));
			}
		}
	}
}


}