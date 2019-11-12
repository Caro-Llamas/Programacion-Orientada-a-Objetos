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
    private int boleta;
    private String nombre;
    private String contraseña;
    
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
    
    public int getBoleta(){
        return this.boleta;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getContraseña(){
        return this.contraseña;
    }
    
    public void setBoleta(int boleta){
        this.boleta = boleta;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
}
