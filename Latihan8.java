package com.belajar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Latihan8 {
    private static Map<String, Item> inventory = new HashMap<>();

    public static void main(String[] args) {
        //inventory
        inventory.put("Apel", new Item("Apel", 10, 25000.0));
        inventory.put("Pisang", new Item("Pisang", 20, 10000.00));
        inventory.put("Jeruk", new Item("Jeruk", 15, 30000.00));
        inventory.put("Anggur", new Item("Anggur", 25, 40000.00));
        inventory.put("Mangga", new Item("Mangga", 30, 50000.00));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Beli barang");
            System.out.println("2. List barang");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    double totalPurchase = 0.0;
                    while (true) {
                        System.out.println("Masukkan barang yang ingin dibeli: ");
                        String itemName = scanner.nextLine();

                        Item item = inventory.get(itemName);

                        if (item == null) {
                            System.out.println("Barang tidak ditemukan.");
                            continue;
                        }

                        System.out.println("Masukkan jumlah barang: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();

                        if (quantity > item.getStock()) {
                            System.out.println("Barang tidak cukup.");
                            continue;
                        }

                        double totalPrice = item.getPrice() * quantity;
                        item.reduceStock(quantity);
                        totalPurchase += totalPrice;

                        System.out.println("Total harga: Rp " + totalPrice);
                        System.out.println("Sisa barang " + itemName + ": " + item.getStock());

                        System.out.println("Apakah Anda ingin membeli barang lain? (y/n): ");
                        String response = scanner.nextLine();
                        if (!response.equalsIgnoreCase("y")) {
                            System.out.println("Total keseluruhan harga: Rp " + totalPurchase);
                            System.out.println("Masukkan jumlah uang yang Anda miliki: ");
                            double userMoney = scanner.nextDouble();
                            scanner.nextLine();

                            if (userMoney >= totalPurchase) {
                                double change = userMoney - totalPurchase;
                                System.out.println("Pembayaran berhasil. Kembalian Anda: Rp " + change);
                            } else {
                                System.out.println("Uang Anda tidak cukup untuk melakukan pembelian.");
                            }
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("List semua barang:");
                    for (Item i : inventory.values()) {
                        System.out.println(i);
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan invalid, coba lagi.");
            }
        }
    }
}

class Item {
    private String name;
    private int stock;
    private double price;

    public Item(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Stock: " + stock + ", Price: Rp" + price;
    }
}