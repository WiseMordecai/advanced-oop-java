package com.advancedoop.theory.chapter1.lecture4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex12 extends JFrame implements ActionListener, ItemListener {
  Container container;
  ButtonGroup buttonGroup;
  // JCheckBox checkBox, checkBox2, checkBox3;
  JRadioButton radioButton, radioButton2, radioButton3;
  // Here to make it only allow you to choose one box "ButtonGroup is needed"
  // it also works with JCheckBox if we do it the same as JRadioButton :D
  JLabel label;

  public Ex12() {
    container = getContentPane();
    container.setLayout(new FlowLayout());
    label = new JLabel("Select");
    radioButton = new JRadioButton("Java");
    radioButton2 = new JRadioButton("Py");
    radioButton3 = new JRadioButton("C++");

    container.add(label);
    container.add(radioButton);
    container.add(radioButton2);
    container.add(radioButton3);

    radioButton.addItemListener(this);
    radioButton2.addItemListener(this);
    radioButton3.addItemListener(this);

    buttonGroup = new ButtonGroup();
    buttonGroup.add(radioButton);
    buttonGroup.add(radioButton2);
    buttonGroup.add(radioButton3);

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
    if (radioButton.isSelected()) {
      str += radioButton.getText();
      str += " ";
    }

    if (radioButton2.isSelected()) {
      str += radioButton2.getText();
      str += " ";
    }

    if (radioButton3.isSelected()) {
      str += radioButton3.getText();
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
