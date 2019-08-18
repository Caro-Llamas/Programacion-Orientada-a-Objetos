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
public class Calculadora {
    public double precio;
    public double entrada;
    public double salida;
    
    public Calculadora(){
        this.entrada = 0.0;
        this.precio = 0.0;
        this.salida = 0.0;
    }
    
    public Calculadora(double precio, double entradas, double salida){
        this.entrada = entradas;
        this.precio = precio;
        this.salida = salida;
    }
}
