package com.belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Latihan7 {
    public static void main(String[] args) throws IOException {
        String nama;
        int usia;
        //membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        //mengisi variabel nama dengan bufferreader
        System.out.print("Masukkan Nama Anda: ");
        nama = br.readLine();
        //mengisi variabel usia dengan bufferreader
        System.out.print("Masukkan Usia Anda: ");
        usia = Integer.parseInt(br.readLine());
        //tampilkan output isi variabel nama
        System.out.println("--------------------");
        System.out.println("Nama anda adalah: " + nama);
        System.out.println("Usia anda adalah: " + usia);
    }
    
}
