package com.belajar;
import java.util.Scanner;

public class SystemMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar harga barang
        double hargaApel = 5000.0;
        double hargaPisang = 3000.0;
        double hargaJeruk = 4000.0;

        System.out.println("Selamat datang");
        System.out.println("1. Apel - Rp " + hargaApel);
        System.out.println("2. Pisang - Rp " + hargaPisang);
        System.out.println("3. Jeruk - Rp " + hargaJeruk);
        System.out.print("Pilih barang (1/2/3): ");
        int pilihan = scanner.nextInt();

        double hargaBarang = 0.0;
        if (pilihan == 1) {
            hargaBarang = hargaApel;
        } else if (pilihan == 2) {
            hargaBarang = hargaPisang;
        } else if (pilihan == 3) {
            hargaBarang = hargaJeruk;
        } else {
            System.out.println("Pilihan tidak valid");
            System.exit(0);
        }

        System.out.print("Masukkan jumlah barang: ");
        int jumlah = scanner.nextInt();

        double totalHarga = hargaBarang * jumlah;
        System.out.println("Total harga: Rp " + totalHarga);
        scanner.close();
    }
}