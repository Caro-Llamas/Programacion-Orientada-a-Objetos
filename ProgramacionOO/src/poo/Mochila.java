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
public class Mochila {
    public String color;
    public double tamaño;
    public double peso;
    
    public Mochila(){
        this.color = "";
        this.tamaño = 0.0;
        this.peso = 0.0;
    }
    
    public Mochila(String color, double tamaño, double peso){
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
    }
    
}
