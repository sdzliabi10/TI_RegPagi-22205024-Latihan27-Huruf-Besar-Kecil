/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Scanner;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini untuk menampilkan formatting huruf besar dan kecil
 */
public class TI_RegPagi_22205024_Latihan27_Huruf_Besar_Kecil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat :");
        String masukkalimat = scanner.nextLine();
        System.out.println("====Hasil Formatting====");
        
        System.out.println("Huruf Besar: " +masukkalimat.toUpperCase());
        System.out.println("Huruf Kecil: " +masukkalimat.toLowerCase());
       
    }
    
}
