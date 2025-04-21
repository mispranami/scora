/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;

public class DBConnection {
  private static Connection conn;
   public static Connection getConnection() throws ClassNotFoundException,SQLException
   {
       String url = "jdbc:mysql://localhost:3306/onlineexaminationsystem";
       String user = "root";
       String pass = "localhost";
       if (conn==null)
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            
            System.out.println("database connected successfully");
          
            
       }
       return conn;
   }
}

