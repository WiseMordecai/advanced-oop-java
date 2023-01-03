package com.advancedoop.theory.chapter1.lecture3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise extends JFrame implements ActionListener {

  Container container;
  JLabel label;
  JButton button1, button2, button3;
  JPanel panel;

  Exercise() {
    container = getContentPane();
    panel = new JPanel();
    button1 = new JButton("Image1");
    button2 = new JButton("Image2");
    button3 = new JButton("Image3");
    label = new JLabel(new ImageIcon(
        "Blank (no image)"));
    container.add(panel, "North");
    // container.add(label, "Center");
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);

    container.setBackground(Color.LIGHT_GRAY);
    setTitle("Image");
    setVisible(true);
    setSize(800, 800);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub

    if (e.getSource().equals(button1)) {
      // label = new JLabel();
      label.setIcon(new ImageIcon(
          "C:/Users/***/Documents/VsCodeProjects/java-workspace/university/src/com/advancedoop/theory/chapterone/lecture3/imgs/image1.png"));
      container.add(label, "Center");
    } else if (e.getSource().equals(button2)) {
      label.setIcon(new ImageIcon(
          "C:/Users/***/Documents/VsCodeProjects/java-workspace/university/src/com/advancedoop/theory/chapterone/lecture3/imgs/image2.png"));
      container.add(label, "Center");
    } else if (e.getSource().equals(button3)) {
      label.setIcon(new ImageIcon(
          "C:/Users/***/Documents/VsCodeProjects/java-workspace/university/src/com/advancedoop/theory/chapterone/lecture3/imgs/image3.png"));
      container.add(label, "Center");
    }
  }

  public static void main(String[] args) {
    new Exercise();
  }
}
