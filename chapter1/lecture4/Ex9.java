package com.advancedoop.theory.chapter1.lecture4;

import javax.swing.*;
import java.awt.*;

public class Ex9 extends JFrame {
  Container container;
  JButton[] button;

  public Ex9() {
    container = getContentPane();
    container.setLayout(new GridLayout(4, 4, 0, 10));

    setTitle("Grid Layout");
    setSize(1000, 800);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    button = new JButton[16];
    for (int i = 1; i < 17; i++) {
      button[i - 1] = new JButton(i + "");
      container.add(button[i - 1]);
    }
  }

  public static void main(String[] args) {
    new Ex9();
  }
}
