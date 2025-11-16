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
        System.out.println("-----------------------------");
    }
}