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
   private int jariJari;

    public Lingkaran() {
    }

    public Lingkaran(int jariJari, String namaBangundatar) {
        super(namaBangundatar);
        this.jariJari = jariJari;
    }

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
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
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Menghitung Lingkaran");
        lingkaran.setNamaBangundatar("Lingkaran");
        lingkaran.setJariJari(5);
        System.out.println("Luas Lingkaran: "+lingkaran.luas());
        System.out.println("Keliling Lingkaran: "+lingkaran.keliling());
    }
}
