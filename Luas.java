package com.belajar;

import java.util.Scanner;
public class Luas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //masukkan jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        
        //menghitung luas lingkaran
        double luas = 3.14 * jariJari * jariJari;
        
        //hasil perhitungan
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " \nadalah: " + luas);
        
        scanner.close();
    }

}
