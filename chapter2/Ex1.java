package com.advancedoop.theory.chapter2;

public class Ex1 {
  public static void main(String[] args) {
    Thread thread = Thread.currentThread();
    System.out.println("Thread : " + thread);
    System.out.println("Thread Priority : " + thread.getPriority());
    System.out.println("Thread Name : " + thread.getName());
  }
}
