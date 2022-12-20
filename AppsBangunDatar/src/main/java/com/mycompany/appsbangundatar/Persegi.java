/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsbangundatar;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Persegi extends BangunDatar {

    private double sisi;

    public Persegi() {
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    
    @Override
    double luas() {
        return sisi*sisi;
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    double keliling() {
        return sisi*sisi;
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        
        Persegi persegi = new Persegi();
        double sis;
        
        System.out.println("Masukan Sisi: ");
        sis = sc.nextDouble();
        
        persegi.setSisi(sis);
        persegi.setNamaBangundatar("persegi");
        
        System.out.println("luas: "+persegi.luas());
        System.out.println("keliling: "+persegi.keliling());
       
    }
}
