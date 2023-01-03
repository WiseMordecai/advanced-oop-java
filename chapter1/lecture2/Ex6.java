package com.advancedoop.theory.chapter1.lecture2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/*
 * 
 * Program for displaying messages through JFrame (Not JOptionPane)
 * 
 */

/*
 * 
 * Homework
 * 3 buttons (red, blue, green)
 * if one if those buttons get pressed
 * the background should change the the color that is pressed
 */

// .... how many methods does actionlistner has?
// public void actionPerfom(Action event);

public class Ex6 extends JFrame implements ActionListener {
  Container cp;
  JLabel label;
  JTextField textField;
  JButton button;

  Ex6() {
    cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.setBackground(Color.LIGHT_GRAY);
    setTitle("Login Form");
    setVisible(true);
    setSize(800, 800);
    // setLocation(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    label = new JLabel("Enter your name");
    textField = new JTextField(15);
    button = new JButton("Submit");

    button.addActionListener(this);
    textField.addActionListener(this);

    textField.setBackground(Color.WHITE);
    textField.setForeground(Color.BLUE);
    button.setBackground(Color.ORANGE);
    button.setForeground(Color.RED);

    cp.add(label);
    cp.add(textField);
    cp.add(button);

  }

  public static void main(String[] args) {
    new Ex6();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource().equals(button)) {
      String str = textField.getText();
      JOptionPane.showMessageDialog(this, "Hello, " + str);
      textField.setText("");
    } else if (e.getSource().equals(textField)) {
      String str = textField.getText();
      JOptionPane.showMessageDialog(this, "Hi, " + str);
      textField.setText("");
    }

  }
}
