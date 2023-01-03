package com.advancedoop.theory.chapter1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArrayButton extends JFrame implements ActionListener {

  Container container;
  JButton[] button = new JButton[10];
  JLabel label;
  JPanel northPanel, southPanel;

  public ArrayButton() {

    container = getContentPane();
    northPanel = new JPanel();
    southPanel = new JPanel();
    label = new JLabel("Enter any button to display its message..");
    northPanel.setBorder(BorderFactory.createTitledBorder("TOP"));
    setTitle("Press To Display A Message");
    setSize(900, 500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    container.add(northPanel, "North");
    // container.add(label, "Center"); // THIS DOES NOT CENTER THE LABEL(NOT
    // WORKING)
    container.add(label);
    label.setHorizontalAlignment(JLabel.CENTER); // THIS IS REPLACE AND A BETTER WAY

    // OR

    // label = new JLabel("Enter any button to display its message..",
    // JLabel.CENTER);
    container.add(southPanel, "South");
    // Doctor's way of initialize Array
    for (int i = 0; i < button.length; i++) {
      button[i] = new JButton("" + (i + 1));
      button[i].addActionListener(this);

      // This is added by me
      if (i < 5) {
        northPanel.add(button[i]);
      } else {
        southPanel.add(button[i]);
      }
    }

  }

  public static void main(String[] args) {
    new ArrayButton();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String str = e.getActionCommand();
    if (str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5")) {
      label.setText("You have clicked " + str + " from Top");
      container.add(label, "Center");
    } else {
      label.setText("You have clicked " + str + " from Bottom");
      container.add(label, "Center");
    }

    // char ch = str.charAt(0);
    // switch (ch) {
    // case '1':
    // label.setText("You have clicked (ONE) from Top");
    // container.add(label, "Center");
    // break;
    // case '2':
    // label.setText("You have clicked (TWO) from Top");
    // container.add(label, "Center");
    // break;

    // default:
    // break;
    // }
  }

}
