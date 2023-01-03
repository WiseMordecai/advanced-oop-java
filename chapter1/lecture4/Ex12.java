package com.advancedoop.theory.chapter1.lecture4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex12 extends JFrame implements ActionListener, ItemListener {
  Container container;
  ButtonGroup buttonGroup;
  JCheckBox checkBox, checkBox2, checkBox3;
  JLabel label;

  public Ex12() {
    container = getContentPane();
    container.setLayout(new FlowLayout());
    label = new JLabel("Select");
    checkBox = new JCheckBox("Java");
    checkBox2 = new JCheckBox("Py");
    checkBox3 = new JCheckBox("C++");

    container.add(label);
    container.add(checkBox);
    container.add(checkBox2);
    container.add(checkBox3);

    checkBox.addItemListener(this);
    checkBox2.addItemListener(this);
    checkBox3.addItemListener(this);

    buttonGroup = new ButtonGroup();
    buttonGroup.add(checkBox);
    buttonGroup.add(checkBox2);
    buttonGroup.add(checkBox3);

    setTitle("Check Box");
    setSize(1000, 800);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Ex12();
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    String str = "";
    if (checkBox.isSelected()) {
      str += checkBox.getText();
      str += " ";
    }

    if (checkBox2.isSelected()) {
      str += checkBox2.getText();
      str += " ";
    }

    if (checkBox3.isSelected()) {
      str += checkBox3.getText();
      str += " ";
    }
    label.setText("You Know: \n" + str);

    // else {
    // label.setText("Check box is unclicked");
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // if (e.getSource().equals(checkBox)) {
    // if (checkBox.isSelected()) {
    // label.setText("Check box is clicked");
    // } else {

    // label.setText("Check box is unclicked");
    // }
    // }
  }
}
