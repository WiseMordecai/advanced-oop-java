package com.advancedoop.theory.chapter1.lecture6;

import javax.swing.*;

public class Questions {
  public static void main(String[] args) {
    /*
     * Question 1: Display the message "I Love Java" By using JOptionPane..
     * Answer :
     */
    JOptionPane.showMessageDialog(null, "I love Java");
    /*
     * Question 2: Using JOptionPane input dialog, write a statement to input the
     * person’s first name
     * Answer :
     */
    String str = JOptionPane.showInputDialog(null, "Input First Name");
    JOptionPane.showMessageDialog(null, "Hello Mr." + str);
    /*
     * Question 3: Using JOptionPane input dialog, write a statement to input the
     * person’s age(integer).
     *
     */
    String ageSTR = JOptionPane.showInputDialog(null, "Input First Name");
    int age = Integer.parseInt(ageSTR);
    JOptionPane.showMessageDialog(null, "Age : " + age);
  }
}
