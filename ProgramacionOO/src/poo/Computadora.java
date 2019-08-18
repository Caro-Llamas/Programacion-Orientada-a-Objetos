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
public class Computadora {
    public double precio;
    public int num_componentes;
    public int num_puertos;
    
    public Computadora(){
        this.precio = 0.0;
        this.num_componentes = 0;
        this.num_puertos = 0;
    }
    
    public Computadora(double precio, int componentes, int puertos){
        this.precio = precio;
        this.num_componentes = componentes;
        this.num_puertos = puertos;
    }
}
