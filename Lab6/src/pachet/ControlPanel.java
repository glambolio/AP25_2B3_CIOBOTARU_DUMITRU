package pachet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ControlPanel extends JPanel {
final MainFrame frame;
JButton exitBtn = new JButton("Exit");
JButton loadBtn = new JButton("Load");
JButton saveBtn = new JButton("Save");
public ControlPanel(MainFrame frame) {
this.frame = frame; init();
}
private void init() {
//change the default layout manager (just for fun)
setLayout(new GridLayout(1, 4));
add(exitBtn);
add(loadBtn);
add(saveBtn);
//configure listeners for all buttons
exitBtn.addActionListener(this::exitGame);
//...TODO
}
private void exitGame(ActionEvent e) {
frame.dispose();
}
//...TODO
//
}