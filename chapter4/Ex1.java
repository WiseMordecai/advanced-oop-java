package com.advancedoop.theory.chapter4;

import java.sql.*;

public class Ex1 {
  // Simple Program for the SQL connection and queries
  public static void main(String[] args) throws Exception {
    Class.forName("sun.jdbs.odbc.JdbcOdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:odbc:kku"); // kku is a source name "DSN"
    System.out.println("Connected to the Database");
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM student");// Here type the query
    while (resultSet.next()) {
      System.out.println("Display record");
    }

    // it is preffered to stick with this order
    resultSet.close();
    statement.close();
    connection.close();

  }
}
