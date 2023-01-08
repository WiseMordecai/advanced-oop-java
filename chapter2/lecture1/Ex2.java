package com.advancedoop.theory.chapter2.lecture1;

public class Ex2 {
  public static void main(String[] args) throws InterruptedException {
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + "\t");
      Thread.sleep(1000); // it will throws InterruptedException
      // you can catch it using throws keyword or try-catch block
      try {
        Thread.sleep(1000); // it will throws InterruptedException
      } catch (InterruptedException e) {
        System.out.println("Thread Interrupted");
      }
    }
  }
}
