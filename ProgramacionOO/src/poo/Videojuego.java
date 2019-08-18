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
    public double controles;
    public int niveles;
    public String personaje;
    
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
}
