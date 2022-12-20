/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsbangundatar;

/**
 *
 * @author lenovo
 */
public class Lingkaran extends BangunDatar{
   static final double PHI = 3.14;
   private double jariJari;

    public Lingkaran() {
    }

    public Lingkaran(double jariJari, String namaBangundatar) {
        super(namaBangundatar);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
   
   
    @Override
    double luas() {
        return PHI*jariJari*jariJari;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    double keliling() {
        return 2*PHI*jariJari;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
