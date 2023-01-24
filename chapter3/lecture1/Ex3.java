package com.advancedoop.theory.chapter3.lecture1;

import java.net.*;

public class Ex3 {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress ia1 = InetAddress.getByName("www.kku.edu.sa");
    System.out.println("Details of [www.kku.edu.sa] " + ia1);

    ia1 = InetAddress.getByName("www.youtube.com");
    System.out.println("Details of [www.kku.edu.sa] " + ia1);

    InetAddress[] ia2 = InetAddress.getAllByName("www.youtube.com");
    System.out.println("Details of [www.kku.edu.sa] " + ia1);

    for (int i = 0; i < ia2.length; i++) {
      System.out.println(ia2[i]);
    }

  }
}
