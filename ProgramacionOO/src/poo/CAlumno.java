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
public class CAlumno {
    private
        int boleta;
        private String nombre;
        private boolean regular;
        private String carrera;
        private double promedioGral;

    public CAlumno() {
        
    }

    public CAlumno(int boleta, String nombre, boolean regular, String carrera, double promedioGral) {
        this.boleta = boleta;
        this.nombre = nombre;
        this.regular = regular;
        this.carrera = carrera;
        this.promedioGral = promedioGral;
    }

    /**
     * @return the boleta
     */
    public int getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(int boleta) {
        this.boleta = boleta;
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
     * @return the regular
     */
    public boolean isRegular() {
        return regular;
    }

    /**
     * @param regular the regular to set
     */
    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the promedioGral
     */
    public double getPromedioGral() {
        return promedioGral;
    }

    /**
     * @param promedioGral the promedioGral to set
     */
    public void setPromedioGral(double promedioGral) {
        this.promedioGral = promedioGral;
    }
    
       
    
}
