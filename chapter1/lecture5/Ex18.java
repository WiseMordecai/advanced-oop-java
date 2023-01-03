package com.advancedoop.theory.chapter1.lecture5;

import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.*;

public class Ex18 extends JFrame implements MouseListener {
  Container container;

  Ex18() {
    container = getContentPane();

    container.addMouseListener(this);
    setTitle("Mouse");
    setVisible(true);
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Ex18();
  }

  @Override
  public void mouseClicked(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("Mouse Clicked");
    container.setBackground(Color.MAGENTA);
  }

  @Override
  public void mousePressed(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("Mouse Pressed");
    container.setBackground(Color.BLUE);
  }

  @Override
  public void mouseReleased(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("Mouse released");
    container.setBackground(Color.YELLOW);
  }

  @Override
  public void mouseEntered(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("Mouse entered");
    container.setBackground(Color.RED);

  }

  @Override
  public void mouseExited(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    System.out.println("Mouse exited");
    container.setBackground(Color.WHITE);

  }
}
