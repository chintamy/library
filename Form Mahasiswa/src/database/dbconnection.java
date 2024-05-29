/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import database.*;

/**
 *
 * @author B. Anggun Chintamy
 */
public class dbconnection {
    Connection conn;
    
    public dbconnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitas", "root", "");
        }
        catch(Exception z){
            JOptionPane.showMessageDialog(null,z);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
}