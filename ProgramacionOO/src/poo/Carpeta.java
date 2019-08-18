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
public class Carpeta {
    public String color;
    public String forma;
    public double peso;
    
    public Carpeta(){
        this.color = "";
        this.forma = "";
        this.peso = 0.0;
    }
    
    public Carpeta(String color, String forma, double peso){
        this.color = color;
        this.forma = forma;
        this.peso = peso;
    }
}
