package com.advancedoop.theory.chapter1.lecture4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex11 extends JFrame implements ActionListener {
  Container container;
  JCheckBox checkBox;
  JLabel label;

  public Ex11() {
    container = getContentPane();
    container.setLayout(new FlowLayout());
    // button = new JButton("Click me");
    checkBox = new JCheckBox("Click me!");
    label = new JLabel("Result of check box");
    container.add(checkBox);
    checkBox.addActionListener(this);

    setTitle("Check Box");
    setSize(1000, 800);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    container.add(label);
  }

  public static void main(String[] args) {
    new Ex11();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(checkBox)) {
      if (checkBox.isSelected()) {
        label.setText("Check box is clicked");
      } else {

        label.setText("Check box is unclicked");
      }
    }
  }
}
