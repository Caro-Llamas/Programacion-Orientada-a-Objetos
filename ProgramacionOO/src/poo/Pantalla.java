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
public class Pantalla {
    public String color; 
    public double peso;
    public String tamaño;
    
    public Pantalla(){
        this.color = "";
        this.peso = 0.0;
        this.tamaño = "";
    }
    
    public Pantalla(String color, double peso, String tamaño){
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
    }
}
