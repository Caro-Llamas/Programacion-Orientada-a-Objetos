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
public class Botella {
    public String color;
    public double altura;
    public double capacidad;
    
    public Botella(){
        this.color = "";
        this.altura = 0.0;
        this.capacidad = 0.0;
    }
    
    public Botella(String color, double altura, double capacidad){
        this.color = color;
        this.altura = altura;
        this.capacidad = capacidad;
    }
}
