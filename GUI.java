import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

public class GUI implements ActionListener {
  private JFrame frame;
  private NorthPanel northPanel;
  private CenterPanel centerPanel;
  private SouthPanel southPanel;
  
  public GUI() {
    frame = new JFrame();
    northPanel = new NorthPanel();
    centerPanel = new CenterPanel();
    southPanel = new SouthPanel();
  }

  public void start(int width, int height) {
    frame.setTitle("Note Pad");
    frame.setSize(width, height);
    frame.setLayout(new BorderLayout());
    frame.setResizable(false);

    frame.add(northPanel, BorderLayout.NORTH);
    frame.add(centerPanel, BorderLayout.CENTER);
    frame.add(southPanel, BorderLayout.SOUTH);

    northPanel.newButton.addActionListener(this);
    northPanel.saveButton.addActionListener(this);
    northPanel.openButton.addActionListener(this);
    northPanel.quitButton.addActionListener(this);

    southPanel.foregroundButton.addActionListener(this);
    southPanel.backgroundButton.addActionListener(this);
    southPanel.fontSizeTextField.addActionListener(this);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {

    // New Button
    if(event.getSource().equals(northPanel.newButton)) {
        centerPanel.ta.setText("");
    }

    // Save Button
    if(event.getSource().equals(northPanel.saveButton)) {
        String content = centerPanel.ta.getText();
        try {
            Save save = new Save("Note.txt");
            save.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Open Button
    if(event.getSource().equals(northPanel.openButton)) {
        Open open = new Open("Note.txt");
        try {
            centerPanel.ta.setText(open.getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Quit Button
    if(event.getSource().equals(northPanel.quitButton)) {
        System.exit(0);
    }
    
    // Foreground Button
    if(event.getSource().equals(southPanel.foregroundButton)) {
        JColorChooser colorChooser = new JColorChooser();
        Color c = JColorChooser.showDialog(colorChooser, "Choose", Color.CYAN);
        centerPanel.ta.setForeground(c);
    }

    // Backgroun Button
    if(event.getSource().equals(southPanel.backgroundButton)) {
        JColorChooser colorChooser = new JColorChooser();
        Color c = JColorChooser.showDialog(colorChooser, "Choose", Color.CYAN);
        centerPanel.ta.setBackground(c);
    }

    // Font Size
    if(Integer.parseInt(southPanel.fontSizeTextField.getText()) > 0) {
        centerPanel.ta.setFont(new Font("arial", 0, Integer.parseInt(southPanel.fontSizeTextField.getText())));
    }

  }
}