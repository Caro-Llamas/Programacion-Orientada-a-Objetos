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
public class Chancla {
    public String forma;
    public String color;
    public double peso;
    
    public Chancla(){
        this.forma = "";
        this.color = "";
        this.peso = 0.0;
    }
    
    public Chancla(String forma, String color, double peso){
        this.forma = forma;
        this.color = color;
        this.peso = peso;
    }
}
