/**
 File :Poligon.java  12/03/2024
 Penulis : Muhammad Rayyis Budi Prasetyo / 24060122140112
 Deskripsi : driver class untuk poligon dan segitiga
 */

package org.bangundatar;

public class MPoligon {
    public static void main(String[] args) {
        // Contoh penggunaan class Segitiga
        Segitiga segitiga = new Segitiga(5, 8);
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Jumlah Sisi Segitiga: " + segitiga.getJumlahSisi());
    }
}