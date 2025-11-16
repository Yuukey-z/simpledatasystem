package app;
import data.Barang;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Barang
        Barang b1 = new Barang("Router WiFi", 350000, 5, "ROBOT", 1000);
        Barang b2 = new Barang("Switch 8 Port", 250000, 3, "CommScope", 120);
        Barang b3 = new Barang("Kabel LAN 10m", 50000, 10, "Vention", 1245);

        // Menampilkan data semua barang
        System.out.println("=== DAFTAR BARANG TOKO KOMPUTER ===");
        b1.tampilkanData();
        b2.tampilkanData();
        b3.tampilkanData();
    }
}