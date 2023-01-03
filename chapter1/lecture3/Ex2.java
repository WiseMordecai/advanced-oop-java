package com.advancedoop.theory.chapter1.lecture3;

import javax.swing.*;
import java.awt.*;

public class Ex2 extends JFrame {
  /*
   * Homework, Array of button
   * 
   */
  JButton b1, b2, b3, b4, b5;
  Container container;

  Ex2() {
    container = getContentPane(); //

    setTitle("Border Layout");
    // setLocation();
    setSize(500, 500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    b1 = new JButton("One");
    b2 = new JButton("Two");
    b3 = new JButton("Three");
    b4 = new JButton("Four");
    b5 = new JButton("Five");

    container.add(b1, "North");
    container.add(b2, "South");
    container.add(b3, "East");
    container.add(b4, "West");
    container.add(b5, "Center");

    // Instead of cp.add(b5, "Center"), we can cp.add(b5)
  }

  public static void main(String[] args) {
    new Ex2();
  }
}
