package data;

public class Barang {
    // Atribut (field)
    private String nama;
    private double harga;
    private int stok;
    // Constructor untuk memberi nilai awal
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    // Method untuk menampilkan data barang
    public void tampilkanData() {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Stok        : " + stok);
        System.out.println("-----------------------------");
    }
}