package com.advancedoop.theory.chapter1.lecture5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
// import java.awt.event.*;

public class Ex17 extends JFrame implements ChangeListener {
  Container container;
  JSlider redSlider, blueSlider, greenSlider;
  JPanel panel;

  Ex17() {
    container = getContentPane();
    redSlider = new JSlider();
    blueSlider = new JSlider();
    greenSlider = new JSlider();
    panel = new JPanel();
    redSlider.addChangeListener(this);
    blueSlider.addChangeListener(this);
    greenSlider.addChangeListener(this);
    panel.setLayout(new GridLayout(3, 1));
    redSlider.setOrientation(JSlider.HORIZONTAL);
    redSlider.setPaintLabels(true);
    redSlider.setPaintTicks(true);
    redSlider.setMinimum(0);
    redSlider.setMaximum(255);
    redSlider.setMajorTickSpacing(50);
    redSlider.setMinorTickSpacing(25);
    redSlider.setValue(200); // To set the initial position
    container.add(panel, "North");

    blueSlider.setOrientation(JSlider.HORIZONTAL);
    blueSlider.setPaintLabels(true);
    blueSlider.setPaintTicks(true);
    blueSlider.setMinimum(0);
    blueSlider.setMaximum(255);
    blueSlider.setMajorTickSpacing(50);
    blueSlider.setMinorTickSpacing(25);
    blueSlider.setValue(200); // To set the initial position

    greenSlider.setOrientation(JSlider.HORIZONTAL);
    greenSlider.setPaintLabels(true);
    greenSlider.setPaintTicks(true);
    greenSlider.setMinimum(0);
    greenSlider.setMaximum(255);
    greenSlider.setMajorTickSpacing(50);
    greenSlider.setMinorTickSpacing(25);
    greenSlider.setValue(200); // To set the initial position
    setTitle("JSlider");
    setVisible(true);
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    panel.setBorder(BorderFactory.createTitledBorder("Create your color: "));
    panel.add(redSlider);
    panel.add(blueSlider);
    panel.add(greenSlider);
  }

  public static void main(String[] args) {
    new Ex17();
  }

  @Override
  public void stateChanged(ChangeEvent e) {
    int redColor = redSlider.getValue();
    int blueColor = blueSlider.getValue();
    int greenColor = greenSlider.getValue();

    Color color = new Color(redColor, blueColor, greenColor);
    container.setBackground(color);
  }
}
