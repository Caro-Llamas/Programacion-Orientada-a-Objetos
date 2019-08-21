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
public class Escuela {
    private
        double tamaño;
        private String nombre;
        private String direccion;
        private String unidad;
        private double presupuesto;

    public Escuela() {
        this.tamaño = 0.0;
        this.nombre = null;
        this.direccion = null;
        this.unidad = null;
        this.presupuesto = 0.0;
    }

    public Escuela(double tamaño, String nombre, String direccion, String unidad, double presupuesto) {
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.direccion = direccion;
        this.unidad = unidad;
        this.presupuesto = presupuesto;
    }

    /**
     * @return the tamaño
     */
    public double getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the unidad
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    /**
     * @return the presupuesto
     */
    public double getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    
}
