package pachet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ConfigPanel extends JPanel {
final MainFrame frame;
JLabel label;
JSpinner spinner;
public int count;
public ConfigPanel(MainFrame frame) {
this.frame = frame;
init();
}
private void init() {
//create the label and the spinner
label = new JLabel("Number of dots:");
spinner = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
//create the other components, such as the "New Game" button
JButton newGameBtn = new JButton("NewGame");

add(label); //JPanel uses FlowLayout by default
add(spinner);
add(newGameBtn);

newGameBtn.addActionListener(this::newGame);

}

private void newGame(ActionEvent e) 
{
	frame.board = new Board((Integer)spinner.getValue(), 400, 400);
	if(frame.board.getDotCount() >= 4) frame.board.connect(1, 4, 1);
	if(frame.board.getDotCount() >= 4) frame.board.connect(2, 3, 2);
	frame.canvas.paintComponent(frame.canvas.getGraphics());
	frame.board.printDots();
}
}