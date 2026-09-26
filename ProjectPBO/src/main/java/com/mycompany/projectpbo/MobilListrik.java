/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectpbo;

public class MobilListrik extends Mobil {

    private int bateraiAwal;

    public MobilListrik(String namaPenyewa, String merkMobil,
            String platMobil, int tarifPerHari, int lamaSewa,
            int kapasitasBaterai) {

        super(namaPenyewa, merkMobil, platMobil, tarifPerHari, lamaSewa);
        this.bateraiAwal = bateraiAwal;
    }

    public int getBateraiAwal() {
        return bateraiAwal;
    }

    public void setBateraiAwal(int BateraiAwal) {
        this.bateraiAwal = bateraiAwal;
    }

    public void tampilkanBateraiAwal() {
        System.out.println("Kapasitas Baterai : " + bateraiAwal+ " kWh");
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        tampilkanBateraiAwal();
    }
}