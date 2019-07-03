/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Go
 */
public class db {
    
 public static Connection mycon(){
 
 
     Connection con = null ;
     try {
         
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","");
         
         return con;
         
         
     } catch (ClassNotFoundException | SQLException e) {
         
         return null;
     }
 
 
 
 } 
    
}
