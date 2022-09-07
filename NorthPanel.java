import java.awt.*;
import javax.swing.*;

public class NorthPanel extends JPanel {
  public JButton newButton;
  public JButton saveButton;
  public JButton openButton;
  public JButton quitButton;

  public NorthPanel() {
    this.setLayout(new FlowLayout());
    
    newButton = new JButton("New");
    newButton.setPreferredSize(new Dimension(100, 25));
    this.add(newButton);

    saveButton = new JButton("Save");
    saveButton.setPreferredSize(new Dimension(100, 25));
    this.add(saveButton);

    openButton = new JButton("Open");
    openButton.setPreferredSize(new Dimension(100, 25));
    this.add(openButton);

    quitButton = new JButton("Quit");
    quitButton.setPreferredSize(new Dimension(100, 25));
    this.add(quitButton);
  }
}