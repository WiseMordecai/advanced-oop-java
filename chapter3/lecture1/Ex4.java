package com.advancedoop.theory.chapter3.lecture1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) throws Exception, IOException {
    URL u = new URL("https://www.youtube.com");

    URLConnection uc = u.openConnection();
    Scanner scan = new Scanner(uc.getInputStream());
    String str = scan.nextLine();
    while (str != null) {
      System.out.println(str);
      scan.nextLine();
    }
    scan.close();

  }
}
