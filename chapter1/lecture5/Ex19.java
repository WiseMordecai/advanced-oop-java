package com.advancedoop.theory.chapter1.lecture5;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Ex19 extends JFrame implements MouseMotionListener {
  Container container;

  Ex19() {
    container = getContentPane();

    container.addMouseMotionListener(this);
    setTitle("Mouse");
    setVisible(true);
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Ex19();
  }

  @Override
  public void mouseDragged(java.awt.event.MouseEvent e) {
    System.out.println("Mouse Dragged");
    container.setBackground(Color.MAGENTA);
    System.out.println("x : " + e.getX() + " | Y : " + e.getY());

  }

  @Override
  public void mouseMoved(java.awt.event.MouseEvent e) {
    System.out.println("Mouse Moved");
    container.setBackground(Color.BLUE);
    System.out.println("x : " + e.getX() + " | Y : " + e.getY());
  }
}
