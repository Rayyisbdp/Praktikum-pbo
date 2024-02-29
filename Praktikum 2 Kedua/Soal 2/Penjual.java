// Tugas Praktikum PBO Pertemua II LAB A
// Nama : Muhammad Rayyis Budi Prasetyo
// Nim : 24060122140112

public class Penjual {
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public Penjual(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getInfoPenjual() {
        return "Nama: " + nama + ", Alamat: " + alamat + ", Nomor Telepon: " + nomorTelepon;
    }
}