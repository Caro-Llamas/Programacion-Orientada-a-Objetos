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
    public String nombre;
    public double peso;
    public String raza;
    
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
}
