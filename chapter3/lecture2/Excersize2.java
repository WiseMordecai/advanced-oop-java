package com.advancedoop.theory.chapter3.lecture2;

import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client {
  public static void main(String[] args) throws Exception {
    Socket s = new Socket("localhost", 2345);
    PrintStream pw = new PrintStream(s.getOutputStream(), true);
    Scanner scan = new Scanner(System.in);
    Scanner scanner = new Scanner(s.getInputStream());
    int year;
    // String str = scan.nextLine();
    System.out.println("Enter your DOB : ");
    while (true) {
      year = scan.nextInt();
      pw.println(year);
      // str = scanner.nextLine();
      year = scanner.nextInt();
      System.out.println("Your Age is : " + year);
    }
    // pw.close();
    // s.close();
  }
}
