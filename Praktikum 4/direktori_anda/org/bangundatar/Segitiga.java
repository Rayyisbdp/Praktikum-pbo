/**
 File :Poligon.java  12/03/2024
 Penulis : Muhammad Rayyis Budi Prasetyo / 24060122140112
 Deskripsi : representasi dasar dari segitiga, turunan kelas poligon
 */

package org.bangundatar;

public class Segitiga extends Poligon {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        super(3); // Segitiga memiliki 3 sisi
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        // Untuk segitiga, keliling bisa dihitung berdasarkan panjang sisi-sisinya
        // Namun, karena belum disebutkan metode ini, di sini hanya return 0
        return 0;
    }
}