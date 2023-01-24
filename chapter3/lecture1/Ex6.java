package com.advancedoop.theory.chapter3.lecture1;

import java.net.*;
import java.io.*;
import java.util.Scanner;

// class SimpleClient
public class Ex6 {
  public static void main(String[] args) throws Exception {
    Socket s = new Socket("localhost", 2345);

    PrintStream pw = new PrintStream(s.getOutputStream(), true);
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a message : ");
    String str = scan.nextLine();

    pw.println(str);

    pw.close();
    s.close();
  }
}
