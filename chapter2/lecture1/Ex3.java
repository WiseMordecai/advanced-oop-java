package com.advancedoop.theory.chapter2.lecture1;

public class Ex3 extends Thread {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    Ex3 thread = new Ex3();
    System.out.println("Child thread  : " + thread);
    thread.setPriority(7);
    System.out.println("Child thread  : " + thread);
    thread.setPriority(Thread.NORM_PRIORITY + 3);
    System.out.println("Child thread  : " + thread);
    thread.setPriority(Thread.MAX_PRIORITY - 4);
    System.out.println("Child thread  : " + thread);
    thread.setPriority(Thread.MIN_PRIORITY + 5);
    System.out.println("Child thread  : " + thread);
    thread.setPriority(Thread.MIN_PRIORITY + Thread.NORM_PRIORITY);
    System.out.println("Child thread  : " + thread);
    // thread.start();
  }
}
