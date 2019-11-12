/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author usuario
 */
public class Ser_vivo {
    private String nombre_cientifico;
    private String especie;
    private String nombre_coloquial;

    public Ser_vivo() {
        this.nombre_cientifico = "S/N";
        this.especie = "S/E";
        this.nombre_coloquial = "S/N";
    }

    public Ser_vivo(String nombre_cientifico, String especie, String nombre_coloquial) {
        this.nombre_cientifico = nombre_cientifico;
        this.especie = especie;
        this.nombre_coloquial = nombre_coloquial;
    }

    /**
     * @return the nombre_cientifico
     */
    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    /**
     * @param nombre_cientifico the nombre_cientifico to set
     */
    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the nombre_coloquial
     */
    public String getNombre_coloquial() {
        return nombre_coloquial;
    }

    /**
     * @param nombre_coloquial the nombre_coloquial to set
     */
    public void setNombre_coloquial(String nombre_coloquial) {
        this.nombre_coloquial = nombre_coloquial;
    }
    
    
}
