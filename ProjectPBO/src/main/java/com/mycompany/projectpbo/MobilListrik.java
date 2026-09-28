package com.mycompany.projectpbo;

public class MobilListrik extends Mobil {

    private int kapasitasBaterai;
    private int totalBayar;

    public MobilListrik(String namaPenyewa, String merkMobil,
            String platMobil, int tarifPerHari, int lamaSewa,
            int kapasitasBaterai) {

        super(namaPenyewa, merkMobil, platMobil, tarifPerHari, lamaSewa);
        this.kapasitasBaterai = kapasitasBaterai;
        this.totalBayar = tarifPerHari * lamaSewa;
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    public void tampilkanBateraiAwal() {
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " kWh");
    }

    public void tampilkanTotalBayar() {
        System.out.println("Total Bayar : Rp" + totalBayar);
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        tampilkanBateraiAwal();
        tampilkanTotalBayar();
    }
}