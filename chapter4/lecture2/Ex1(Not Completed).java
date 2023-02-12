package com.advancedoop.theory.chapter4.lecture2;

import java.sql.*;

class Ex1 {
  // Simple Program for the SQL connection and queries "Using MySQL"
  public static void main(String[] args) throws Exception {
    // load JDBC Driver
    // Class.forName("sun.jdbs.odbc.JdbcOdbc.Driver"); for microsoft access
    Class.forName("com.mysql.jdbc.Driver");

    // Connection connection = DriverManager.getConnection("jdbc:odbc:kku"); // kku
    // is a source name "DSN"
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/kkudb", "root", "");
    Statement statement = connection.createStatement();
    String query;
    // query = "CREATE TABLE students (Student_ID INTEGER NOT NULL, StudentName
    // VARCHAR(200)), StudentMarks INTEGER, PRIMARY KEY (Student_ID)";
    query = "DROP TABLE students";
    statement.executeUpdate(query);
    System.out.println("Student Table Created");
  }
}
