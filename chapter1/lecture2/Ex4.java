package com.advancedoop.theory.chapter1.lecture2;

import javax.swing.*;
import java.awt.*;

public class Ex4 extends JFrame {
  Container cp;
  JButton b1, b2, b3, b4, b5;

  Ex4() {
    cp = getContentPane();

    cp.setBackground(Color.LIGHT_GRAY);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(200, 200);
    setTitle("My first GUI Program");
    setSize(600, 600);
    setVisible(true);

    cp.setLayout(new FlowLayout());

    b1 = new JButton("one");
    b2 = new JButton("two");
    b3 = new JButton("three");
    b4 = new JButton("four");
    b5 = new JButton("five");

    cp.add(b1);
    cp.add(b2);
    cp.add(b3);
    cp.add(b4);
    cp.add(b5);
  }

  public static void main(String[] args) {
  }
}
