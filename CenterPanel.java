import java.awt.*;
import javax.swing.*;

public class CenterPanel extends JPanel {
  public JTextArea ta;
  public JScrollPane scroll;

  public CenterPanel() {
    this.setLayout(new BorderLayout());

    ta = new JTextArea();
    ta.setPreferredSize(new Dimension(400, 400));
    ta.setLineWrap(true);
    ta.setWrapStyleWord(true);
    this.add(ta, BorderLayout.CENTER);

    scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    this.add(scroll);
  }

}