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
public class Humano extends Mamifero{
    private String cadena_evolutiva;

    public Humano() {
    }

    public Humano(String cadena_evolutiva, 
                    String nombre_cientifico, 
                    String especie, 
                    String nombre_coloquial, 
                    String tipo) {
        super(nombre_cientifico, especie, nombre_coloquial, tipo);
        this.cadena_evolutiva = cadena_evolutiva;
    }

    /**
     * @return the cadena_evolutiva
     */
    public String getCadena_evolutiva() {
        return cadena_evolutiva;
    }

    /**
     * @param cadena_evolutiva the cadena_evolutiva to set
     */
    public void setCadena_evolutiva(String cadena_evolutiva) {
        this.cadena_evolutiva = cadena_evolutiva;
    }
    
    
}
