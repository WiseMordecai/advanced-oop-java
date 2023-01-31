package com.advancedoop.theory.chapter3.lecture3;

import java.net.*;
import java.io.*;
import java.util.*;

class SimpleServer {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(5678);
    System.out.println("Server is Running....");
    Socket s = ss.accept();
    System.out.println("Connection Established");
    PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
    Scanner sc = new Scanner(s.getInputStream());
    String str;
    int y, age;
    while (true) {
      str = sc.nextLine();
      System.out.println("Message from Clint : " + str);
      try {
        y = Integer.parseInt(str);
        age = 2023 - y;
        str = "Your age is " + age;
        pw.println(str);
      } catch (Exception e) {
        if (str.equalsIgnoreCase("STOP"))
          pw.println("Good Bye");
        else
          pw.println("Please enter an integer number OR STOP/stop to end the connection");
      }
    }
    /*
     * sc.close();
     * s.close();
     * pw.close();
     * ss.close();
     */
  }
}
