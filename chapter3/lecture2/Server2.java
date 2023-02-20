package com.advancedoop.theory.chapter3.lecture2;

// continues server
import java.net.*;
import java.io.*;
import java.util.Scanner;

class Server {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(2345);
    Socket s = ss.accept();
    System.out.println("Server is Running");
    PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
    Scanner scan = new Scanner(s.getInputStream());
    int year;
    while (true) {
      System.out.println("Client connected");
      // String str = scan.nextLine();
      year = scan.nextInt();
      pw.println((2023 - year));
    }
    // s.close();
    // ss.close();
  }
}
