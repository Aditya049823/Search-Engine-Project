package com.example.searchengine;

import java.sql.*;

public class DatabaseConnection {
    String MySQLURL="jdbc:mysql://localhost:3306/Search_Engine?useSSL=false";
    String DatabaseUserName="root";
    String DatabasePassword="Aditya@123";

    Connection con=null;

    DatabaseConnection()throws SQLException{
        con= DriverManager.getConnection(MySQLURL,DatabaseUserName,DatabasePassword);
        System.out.println("Connection to database is sucessfull");
    }

    public ResultSet executeQuery(String query) throws SQLException {
        //for read operation
        ResultSet ans=null;
        Statement statement =con.createStatement();
        ans= statement.executeQuery(query);

        return ans;
    }

    public int executeUpdate(String query) throws SQLException {
       int ans=0;
       Statement statement=con.createStatement();
       ans= statement.executeUpdate(query);

       return ans;
    }
}
