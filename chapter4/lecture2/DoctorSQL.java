package com.advancedoop.theory.chapter4.lecture2;

import java.sql.*;

class JDBCPrg {
  public static void main(String[] args) throws Exception {
    // Load the JDBC driver
    // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); -- Use this for Exam
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver Loaded...");

    // Connect to the database
    // Connection connection = DriverManager.getConnection("jdbc:odbc:kku");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kku", "root", "Nothing28");
    System.out.println("Connection Established");

    Statement statement = connection.createStatement();
    String query;

    query = "DROP TABLE Students";
    statement.executeUpdate(query);
    System.out.println("Student Table Deleted");

    // CREATE TABLE
    query = "CREATE TABLE Students (StudentID INTEGER not NULL, StudentName VARCHAR(200), StudentMarks INTEGER, PRIMARY KEY (StudentID))";
    statement.executeUpdate(query);
    System.out.println("Student Table Created");

    // INSERT RECORD
    query = "INSERT INTO Students VALUES (12345, 'Abubakr', 100)";
    statement.executeUpdate(query);
    System.out.println("Record Inserted");

    query = "INSERT INTO Students VALUES (12346, 'Omer', 100)";
    statement.executeUpdate(query);
    System.out.println("Record Inserted");

    query = "INSERT INTO Students VALUES (12347, 'Osman', 100)";
    statement.executeUpdate(query);
    System.out.println("Record Inserted");

    // READ & DISPLAY ALL RECORD
    query = "SELECT * FROM Students";
    ResultSet rs = statement.executeQuery(query);
    System.out.println("Records in the Stuidents Table");
    while (rs.next()) {
      int id = rs.getInt("StudentID");
      String name = rs.getString("StudentName");
      int marks = rs.getInt("StudentMarks");
      System.out.println("ID: " + id + ", Name: " + name + ", Marks = " + marks);
    }

    // UPDATE RECORD
    query = "UPDATE Students SET StudentMarks=99 WHERE StudentID=12345";
    statement.executeUpdate(query);
    System.out.println("Record Udated");
    query = "SELECT * FROM Students WHERE StudentID=12345";
    rs = statement.executeQuery(query);
    rs.next();
    int id = rs.getInt(1);// rs.getInt("StdID");
    String name = rs.getString(2); // rs.getString("StdName");
    int marks = rs.getInt(3);// rs.getInt("StdMarks");
    System.out.println("ID: " + id + ", Name: " + name + ", Marks = " + marks);

    // DELETE a record
    query = "DELETE FROM Students WHERE StudentName='Omer'";
    statement.executeUpdate(query);
    System.out.println("Record Deleted");
    query = "SELECT * FROM Students";
    rs = statement.executeQuery(query);
    ResultSetMetaData rsmd = rs.getMetaData();
    int cols = rsmd.getColumnCount();
    System.out.println("Records after Deletion from the table " + rsmd.getTableName(1));
    System.out.println("Number of Coloumns in the table " + rsmd.getTableName(1) + " = " + cols);
    while (rs.next()) {
      for (int i = 1; i <= cols; i++) {
        System.out.print(rsmd.getColumnName(i) + "=" + rs.getString(i) + "\t");
      }
      System.out.println("");
    }

  }
}
