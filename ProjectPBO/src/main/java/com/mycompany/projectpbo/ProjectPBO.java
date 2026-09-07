/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectpbo;

import java.util.Scanner;

public class ProjectPBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== STRUK PEMBAYARAN RENTAL MOBIL =====");

        System.out.print("Masukkan Nama Penyewa       : ");
        String namaPenyewa = input.nextLine();

        System.out.print("Masukkan Merk Mobil         : ");
        String merkMobil = input.nextLine();

        System.out.print("Masukkan Plat Mobil         : ");
        String platMobil = input.nextLine();

        System.out.print("Masukkan Tarif Mobil        : ");
        int tarifMobil = input.nextInt();

        System.out.print("Masukkan Lama Sewa Customer : ");
        int lamaSewaCustomer = input.nextInt();

        RentalMobil sewaMobil1 = new RentalMobil(
                namaPenyewa,
                merkMobil,
                platMobil,
                tarifMobil,
                lamaSewaCustomer
        );

        System.out.println();
        sewaMobil1.cetakStrukSewa();
        input.close();
    }
}