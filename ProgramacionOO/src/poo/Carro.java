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
public class Carro {
    public String color;
    public double peso;
    public double tamaño;
    
    public Carro(){
        this.color = "";
        this.peso = 0.0;
        this.tamaño = 0.0;
    }
    
    public Carro(String color, double peso, double tamaño){
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
    }
}
