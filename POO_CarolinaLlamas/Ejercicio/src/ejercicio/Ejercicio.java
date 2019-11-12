/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author usuario
 */
public class Ejercicio {

    public int aux;
    static int cont;
    
    public static void main(String[] args) {
        Ejercicio e1 = new Ejercicio(10);
        Ejercicio e2 = new Ejercicio(4);
        Ejercicio e3 = new Ejercicio(4);
        Ejercicio e4 = new Ejercicio(4);
        Ejercicio e5 = new Ejercicio(4);
        
        System.out.println(cont);   
        
    }

    public Ejercicio(int aux) {
        this.aux = aux;
        cont++;
    }


    
    
    
}
