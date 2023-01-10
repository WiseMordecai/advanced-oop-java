package com.advancedoop.theory.chapter2.lecture2;

// JOIN ..... method is used to exit at the same time Join
// Join is a method of ..... THREAD

class MsgSender {
  synchronized public void sendMessage(String message) {
    System.out.print("{" + message);
    System.out.println("}");
  }
}

class Caller implements Runnable {
  String message;
  MsgSender sender;
  Thread t;

  public Caller(String message, MsgSender sender) {
    this.sender = sender;
    this.message = message;
    t = new Thread(this);
    t.start();
  }

  @Override
  public void run() {
    sender.sendMessage(message);
    System.out.println("Child Thread Exiting " + t.getName());
  }
}

public class DemonstrateThread2 {
  public static void main(String[] args) {
    MsgSender sender = new MsgSender();
    Caller t1, t2, t3;
    t1 = new Caller("Hello", sender);
    t2 = new Caller("Snyc", sender);
    t3 = new Caller("World", sender);

    try {
      t1.t.join();
      t2.t.join();
      t3.t.join();
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }

    System.out.println("Main Thread Exiting");
  }
}
