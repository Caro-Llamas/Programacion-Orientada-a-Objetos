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
    private double humedad;
    private double luz_recibida;
    private String tipo;
    
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
    
     public double getHumedad(){
        return this.humedad;
    }
    public double getLuz_recibida(){
        return this.luz_recibida;
    }
    public String getTipo(){
        return this.tipo; 
    }
    
    public void setHumedad(double humedad){
        this.humedad = humedad;
    }
    public void setLuz_recibida(double luz_recibida){
         this.luz_recibida = luz_recibida;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;        
    }
}
