package com.advancedoop.theory.chapter1.lecture5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex15 extends JFrame implements ActionListener, ItemListener {

  Container container;
  JComboBox comboBox;
  JPanel panel;
  JButton button;

  public Ex15() {
    container = getContentPane();

    setTitle("ComboBox Example");

    String[] programmingLangs = { "Java", "Python", "C++", "C#", "C" };
    comboBox = new JComboBox<>(programmingLangs);
    comboBox.addItemListener(this);
    panel = new JPanel();
    button = new JButton("Submit");
    panel.setBorder(BorderFactory.createTitledBorder("Select you programming language"));
    setTitle("Combo Box");
    setVisible(true);
    setSize(500, 500);
    container.add(panel);
    container.add(button, "South");
    button.addActionListener(this);
    panel.add(comboBox);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Ex15();
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    /*
     * {{With out a Button}}
     * int i = comboBox.getSelectedIndex();
     * String str = (String) comboBox.getSelectedItem();
     * JOptionPane.showMessageDialog(this, "Your programming languages is " + str +
     * " at " + i);
     */
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // With a Button
    if (e.getSource().equals(button)) {
      int i = comboBox.getSelectedIndex();
      String str = (String) comboBox.getSelectedItem();
      JOptionPane.showMessageDialog(this, "Your programming languages is " + str + " at " + i);
    }
  }
}
