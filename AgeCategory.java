package com.belajar;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan umur anda:");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Usia anda tidak valid");
        } else if (age >= 0 && age <=12) {
            System.out.println("Anda termasuk kedalam kategori anak-anak.");
        } else if (age >= 13 && age <=17) {
            System.out.println("Anda termasuk kedalam kategori remaja.");
        } else if (age >= 18 && age <=64) {
            System.out.println("Anda termasuk kedalam kategori dewasa.");
        } else if (age >= 65) {
            System.out.println("Anda termasuk kedalam kategori lansia");
        } else {
            System.out.println("Data tidak valid");
        }

        scanner.close();
    }
    
}
