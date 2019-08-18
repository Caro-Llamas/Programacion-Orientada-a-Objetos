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
public class Banda {
    public int miembros;
    public String canciones;
    public String nombre;
    
    public Banda(){
        this.miembros = 0;
        this.canciones = "";
        this.nombre = "";
    }
    
    public Banda(int miembros, String canciones, String nombre){
        this.miembros = miembros;
        this.canciones = canciones;
        this.nombre = nombre;
    }
    
}
