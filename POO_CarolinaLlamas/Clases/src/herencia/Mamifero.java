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
public class Mamifero extends Ser_vivo {
    private String tipo;

    public Mamifero() {
    }

    public Mamifero(String tipo, String nombre_cientifico, String especie, String nombre_coloquial) {
        super(nombre_cientifico, especie ,nombre_coloquial);
        this.tipo = tipo;
        
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
