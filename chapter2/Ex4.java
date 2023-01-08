package com.advancedoop.theory.chapter2;

public class Ex4 extends Thread {

  Ex4() {
  }

  Ex4(String name) {
    super(name);
  }

  public void run() {

  }

  public static void main(String[] args) {
    Ex4 thread = new Ex4();
    System.out.println("Child thread  : " + thread); // Child thread : Thread[Thread-0,5,main]
    thread.setName("Tom");
    System.out.println("Child thread  : " + thread); // Child thread : Thread[Tom,5,main]

    Ex4 thread2 = new Ex4("Jerry");
    System.out.println("Child thread  : " + thread2); // Child thread : Thread[Jerry,5,main]
  }
}
