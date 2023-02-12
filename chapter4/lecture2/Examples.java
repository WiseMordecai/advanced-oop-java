package com.advancedoop.theory.chapter4.lecture2;

import java.sql.*;

public class Examples {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");

    /*
     * in this example, We are using "MySQL"
     * so you have to install the developer pack on your own from mysql site (watch
     * youtube)
     * or install XAMPP and install mysql, custom, and then choose the Connector J
     * 
     * after you installed the above
     * you have to create a database using the command: CREATE DATABASE
     * database_name
     * and put it in the getConnection method like this jdbc:mysql://localhost/(YOUR
     * DATABASE)
     */

    // establish a connection to the MySQL Database with given parameters..
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/kkudb", "root", "");
    System.out.println("Connected to the Database");

    // Creates a Statement object for sending SQL statements to the database.
    Statement statement = connection.createStatement();

    // The SQL Command for creating the table inside the database
    String sqlQuery = "CREATE TABLE students (" +
        "StudentName VARCHAR(50) NOT NULL, " +
        "student_id INTEGER NOT NULL PRIMARY KEY);";

    // Here you pass the sqlQuery String.
    statement.execute(sqlQuery);
    System.out.println("Table Created Successfully!");

    // Insert into table
    sqlQuery = "INSERT INTO students VALUES('Ahmed', 1);";
    statement.executeUpdate(sqlQuery);
    sqlQuery = "INSERT INTO students VALUES('Ali', 2);";
    statement.executeUpdate(sqlQuery);
    sqlQuery = "INSERT INTO students VALUES('Mohammed', 3); ";
    statement.executeUpdate(sqlQuery);
    System.out.println("Values inserted.");

    // Update Record
    sqlQuery = "UPDATE students SET StudentName = 'Ibrahim' WHERE student_id = 1";
    statement.executeUpdate(sqlQuery);
    System.out.println("Record Updated Successfully!");

    // Delete Record
    sqlQuery = "DELETE FROM students WHERE student_id = 1; ";
    statement.executeUpdate(sqlQuery);
    System.out.println("Record Deleted Successfully!");

    // Select 'Display' records
    ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
    while (resultSet.next()) {
      System.out.println("ID: " + resultSet.getString("student_id") +
          "\t | \t Student Name: " + resultSet.getString("StudentName"));
    }

    // Drop table.
    sqlQuery = "DROP TABLE students;";
    statement.execute(sqlQuery);
    System.out.println("Table Dropped Successfully.");
    // it is preffered to stick with this order
    resultSet.close();
    statement.close();
    connection.close();

  }
}
