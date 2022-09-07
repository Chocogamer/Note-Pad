import java.awt.*;
import javax.swing.*;

public class SouthPanel extends JPanel {
  public JPanel firstPanel;
  public JButton foregroundButton;
  public JButton backgroundButton;
  public JPanel secondPanel;
  public JLabel fontSizeLabel;
  public JTextField fontSizeTextField;

  public SouthPanel() {
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    // FIRST PANEL
    firstPanel = new JPanel();
    firstPanel.setLayout(new FlowLayout());
    
    foregroundButton = new JButton("Foregound");
    foregroundButton.setPreferredSize(new Dimension(100, 25));
    firstPanel.add(foregroundButton);
    
    backgroundButton = new JButton("Background");
    backgroundButton.setPreferredSize(new Dimension(100, 25));
    firstPanel.add(backgroundButton);

    // SECOND PANEL
    secondPanel = new JPanel();
    secondPanel.setLayout(new FlowLayout());

    fontSizeLabel = new JLabel("Font Size: ");
    fontSizeLabel.setPreferredSize(new Dimension(100, 25));
    secondPanel.add(fontSizeLabel);

    fontSizeTextField = new JTextField("0");
    fontSizeTextField.setPreferredSize(new Dimension(100, 25));
    secondPanel.add(fontSizeTextField);

    this.add(firstPanel);
    this.add(secondPanel);
  }
}