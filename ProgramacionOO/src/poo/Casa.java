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
public class Casa {
    public int cuartos;
    public int pisos;
    public double tamaño;
    
    public Casa(){
        this.cuartos = 0;
        this.pisos = 0;
        this.tamaño = 0.0;
    }
    
    public Casa(int cuartos, int pisos, double tamaño){
        this.cuartos = cuartos;
        this.pisos = pisos;
        this.tamaño = tamaño;
    }
}
