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
public class Animal extends Mamifero{
    private String Nivel_de_int;

    public Animal() {
    }

    public Animal(String Nivel_de_int, 
                    String nombre_cientifico, 
                    String especie, 
                    String nombre_coloquial, 
                    String tipo) {
        super(nombre_cientifico, especie, nombre_coloquial, tipo);
        this.Nivel_de_int = Nivel_de_int;
    }

    /**
     * @return the Nivel_de_int
     */
    public String getNivel_de_int() {
        return Nivel_de_int;
    }

    /**
     * @param Nivel_de_int the Nivel_de_int to set
     */
    public void setNivel_de_int(String Nivel_de_int) {
        this.Nivel_de_int = Nivel_de_int;
    }
    
    
}
