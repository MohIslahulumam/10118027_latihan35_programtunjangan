/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10118027_if.pkg1_latihan35_perogmramtunjangan;

import java.util.Scanner;

/**
 *
 * @author RYZEN
 */
public class Main {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Penggajian Gaji= new Penggajian();
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda per bulan?\t: Rp. ");
        Gaji.gajiPokok= masuk.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        Gaji.status = masuk.next();

        Gaji.hasilHitung(Gaji.status, Gaji.gajiPokok);
    }

}
