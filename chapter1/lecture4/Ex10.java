package com.advancedoop.theory.chapter1.lecture4;

import javax.swing.*;
import java.awt.*;

public class Ex10 extends JFrame {
  Container container;
  JButton button;

  public Ex10() {
    container = getContentPane();
    container.setLayout(null);
    button = new JButton("Click me");
    setTitle("Absolute Layout");
    setSize(1000, 800);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    button.setBounds(50, 50, 100, 100);
    container.add(button);
  }

  public static void main(String[] args) {
    new Ex10();
  }
}
