/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Gato {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gato other = (Gato) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    private String nombre;
    private String raza;
    private String tamaño;
   
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
    
    public String getNombre(){
        return this.nombre;
    }
    public String getRaza(){
        return this.raza;
    }
    public String getTamaño(){
        return this.tamaño; 
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRaza(String raza){
         this.raza = raza;
    }
    public void setTamaño(String tamaño){
        this.tamaño = tamaño;        
    }
    
    @Override
    public String toString(){
        return nombre+" "+raza+" "+tamaño;
    }
    
    
    
}
