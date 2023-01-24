package com.advancedoop.theory.chapter3.lecture1;

import java.net.*;
import java.io.*;
import java.util.Scanner;

// Simple Serverclass
public class Ex5 {
  public static void main(String[] args) throws Exception {
    // the client uses socket
    // Server uses serversocket
    ServerSocket ss = new ServerSocket(2345);
    System.out.println("Server is Running");
    Socket s = ss.accept();
    System.out.println("Server established");
    Scanner scan = new Scanner(s.getInputStream());
    String str = scan.nextLine();
    System.out.println("Message from client : " + str);

    scan.close();
    s.close();
    ss.close();
  }
}
