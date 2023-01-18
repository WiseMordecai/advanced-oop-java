package com.advancedoop.theory.chapter1.lecture3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * 
 * Same as Ex1 but nested container 
 * JPanel
 * Program 7
 * 
 */

// .... how many methods does actionlistner has?
// public void actionPerfom(Action event);

public class Ex3 extends JFrame implements ActionListener {
  Container container;
  JLabel label;
  JTextField textField;
  JTextArea textArea; // new object
  JButton button;
  JPanel panel;
  JScrollPane scrollPane;

  Ex3() {
    container = getContentPane();
    container.setBackground(Color.LIGHT_GRAY);
    setTitle("Login Form");
    setVisible(true);
    setSize(800, 800);
    // setLocation(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    label = new JLabel("Enter your name");
    textField = new JTextField(15);
    button = new JButton("Submit");
    textArea = new JTextArea(); // new object
    textArea.setEditable(false);
    panel = new JPanel();
    scrollPane = new JScrollPane(textArea);
    container.add(panel, "North");
    textField.setBackground(Color.WHITE);
    textField.setForeground(Color.BLUE);
    button.setBackground(Color.ORANGE);
    button.setForeground(Color.RED);

    button.addActionListener(this);
    textField.addActionListener(this);

    // container.add(label);
    // container.add(textField);
    // container.add(button);
    // container.add(textArea);
    //
    panel.add(label);
    panel.add(textField);
    panel.add(button);
    /*
     * container.add(textArea); YOU CANNOT ADD THE TEXT AREA BECAUSE IT IS INSIDE
     * THE JSCROLLPANE
     */
    container.add(scrollPane);
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
    new Ex3();
  }
}
