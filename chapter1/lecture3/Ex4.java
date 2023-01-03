package com.advancedoop.theory.chapter1.lecture3;

import javax.swing.*;
import java.awt.*;

/*
 * Program 8
 */
public class Ex4 extends JFrame {

  Container container;
  JLabel label;

  Ex4() {
    container = getContentPane();
    label = new JLabel(new ImageIcon(
        "C:\\Users\\odm\\Documents\\VsCodeProjects\\java-workspace\\university\\src\\com\\advancedoop\\theory\\chapterone\\lecture3\\imgs\\terminalSnap.png"));
    container.add(label);
    container.setBackground(Color.LIGHT_GRAY);
    setTitle("Image");
    setVisible(true);
    setSize(800, 800);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Ex4();
  }
}
