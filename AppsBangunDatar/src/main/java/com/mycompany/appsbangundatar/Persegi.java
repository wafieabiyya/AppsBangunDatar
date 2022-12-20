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
    }
    

    @Override
    double keliling() {
        return sisi*sisi;
    }
        
}
