package com.advancedoop.theory.chapter1.revisionch1;

import javax.swing.*;
import java.awt.*; // Abstract window toolkit

public class Rev2 extends JFrame {

  Container cp;

  Rev2() {
    cp = getContentPane(); // gives you the control of the container to cp pbject
    cp.setBackground(Color.GRAY);

    setTitle("Our Frame");
    setLocation(300, 300);
    setSize(400, 400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Rev2();
  }
}
