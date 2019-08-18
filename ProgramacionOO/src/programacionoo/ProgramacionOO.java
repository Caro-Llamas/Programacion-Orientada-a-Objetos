/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionoo;

import poo.Persona;

/**
 *
 * @author usuario
 */
public class ProgramacionOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona caro = new Persona("Carolina Llamas",
                                   19, 1.6, 70.2,
                                   "Femenino"); //New se refiere a un nuevo objeto 
        /*Ctrl + shift + down/up permite duplicar la línea  
        //Los breakpoint se ponen en especifico donde se necesita detener el código*/
        caro.nombre = "Carola";
        
        System.out.println("Hey");
        
 
                
    }
    
}
