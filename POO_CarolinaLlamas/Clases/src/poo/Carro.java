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
    private String color;
    private double peso;
    private double tamaño;
    
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
    
    public String getColor(){
        return this.color;
    }
    public double getTamaño(){
        return this.tamaño;
    }
    public double getPeso(){
        return this.peso; 
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public void setTamaño(double tamaño){
         this.tamaño = tamaño;
    }
    public void setPeso(double peso){
        this.peso = peso;        
    }
}
