package com.belajar;
import javax.swing.JOptionPane;
public class Latihan6 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda");
        String msg = "Halo " + nama + "!";
        JOptionPane.showMessageDialog(null, msg );    
    }
}
