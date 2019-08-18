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
public class Libro {
    public int paginas;
    public double peso;
    public String genero;
    
    public Libro(){
        this.paginas = 0;
        this.peso = 0.0;
        this.genero = "";
    }
    
    public Libro(int paginas, double peso, String genero){
        this.paginas = paginas;
        this.peso = peso;
        this.genero = genero;
    }
}
