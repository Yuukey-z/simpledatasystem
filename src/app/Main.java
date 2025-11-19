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
        Barang b7 = new Barang("Headphones", 120000, 15, "Sony", 250);
        Barang b8 = new Barang("Power Bank 10000mAh", 180000, 20, "Anker", 220);
        Barang b9 = new Barang("Vitamin C 100s", 90000, 30, "Kalbe", 150);
        Barang b10 = new Barang("Nasi Goreng Spesial", 20000, 50, "-", 300);

        Barang[] Elektronik = { b1, b2, b3, b7, b8 };
        Barang[] Kesehatan = { b4, b9 };
        Barang[] Makanan = { b5, b6, b10 };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Halo, apa yang anda ingin lakukan?");
        System.out.println("lihat barang berdasarkan kategori (sort)");
        System.out.println("list barang (list)");
        String hasilInput = scanner.nextLine().trim();
        while (!hasilInput.equalsIgnoreCase("sort")
                && !hasilInput.equalsIgnoreCase("list")
                && !hasilInput.isEmpty()) {
            System.out.println("ERROR: Pilihan tidak dikenali. Silakan masukkan 'sort' atau 'list'.");
            hasilInput = scanner.nextLine().trim();
        }
        if (hasilInput.equalsIgnoreCase("sort")) {
            System.out.println("Kategori apa yang ingin anda lihat?");
            System.out.println("Elektronik (e)");
            System.out.println("Kesehatan (k)");
            System.out.println("Makanan (m)");
            String hasilInput2 = scanner.nextLine().trim();
            char pilihan = hasilInput2.isEmpty() ? ' ' : hasilInput2.charAt(0);
            while (pilihan != 'e' && pilihan != 'k' && pilihan != 'm') {
                System.out.println("ERROR: Pilihan tidak dikenali. Silakan masukkan 'e', 'k', atau 'm'.");
                hasilInput2 = scanner.nextLine().trim();
                pilihan = hasilInput2.isEmpty() ? ' ' : hasilInput2.charAt(0);
            }
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
            b7.tampilkanData();
            b8.tampilkanData();
            b9.tampilkanData();
            b10.tampilkanData();
        }
        System.out.println("Apakah anda ingin menambah atau mengurangi stok barang? (y/n)");
        String hasilInput3 = scanner.nextLine().trim();
        if (hasilInput3.equalsIgnoreCase("y")) {
            System.out.println("Ingin menambah atau mengurangi stok? (tambah/kurang)");
            String hasilInput4 = scanner.nextLine().trim();
            while (!hasilInput4.equalsIgnoreCase("tambah") && !hasilInput4.equalsIgnoreCase("kurang")) {
                System.out.println("ERROR: Pilihan tidak dikenali. Silakan masukkan 'tambah' atau 'kurang'.");
                hasilInput4 = scanner.nextLine().trim();
            }
            System.out.println("Masukkan nama barang:");
            String namaBarang = scanner.nextLine().trim();
            System.out.println("Masukkan jumlah stok:");

            if (!barangDitemukan) {
                System.out.println("ERROR: Barang dengan nama " + namaBarang + " tidak ditemukan.");
            }
        }  else {
            System.out.println("Terima kasih telah menggunakan aplikasi kami!");
        }



    }
}