/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.appsbangundatar;

/**
 *
 * @author lenovo
 */
abstract class BangunDatar {
    private String namaBangundatar;

    public BangunDatar() {
    }

    public BangunDatar(String namaBangundatar) {
        this.namaBangundatar = namaBangundatar;
    }

    public String getNamaBangundatar() {
        return namaBangundatar;
    }

    public void setNamaBangundatar(String namaBangundatar) {
        this.namaBangundatar = namaBangundatar;
    }
    
    abstract double luas();
    abstract double keliling();
}
