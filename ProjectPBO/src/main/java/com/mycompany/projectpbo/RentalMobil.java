/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectpbo;

import java.util.Scanner;

public class RentalMobil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("              RENTAL MOBIL LUNA              ");
        System.out.println("=============================================");

        System.out.println();
        System.out.println("Pilih Jenis Mobil Rental:");
        System.out.println("1. Mobil Listrik");
        System.out.println("2. Mobil Diesel");
        System.out.println("===========================================");

        System.out.print("Klik Mobil pilihan Anda : ");
        int pilihan = input.nextInt();

        input.nextLine();

        System.out.print("Nama Penyewa : ");
        String namaPenyewa = input.nextLine();

        System.out.print("Merk Mobil : ");
        String merkMobil = input.nextLine();

        System.out.print("Plat Mobil : ");
        String platMobil = input.nextLine();

        System.out.print("Tarif Per Hari : ");
        int tarifPerHari = input.nextInt();

        System.out.print("Lama Sewa Mobil : ");
        int lamaSewa = input.nextInt();

        if (pilihan == 1) {

            System.out.print("Kapasitas Baterai : ");
            int kapasitasBaterai = input.nextInt();

            MobilListrik mobilListrik1 = new MobilListrik(
                    namaPenyewa,
                    merkMobil,
                    platMobil,
                    tarifPerHari,
                    lamaSewa,
                    kapasitasBaterai
            );

            System.out.println();
            mobilListrik1.tampilkanData();

        } else if (pilihan == 2) {

            System.out.print("Jumlah Solar : ");
            double jumlahSolar = input.nextDouble();

            MobilDiesel mobilDiesel1 = new MobilDiesel(
                    namaPenyewa,
                    merkMobil,
                    platMobil,
                    tarifPerHari,
                    lamaSewa,
                    jumlahSolar
            );

            System.out.println();
            mobilDiesel1.tampilkanData();

        } else {
            System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}