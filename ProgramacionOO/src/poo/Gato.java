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
public class Gato {
    public String nombre;
    public String raza;
    public String tamaño;
   
    //Métodos
    public Gato(){
        this.nombre = "";
        this.raza = "";
        this.tamaño = "";
    }
    
    public Gato(String nombre, String raza, String tamaño){
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
    }
}
