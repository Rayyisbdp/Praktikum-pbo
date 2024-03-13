/**
 File :Poligon.java  12/03/2024
 Penulis : Muhammad Rayyis Budi Prasetyo / 24060122140112
 Deskripsi : representasi dasar dari objek poligon (segi banyak)
 */

package org.bangundatar;

public class Poligon {
    protected int jumlahSisi;

    public Poligon(int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi() {
        return jumlahSisi;
    }
}