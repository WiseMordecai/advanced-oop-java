package com.advancedoop.theory.chapter1.lecture6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex20 extends JFrame implements ActionListener {

  Container container;
  JMenuBar menuBar;
  JMenu file, background, foreground;
  JMenuItem open, save, exit, cyan, blue, whitebackground, white, black, red;
  JTextArea textArea;
  JSeparator separator; // to add thin line

  Ex20() {
    // Adding Frame
    setTitle("JMenuBar");
    setVisible(true);
    setSize(800, 800);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    container = getContentPane();
    textArea = new JTextArea();
    menuBar = new JMenuBar();
    setJMenuBar(menuBar); // add it
    // JMenu Objects
    file = new JMenu("File");
    background = new JMenu("background");
    foreground = new JMenu("foreground");
    // JMenuItem Objects
    open = new JMenuItem("Open");
    save = new JMenuItem("save");
    separator = new JSeparator(); // to add thin line
    exit = new JMenuItem("exit");
    // Adding Listener
    open.addActionListener(this);
    save.addActionListener(this);
    exit.addActionListener(this);
    // Add the operations to the File Menu
    file.add(open);
    file.add(save);
    file.add(separator); // to add thin line between (open , save) and exit.
    file.add(exit);
    // Colors
    cyan = new JMenuItem("cyan");
    blue = new JMenuItem("blue");
    whitebackground = new JMenuItem("white");
    black = new JMenuItem("black");
    white = new JMenuItem("white");
    red = new JMenuItem("red");
    // Adding Listener
    cyan.addActionListener(this);
    blue.addActionListener(this);
    whitebackground.addActionListener(this);
    black.addActionListener(this);
    white.addActionListener(this);
    red.addActionListener(this);
    // Adding items to the menu
    background.add(cyan);
    background.add(blue);
    background.add(whitebackground);
    foreground.add(black);
    foreground.add(red);
    foreground.add(white);
    // Add the Menus to MenuBar
    menuBar.add(file);
    menuBar.add(background);
    menuBar.add(foreground);
    container.add(textArea);
  }

  public static void main(String[] args) {
    new Ex20();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // Sreach for fileinputstream
    JFileChooser fileChooser = new JFileChooser();
    if (e.getSource().equals(open)) {
      fileChooser.showOpenDialog(null);
    } else if (e.getSource().equals(save)) {
      fileChooser.showSaveDialog(null);
    } else if (e.getSource().equals(exit)) {
      System.exit(1);
    } else if (e.getSource().equals(cyan)) {
      textArea.setBackground(Color.CYAN);
    } else if (e.getSource().equals(blue)) {
      textArea.setBackground(Color.BLUE);
    } else if (e.getSource().equals(whitebackground)) {
      textArea.setBackground(Color.WHITE);
    } else if (e.getSource().equals(black)) {
      textArea.setForeground(Color.black);
    } else if (e.getSource().equals(white)) {
      textArea.setForeground(Color.white);
    } else if (e.getSource().equals(red)) {
      textArea.setForeground(Color.red);
    }
  }
}
