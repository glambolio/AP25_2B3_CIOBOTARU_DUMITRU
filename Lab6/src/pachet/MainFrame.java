package pachet;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
ConfigPanel configPanel;
ControlPanel controlPanel;
DrawingPanel canvas;

public Player p1;
public Player p2;
public Board board;
private int control = 0;//va deveni egal cu unul din cele 2 playerId-uri, indicand cine e la mutare


public MainFrame() {
super("My Drawing Application");
init();
}


private void init() {
setDefaultCloseOperation(EXIT_ON_CLOSE);
//create the components
canvas = new DrawingPanel(this);
controlPanel = new ControlPanel(this);
configPanel = new ConfigPanel(this);

//arrange the components in the container (frame)
//JFrame uses a BorderLayout by default
add(canvas, BorderLayout.CENTER);
add(controlPanel, BorderLayout.PAGE_END);
add(configPanel, BorderLayout.PAGE_START); 


//invoke the layout manager
pack();
}
}