class Kendaraan {
    void jalan() {
        System.out.println("Kendaraan sedang berjalan...");
    }
}

class Mobil extends Kendaraan {
    @Override
    void jalan() {
        System.out.println("Mobil melaju di jalan raya...");
    }
}

class Motor extends Kendaraan {
    @Override
    void jalan() {
        System.out.println("Motor melaju di jalur sebelah kiri...");
    }
}

public class Main {
    public static void main (String[]args) {
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Motor();

        k1.jalan();
        k2.jalan();
    }
}