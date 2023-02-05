package com.advancedoop.theory.chapter3.lecture4;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
  public static void main(String[] args) throws Exception {
    final String HOST = "localhost";
    final int PORT = 5678;
    Socket s = new Socket(HOST, PORT);
    Scanner sc = new Scanner(s.getInputStream());
    PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
    Scanner in = new Scanner(System.in);
    System.out.println("Connected to server: " + HOST + ":" + PORT);
    String message;
    do {
      // System.out.print("You (Enter kms as an integer number): ");
      System.out.print("You (Enter your age): ");
      message = in.nextLine();
      pw.println(message);
      System.out.println("Server: " + sc.nextLine());
    } while (!message.equalsIgnoreCase("STOP"));
    System.out.println("Disconnecting from server");
    s.close();
  }
}