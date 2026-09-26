/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 */

package com.mycompany.projectpbo;

public class MobilDiesel extends Mobil {

    private double jumlahSolarAwal;
    private int totalBayar;

    public MobilDiesel(String namaPenyewa, String merkMobil,
            String platMobil, int tarifPerHari,
            int lamaSewa, double jumlahSolar) {

        super(namaPenyewa, merkMobil, platMobil, tarifPerHari, lamaSewa);

        this.jumlahSolarAwal = jumlahSolarAwal;
        this.totalBayar = lamaSewa * tarifPerHari;
    }

    public double getJumlahSolar() {
        return jumlahSolarAwal;
    }

    public void setJumlahSolar(double jumlahSolar) {
        this.jumlahSolarAwal = jumlahSolarAwal;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    public void tampilkanSolar() {
        System.out.println("Jumlah Solar : " + jumlahSolarAwal + " liter");
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        tampilkanSolar();
        System.out.println("Total Bayar : " + totalBayar);
    }
}