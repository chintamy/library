/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

import javax.swing.JFrame;
/**
 *
 * @author B. Anggun Chintamy
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat instance dari FLogin dan menampilkannya
        new FLogin().show();
    }
}

class FLogin extends JFrame {

    public FLogin() {
        // Inisialisasi komponen GUI di sini
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void show() {
        setVisible(true);
    }
}
