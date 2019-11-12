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
public class Perro {
    private String nombre;
    private double peso;
    private String raza;
    
    public Perro(){
        this.nombre = "";
        this.peso = 0.0;
        this.raza = "";
    }
    
    public Perro(String nombre, double peso, String raza){
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        
    }
    
     public String getNombre(){
        return this.nombre;
    }
    public String getRaza(){
        return this.raza;
    }
    public double getPeso(){
        return this.peso; 
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRaza(String raza){
         this.raza = raza;
    }
    public void setPeso(double peso){
        this.peso = peso;        
    }
}
