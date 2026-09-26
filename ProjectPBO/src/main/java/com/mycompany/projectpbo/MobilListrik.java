/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectpbo;

public class MobilListrik extends Mobil {

    private int kapasitasBaterai;

    public MobilListrik(String namaPenyewa, String merkMobil,
            String platMobil, int tarifPerHari, int lamaSewa,
            int kapasitasBaterai) {

        super(namaPenyewa, merkMobil, platMobil, tarifPerHari, lamaSewa);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public void tampilkanBaterai() {
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " kWh");
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        tampilkanBaterai();
    }
}