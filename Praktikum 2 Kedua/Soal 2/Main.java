// Tugas Praktikum PBO Pertemua II LAB A
// Nama : Muhammad Rayyis Budi Prasetyo
// Nim : 24060122140112

public class Main {
    public static void main(String[] args) {
        Penjual penjual1 = new Penjual("Rayyis", "JL. Diponegoro", "08123456789");

        Produk produk1 = new Produk("HP", 2300000, 5, "HP baru dengan chipset tinggi", penjual1);

        System.out.println("Informasi Produk:");
        System.out.println("Nama: " + produk1.getNama());
        System.out.println("Harga: " + produk1.getHarga());
        System.out.println("Stok: " + produk1.getStok());
        System.out.println("Deskripsi: " + produk1.getDeskripsi());
        System.out.println("Informasi Penjual:");
        System.out.println("Nama Penjual: " + penjual1.getNama());
        System.out.println("Alamat Penjual: " + penjual1.getAlamat());
        System.out.println("Nomor Telepon Penjual: " + penjual1.getNomorTelepon());
    }
}