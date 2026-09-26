/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectpbo;

/**
 *
 * @author Hype
 */
public class Mobil {

    protected String namaPenyewa;
    protected String merkMobil;
    protected String platMobil;
    protected int tarifPerHari;
    protected int lamaSewa;

    public Mobil(String namaPenyewa, String merkMobil, String platMobil,
                 int tarifPerHari, int lamaSewa) {

        this.namaPenyewa = namaPenyewa;
        this.merkMobil = merkMobil;
        this.platMobil = platMobil;
        this.tarifPerHari = tarifPerHari;
        this.lamaSewa = lamaSewa;
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

    void tampilkanData() {
    }
}
