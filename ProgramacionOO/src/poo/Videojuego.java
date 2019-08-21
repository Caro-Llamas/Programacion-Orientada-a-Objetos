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
public class Videojuego {
    private double controles;
    private int niveles;
    private String personaje;
    
    public Videojuego(){
        this.controles = 0.0;
        this.niveles = 0;
        this.personaje = "";
    }
    
    public Videojuego(double controles, int niveles, String personaje){
        this.controles = controles;
        this.niveles = niveles;
        this.personaje = personaje;
    }
    
    public double getControles(){
        return this.controles;
    }
    public int getNiveles(){
        return this.niveles;
    }
    public String getPersonaje(){
        return this.personaje; 
    }
    
    public void setControles(double controles){
        this.controles = controles;
    }
    public void setNiveles(int niveles){
         this.niveles = niveles;
    }
    public void setPersonaje(String personaje){
        this.personaje = personaje;        
    }
}
