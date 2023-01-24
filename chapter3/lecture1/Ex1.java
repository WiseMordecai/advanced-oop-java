package com.advancedoop.theory.chapter3.lecture1;

import java.net.*;

public class Ex1 {
  public static void main(String[] args) throws UnknownHostException {
    // write a program to identify your system in the network
    InetAddress ia = InetAddress.getLocalHost();
    System.out.println(ia);
    // http://www.kku.edu.sa:80/index.html
    // https, http = protocol
    // host name = kku.edu.sa
    // port number = 80
    // path = index.html
  }
}
