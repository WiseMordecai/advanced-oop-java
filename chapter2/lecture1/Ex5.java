package com.advancedoop.theory.chapter2;

public class Ex5 implements Runnable {
  Thread thread;

  Ex5() {
    thread = new Thread(this);
  }

  Ex5(String name) {
    thread = new Thread(this, name);
  }

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    Ex5 t = new Ex5();
    System.out.println("Child thread  : " + t);
    t.thread.start();
  }
}
