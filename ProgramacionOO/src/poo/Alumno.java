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
public class Alumno {
    public int boleta;
    public String nombre;
    public String contraseña;
    
    public Alumno(){
        this.boleta = 0;
        this.nombre = "";
        this.contraseña = "";    
    }
    
    public Alumno(int boleta, String nombre, String contraseña){
        this.boleta = boleta;
        this.nombre = nombre;
        this.contraseña = contraseña;
        
    }
}
