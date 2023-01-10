package com.advancedoop.theory.chapter2.lecture2;

public class DemonstrateThread extends Thread {
  String firstname, lastname;
  long aWhile;

  public DemonstrateThread(String firstname, String lastname, long aWhile) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.aWhile = aWhile;
  }

  public void run() {
    try {
      while (true) {
        System.out.print(firstname + " ");
        sleep(aWhile);
        System.out.print(lastname + "\n");
      }
    } catch (Exception e) {
      System.out.println(firstname + lastname);
    }
  }

  public static void main(String[] args) {
    // This my in the midterm exam !
    DemonstrateThread first = new DemonstrateThread("Hopalong", "Cassidy", 2000L);
    DemonstrateThread second = new DemonstrateThread("Marilyn", "Monroe", 3000L);
    // DemonstrateThread third = new DemonstrateThread("name", "name", 3000L);
    first.start();
    second.start();
  }

}
