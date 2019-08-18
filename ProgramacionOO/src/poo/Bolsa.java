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
public class Bolsa {
    public String tamaño;
    public String forma;
    public String color;
    
    public Bolsa(){
        this.tamaño = "";
        this.forma = "";
        this.color = "";
    }
    
    public Bolsa(String tamaño, String forma, String color){
        this.tamaño = tamaño;
        this.forma = forma;
        this.color = color;
    }
}
