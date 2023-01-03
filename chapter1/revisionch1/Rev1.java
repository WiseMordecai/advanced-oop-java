package com.advancedoop.theory.chapter1.revisionch1;

import javax.swing.JOptionPane;

public class Rev1 {
  public static void main(String[] args) {
    System.out.println("Ahmed bin Ali");
    String str = JOptionPane.showInputDialog(null, "Enter your name");
    JOptionPane.showMessageDialog(null, "Hello Mr. " + str + "\nKing Khalid University");
  }
}
