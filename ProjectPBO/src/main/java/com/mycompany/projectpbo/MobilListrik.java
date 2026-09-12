/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectpbo;

public class MobilListrik {

    private String namaPenyewa;
    private String merkMobil;
    private String platMobil;
    private int tarifPerHari;
    private int lamaSewa;
    private double kapasitasBaterai;

    public MobilListrik() {
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

    public double getKapasitasBaterai() {
        return kapasitasBaterai;
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

    public void setKapasitasBaterai(float kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int hitungTotal() {
        return tarifPerHari * lamaSewa;
    }

    public void tampilkanData() {

        System.out.println("\n======================================");
        System.out.println("       DATA RENTAL MOBIL LISTRIK");
        System.out.println("======================================");
        System.out.println("Nama Penyewa      : " + namaPenyewa);
        System.out.println("Merk Mobil        : " + merkMobil);
        System.out.println("Plat Mobil        : " + platMobil);
        System.out.println("Tarif Per Hari    : Rp " + tarifPerHari);
        System.out.println("Lama Sewa         : " + lamaSewa + " Hari");
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " kWh");
        System.out.println("Total Biaya       : Rp " + hitungTotal());
    }
}