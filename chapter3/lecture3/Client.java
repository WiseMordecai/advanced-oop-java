package com.advancedoop.theory.chapter3.lecture3;

import java.net.*;
import java.io.*;
import java.util.*;

class SimpleClient {
  public static void main(String[] args) throws Exception {
    Socket s = new Socket("localhost", 5678);
    PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
    Scanner in = new Scanner(System.in);
    Scanner sc = new Scanner(s.getInputStream());
    String send, receive;

    do {
      System.out.print("Enter you year of birth : ");
      send = in.nextLine();
      pw.println(send);
      receive = sc.nextLine();
      System.out.println("Resonpse from the Server = " + receive);
    } while (!(send.equalsIgnoreCase("STOP")));
    /*
     * pw.close();
     * sc.close();
     * s.close();
     */
  }
}