// Tugas Praktikum PBO Pertemua II LAB A
// Nama : Muhammad Rayyis Budi Prasetyo
// Nim : 24060122140112

class Kubus {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}
