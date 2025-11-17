package app;
import data.Barang;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Membuat beberapa objek Barang
        Barang b1 = new Barang("Router WiFi", 350000, 5, "ROBOT", 1000);
        Barang b2 = new Barang("Switch 8 Port", 250000, 3, "CommScope", 120);
        Barang b3 = new Barang("Kabel LAN 10m", 50000, 10, "Vention", 1245);
        Barang b4 = new Barang("Medkit", 20000, 12, "FreeFire", 500);
        Barang b5 = new Barang("Ayam Bakar", 14000, 100, "-", 140);
        Barang b6 = new Barang("Ikan Goreng", 17000, 120, "-", 250);

        Barang[] Elektronik = { b1 ,b2 ,b3 };
        Barang[] Kesehatan = { b4 };
        Barang[] Makanan = { b5, b6 };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Halo pelanggan setia toko Merdeka!, apa yang anda ingin lakukan?");
        System.out.println("lihat barang berdasarkan kategori (sort)");
        System.out.println("list barang (list)");
        String hasilInput = scanner.nextLine().trim();
        if (hasilInput.equalsIgnoreCase("sort")) {
            System.out.println("Kategori apa yang ingin anda lihat?");
            System.out.println("Elektronik (e)");
            System.out.println("Kesehatan (k)");
            System.out.println("Makanan (m)");
            String hasilInput2 = scanner.nextLine().trim();
            char pilihan = hasilInput2.isEmpty() ? ' ' : hasilInput2.charAt(0);

            if (pilihan == 'e') {
                System.out.println("=== KATEGORI ELEKTRONIK ===");
                for (Barang b : Elektronik) b.tampilkanData();
            } else if (pilihan == 'k') {
                System.out.println("=== KATEGORI KESEHATAN ===");
                for (Barang b : Kesehatan) b.tampilkanData();
            } else if (pilihan == 'm') {
                System.out.println("=== KATEGORI MAKANAN ===");
                for (Barang b : Makanan) b.tampilkanData();
            } else {
                System.out.println("ERROR: Kategori tidak dikenali.");
            }
        } else if (hasilInput.equalsIgnoreCase("list")) {
            // Menampilkan data semua barang
            System.out.println("=== DAFTAR BARANG ===");
            b1.tampilkanData();
            b2.tampilkanData();
            b3.tampilkanData();
            b4.tampilkanData();
            b5.tampilkanData();
            b6.tampilkanData();
        } else {
            System.out.println("Input tidak dikenali. Ketik \"sort\" atau \"list\".");
        }


    }
}