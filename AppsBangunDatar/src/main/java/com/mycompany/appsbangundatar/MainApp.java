/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsbangundatar;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class MainApp {
    static Scanner sc = new Scanner (System.in);
    static String namaBangun;
    static double varSatu;
    static double varDua;
    static double varTiga;
    
    public static void main(String[] args) {
        
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();
        
        System.out.println("Menghitung Bangun Datar Lingkaran");
        
        System.out.print("Masukan Nama Bangun:");
        namaBangun = sc.nextLine();
        lingkaran.setNamaBangundatar(namaBangun);
        
        System.out.print("Masukan Jari jari:");
        varSatu = sc.nextDouble();
        lingkaran.setJariJari(varSatu);
        
        System.out.println("Luas Lingkaran: "+lingkaran.luas());
        System.out.println("Keliling Lingkaran: "+lingkaran.keliling());
        System.out.println("");
        
        System.out.print("Masukan Nama Bangun:");
        namaBangun = sc.next();
        persegi.setNamaBangundatar(namaBangun);
        
        System.out.print("Masukan Sisi:");
        varSatu = sc.nextDouble();
        persegi.setSisi(varSatu);
        
        System.out.println("Luas Persegi: "+persegi.luas());
        System.out.println("Keliling Persegi: "+persegi.keliling());
        System.out.println("");
        
//        System.out.print("Masukan Nama Bangun:");
//        namaBangun = sc.nextLine();
//        persegiPanjang.setNamaBangundatar(namaBangun);
//        System.out.print("Masukan Jari jari:");
//        varSatu = sc.nextDouble();
//        persegiPanjang.set(varSatu);
//        
//        System.out.println("");
//        
//        System.out.print("Masukan Nama Bangun:");
//        namaBangun = sc.nextLine();
//        lingkaran.setNamaBangundatar(namaBangun);
//        System.out.print("Masukan Jari jari:");
//        varSatu = sc.nextDouble();
//        lingkaran.setJariJari(varSatu);
    }
}
