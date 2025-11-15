package app;
import data.Barang;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Barang
        Barang b1 = new Barang("Router WiFi", 350000, 5);
        Barang b2 = new Barang("Switch 8 Port", 250000, 3);
        Barang b3 = new Barang("Kabel LAN 10m", 50000, 10);;

        // Menampilkan data semua barang
        System.out.println("=== DAFTAR BARANG TOKO KOMPUTER ===");
        b1.tampilkanData();
        b2.tampilkanData();
        b3.tampilkanData();
    }
}