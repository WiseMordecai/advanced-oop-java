package com.advancedoop.theory.chapter1.lecture3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * 
 * Program for displaying messages through JTextArea
 *  
 */

// .... how many methods does actionlistner has?
// public void actionPerfom(Action event);

public class Ex1 extends JFrame implements ActionListener {
  Container cp;
  JLabel label;
  JTextField textField;
  JTextArea textArea; // new object
  JButton button;

  Ex1() {
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
    textArea = new JTextArea(40, 40); // new object
    textArea.setEditable(false);

    textField.setBackground(Color.WHITE);
    textField.setForeground(Color.BLUE);
    button.setBackground(Color.ORANGE);
    button.setForeground(Color.RED);

    button.addActionListener(this);
    textField.addActionListener(this);

    cp.add(label);
    cp.add(textField);
    cp.add(button);
    cp.add(textArea);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(button)) {
      String str = textField.getText();
      // JOptionPane.showMessageDialog(this, "Hello, " + str);
      textField.setText("");
      // textArea.setText(str + "\n");
      textArea.append(str + "\n");
    } else if (e.getSource().equals(textField)) {
      String str = textField.getText();
      // JOptionPane.showMessageDialog(this, "Hi, " + str);
      textField.setText("");
      // textArea.setText(str + "\n");
      textArea.append(str + "\n");
    }
  }

  public static void main(String[] args) {
    new Ex1();
  }
}
