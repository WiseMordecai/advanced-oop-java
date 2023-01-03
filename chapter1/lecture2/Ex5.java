package com.advancedoop.theory.chapter1.lecture2;

import javax.swing.*;
import java.awt.*;

public class Ex5 extends JFrame {
  // JFrame f;
  Container cp;
  JButton b1, b2, b3, b4;

  Ex5() {
    // cp = f.getContentPane(); // gives you the control of the container to cp
    // project, the default is border layout
    cp = getContentPane(); // gives you the control of the container to cp project, the default is border
                           // layout
    cp.setBackground(Color.GRAY);

    // Now out layout is flow layout
    cp.setLayout(new FlowLayout());

    setTitle("Our Frame");
    setLocation(300, 300);
    setSize(500, 500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // f.setTitle("Our Frame");
    // f.setLocation(300, 300);
    // f.setSize(500, 500);
    // f.setVisible(true);
    // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    b1 = new JButton("ONE");
    b2 = new JButton("TWO");
    b3 = new JButton("THREE");
    b4 = new JButton("FOUR");
    cp.add(b1); // Adding the button in the Container
    cp.add(b2); // Adding the button in the Container
    cp.add(b3); // Adding the button in the Container
    cp.add(b4); // Adding the button in the Container

  }

  public static void main(String[] args) {
    new Ex5();
  }

}
