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
public class Planta {
    //atributos
    public double humedad;
    public double luz_recibida;
    public String tipo;
    
    //métodos
    public Planta(){
        this.humedad = 0.0;
        this.luz_recibida = 0.0;
        this.tipo = "";
    }
    
    public Planta(double humedad,
                  double luz, 
                  String tipo){
        this.humedad = humedad;
        this.luz_recibida = luz;
        this.tipo = tipo;
    }
}
