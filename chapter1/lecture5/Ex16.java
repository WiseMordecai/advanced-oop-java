package com.advancedoop.theory.chapter1.lecture5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Select more than item in the comboBox using JList
 */

public class Ex16 extends JFrame implements ActionListener {

  Container container;
  JList list;
  JPanel panel;
  JButton button;

  public Ex16() {
    container = getContentPane();
    setTitle("JList");
    setVisible(true);
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    panel = new JPanel();
    button = new JButton("Submit");
    button.addActionListener(this);
    panel.setBorder(BorderFactory.createTitledBorder(("Select you programming language")));
    container.add(panel);
    String[] programmingLangs = { "Java", "Python", "C++", "C#", "C" };
    list = new JList<>(programmingLangs);
    panel.add(list);
    container.add(button, "South");
  }

  public static void main(String[] args) {
    new Ex16();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    Object object[];
    int i[];
    String str = "";
    object = list.getSelectedValues();
    i = list.getSelectedIndices();
    for (int j = 0; j < i.length; j++) {
      str += (i[j] + 1);
      str += ".";
      str += object[j].toString();
      str += "\n";
    }
    JOptionPane.showMessageDialog(this, "Your programming languages are \n" + str);
  }
}
