/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author usuario
 */
public class Lapicera {
    public String color;
    public String tamaño;
    public String marca;
    
    public Lapicera(){
        this.color = "";
        this.tamaño = "";
        this.marca = "";
    }
    
    public Lapicera(String color, String tamaño, String marca){
        this.color = color;
        this.tamaño = tamaño;
        this.marca = marca;
    }
}

