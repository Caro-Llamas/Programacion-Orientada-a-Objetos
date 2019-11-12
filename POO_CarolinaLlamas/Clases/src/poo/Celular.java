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
public class Celular {
    private
            String tamaño;
            private double peso;
            private double resolucion;
            private String color;
            private int camara;

    public Celular() {
        this.tamaño = "";
        this.peso = 0.0;
        this.resolucion = 0.0;
        this.color = "";
        this.camara = 0;
    }

    public Celular(String tamaño, double peso, double resolucion, String color, int camara) {
        this.tamaño = tamaño;
        this.peso = peso;
        this.resolucion = resolucion;
        this.color = color;
        this.camara = camara;
    }

    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the resolucion
     */
    public double getResolucion() {
        return resolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the camara
     */
    public int getCamara() {
        return camara;
    }

    /**
     * @param camara the camara to set
     */
    public void setCamara(int camara) {
        this.camara = camara;
    }
            
    
}
