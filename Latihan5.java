package com.belajar;
import java.util.Scanner;

public class Latihan5 {

    public static void main(String[] args) {
        // Mengolah input data sederhana
        // menggunakan class Scanner
        int IdPasien, keluhan;
        String NamaPasien, Alamat;
        Scanner Input = new Scanner(System.in);
        System.out.println("Data Pasien");
        System.out.println("----------");
        System.out.print("IdPasien : ");
        IdPasien = Input.nextInt();
        System.out.print("NamaPasien : ");
        NamaPasien = Input.next();
        System.out.print("Alamat : ");
        Alamat = Input.next();
        System.out.print("keluhan : ");
        keluhan = Input.nextInt();
        
        // Menampilkan data pasien
        System.out.println("Data pasien");
        System.out.println("----------");
        System.out.println("idPasien: " + IdPasien);
        System.out.println("namaPasien: " + NamaPasien );
        System.out.println("Alamat: " + Alamat);
        System.out.println("keluhan: " + keluhan);

    }
}
