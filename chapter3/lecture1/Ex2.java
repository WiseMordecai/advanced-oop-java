package com.advancedoop.theory.chapter3.lecture1;

import java.net.*;

public class Ex2 {
  public static void main(String[] args) throws MalformedURLException {
    URL u1 = new URL("http://www.kku.edu.sa:80/index.html");
    System.out.println("External Form : " + u1.toExternalForm());
    System.out.println("Protocol : " + u1.getProtocol());
    System.out.println("Host : " + u1.getHost());
    // if port number is not provided in the constructor, getPort will return -1
    System.out.println("Port : " + u1.getPort());
    System.out.println("File : " + u1.getPath());

  }
}
