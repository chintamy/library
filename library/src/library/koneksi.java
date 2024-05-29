/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author B. Anggun Chintamy
 */
public class koneksi {
    private static Connection koneksi = null;

    static Connection koneksiDb() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Connection getkoneksi() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return koneksi;
    }
}