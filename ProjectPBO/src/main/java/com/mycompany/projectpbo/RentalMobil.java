/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectpbo;

import java.util.Scanner;

public class RentalMobil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MobilListrik mobilListrik1 = new MobilListrik();
        MobilDiesel mobilDiesel1 = new MobilDiesel();

        System.out.println("======================================");
        System.out.println("           RENTAL MOBIL LUNA");
        System.out.println("======================================");

        System.out.println("Pilih Jenis Mobil Anda:");
        System.out.println("1. Mobil Listrik");
        System.out.println("2. Mobil Diesel");
        System.out.println("======================================");

        System.out.print("Klik pilihan Anda : ");
        int pilihan = input.nextInt();

        input.nextLine();

        if (pilihan == 1) {

            System.out.println("===== DATA MOBIL LISTRIK =====");

            System.out.print("Nama Penyewa      : ");
            mobilListrik1.setNamaPenyewa(input.nextLine());

            System.out.print("Merk Mobil        : ");
            mobilListrik1.setMerkMobil(input.nextLine());

            System.out.print("Plat Mobil        : ");
            mobilListrik1.setPlatMobil(input.nextLine());

            System.out.print("Tarif Per Hari    : Rp ");
            mobilListrik1.setTarifPerHari(input.nextInt());

            System.out.print("Lama Sewa         : ");
            mobilListrik1.setLamaSewa(input.nextInt());

            System.out.print("Kapasitas Baterai : ");
            mobilListrik1.setKapasitasBaterai(input.nextFloat());

            mobilListrik1.tampilkanData();

        } else if (pilihan == 2) {

            System.out.println("===== DATA MOBIL DIESEL =====");

            System.out.print("Nama Penyewa   : ");
            mobilDiesel1.setNamaPenyewa(input.nextLine());

            System.out.print("Merk Mobil     : ");
            mobilDiesel1.setMerkMobil(input.nextLine());

            System.out.print("Plat Mobil     : ");
            mobilDiesel1.setPlatMobil(input.nextLine());

            System.out.print("Tarif Per Hari : Rp ");
            mobilDiesel1.setTarifPerHari(input.nextInt());

            System.out.print("Lama Sewa      : ");
            mobilDiesel1.setLamaSewa(input.nextInt());

            System.out.print("Jumlah Solar   : ");
            mobilDiesel1.setJumlahSolar(input.nextDouble());

            mobilDiesel1.tampilkanData();

        } else {

            System.out.println("Pilihan tidak tersedia!");

        }

        input.close();
    }
}