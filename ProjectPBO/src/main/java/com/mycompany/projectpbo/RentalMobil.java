/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectpbo;

public class RentalMobil {

    String namaPenyewa;
    String merkMobil;
    String platMobil;
    int tarifMobil;
    int lamaSewaCustomer;

    public RentalMobil(String namaPenyewa, String merkMobil, String platMobil, int tarifMobil, int lamaSewaCustomer) {
        this.namaPenyewa = namaPenyewa;
        this.merkMobil = merkMobil;
        this.platMobil = platMobil;
        this.tarifMobil = tarifMobil;
        this.lamaSewaCustomer = lamaSewaCustomer;
    }

    public int hitungTotal() {
        return tarifMobil * lamaSewaCustomer;
    }

    public void cetakStrukSewa() {
        System.out.println("====== STRUK PEMBAYARAN RENTAL MOBIL ======");
        System.out.println("Nama Penyewa       : " + namaPenyewa);
        System.out.println("Merk Mobil         : " + merkMobil);
        System.out.println("Plat Mobil         : " + platMobil);
        System.out.println("Tarif Mobil        : Rp" + tarifMobil);
        System.out.println("Lama Sewa Customer : " + lamaSewaCustomer + " hari");
        System.out.println("Total Bayar        : Rp" + hitungTotal());
        System.out.println("=====================================");
        System.out.println("TERIMA KASIH SUDAH MENYEWA MOBIL KAMI");
        System.out.println("=====================================");
    }
}