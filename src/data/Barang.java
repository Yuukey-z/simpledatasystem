package data;

public class Barang {
    // Atribut (field)
    private String namaBarang;
    private double hargaBarang;
    private int stokBarang;
    private String merkBarang;
    private double beratBarang;
    // Constructor untuk memberi nilai awal
    public Barang(String namaBarang, double hargaBarang, int stokBarang, String merkBarang, double beratBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.stokBarang = stokBarang;
        this.merkBarang = merkBarang;
        this.beratBarang = beratBarang;
    }
    // Method untuk menampilkan data barang
    public void tampilkanData() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga       : Rp" + hargaBarang);
        System.out.println("Stok        : " + stokBarang);
        System.out.println("Merek Barang: " + merkBarang);
        System.out.println("Berat       : " + beratBarang +"g");
        System.out.println("Total Harga : Rp" + hitungTotalHarga());
        System.out.println("-----------------------------");
    }

    // Menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stokBarang += jumlah;
            System.out.println("Stok berhasil ditambah. Stok terbaru: " + stokBarang);
        } else {
            System.out.println("ERROR: jumlah harus lebih dari 0!");
        }
    }

    // Mengurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= stokBarang) {
            stokBarang -= jumlah;
            System.out.println("Stok berhasil dikurangi. Sisa stok: " + stokBarang);
        } else if (jumlah > stokBarang) {
            System.out.println("ERROR: Stok tidak cukup!");
        } else {
            System.out.println("ERROR: jumlah harus lebih dari 0!");
        }
    }

    // Menghitung total harga berdasarkan stok
    public double hitungTotalHarga() {
        return hargaBarang * stokBarang;
    }
}

//copyright yuukey-z 2025