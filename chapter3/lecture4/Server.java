package com.advancedoop.theory.chapter3.lecture4;

import java.io.*;
import java.net.*;
import java.util.*;

class Server {
  public static void main(String[] args) throws Exception {
    final int PORT = 5678;
    ServerSocket ss = new ServerSocket(PORT);

    System.out.println("Server started on port: " + PORT);

    while (true) {
      Socket s = ss.accept();
      System.out.println("Client connected: " + s.getInetAddress().getHostAddress());
      ClientHandler handler = new ClientHandler(s);
      handler.start();
    }
  }
}

class ClientHandler extends Thread {
  private Socket s;

  public ClientHandler(Socket s) {
    this.s = s;
  }

  public void run() {
    try {
      Scanner sc = new Scanner(s.getInputStream());
      PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
      String message;
      // int kms, mts;
      int age;
      while ((message = sc.nextLine()) != null) {
        System.out.println("Client " + s.getInetAddress().getHostAddress() + " says: " + message);
        if (message.equalsIgnoreCase("STOP")) {
          pw.println("Bye");
          break;
        }
        age = Integer.parseInt(message);
        // mts = kms * 1000;
        // pw.println(message + " kms = " + mts + " mts");
        if (age <= 0) {
          pw.println("you are still in your moms womb..");
        } else if (age >= 100) {
          pw.println("you are a geni or something... ?");
        } else if (age > 0 && age < 7) {
          pw.println("you are an INFANT");
        } else if (age > 6 && age < 13) {
          pw.println("you are an CHILD");
        } else if (age > 12 && age < 20) {
          pw.println("you are an TEENAGER");
        } else if (age > 19 && age < 61) {
          pw.println("you are an ADULT");
        } else if (age > 60 && age < 101) {
          pw.println("you are an WISE HUMAN");
        }
      }

      System.out.println("Client disconnected: " + s.getInetAddress().getHostAddress());

      s.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
