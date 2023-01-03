package com.advancedoop.theory.chapter1.lecture1;

import javax.swing.*;
// import java.util.Scanner;

public class Ex2 {

  public static void main(String[] args) {
    // display name to the user in the terminal

    // Scanner scan = new Scanner(System.in);
    String str;

    // System.out.println("Enter your name: ");
    // str = scan.nextLine();
    // System.out.println("Your name: " + str);

    // display name to the user using GUI

    str = JOptionPane.showInputDialog(null, "Enter Your Name: ");
    JOptionPane.showMessageDialog(null, "Hello Mr. " + str);
  }
}
