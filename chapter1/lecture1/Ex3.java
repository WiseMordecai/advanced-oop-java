package com.advancedoop.theory.chapter1.lecture1;

import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame {

  Container cp;

  public Ex3() { // You will right in every program

    cp = getContentPane();

    cp.setBackground(Color.LIGHT_GRAY);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(200, 200);
    setTitle("My first GUI Program");
    setSize(600, 600);
    setVisible(true);
  }

  public static void main(String[] args) {
    // Ex3 frame = new Ex3();
  }
}
