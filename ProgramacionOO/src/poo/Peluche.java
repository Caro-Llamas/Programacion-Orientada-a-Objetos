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
public class Peluche {
    //atributos
    public String relleno;
    public String nombre;
    public double precio;
    
    //métodos
    public Peluche(){
        this.relleno = "";
        this.nombre = "";
        this.precio = 0.0;
    }
    
    public Peluche(String relleno, String nombre, double precio){
        this.relleno = relleno;
        this.nombre = nombre;
        this.precio = precio;
        
    }
}
