/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectpbo;

public class MobilDiesel {

    private String namaPenyewa;
    private String merkMobil;
    private String platMobil;
    private int tarifPerHari;
    private int lamaSewa;
    private double jumlahSolar;

    public MobilDiesel() {
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public String getPlatMobil() {
        return platMobil;
    }

    public int getTarifPerHari() {
        return tarifPerHari;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public double getJumlahSolar() {
        return jumlahSolar;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public void setPlatMobil(String platMobil) {
        this.platMobil = platMobil;
    }

    public void setTarifPerHari(int tarifPerHari) {
        this.tarifPerHari = tarifPerHari;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public void setJumlahSolar(double jumlahSolar) {
        this.jumlahSolar = jumlahSolar;
    }

    public int hitungTotal() {
        return tarifPerHari * lamaSewa;
    }

    public void tampilkanData() {

        System.out.println("======================================");
        System.out.println("        DATA RENTAL MOBIL DIESEL");
        System.out.println("======================================");
        System.out.println("Nama Penyewa   : " + namaPenyewa);
        System.out.println("Merk Mobil     : " + merkMobil);
        System.out.println("Plat Mobil     : " + platMobil);
        System.out.println("Tarif Per Hari : Rp " + tarifPerHari);
        System.out.println("Lama Sewa      : " + lamaSewa + " Hari");
        System.out.println("Jumlah Solar   : " + jumlahSolar + " Liter");
        System.out.println("Total Biaya    : Rp " + hitungTotal());
    }
}