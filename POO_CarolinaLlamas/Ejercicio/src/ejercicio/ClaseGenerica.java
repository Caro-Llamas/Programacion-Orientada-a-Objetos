/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class ClaseGenerica<T> {
    T objt;

    public ClaseGenerica(T objt) {
        this.objt = objt;
    }
    
    public void classType(){
        System.out.println("El tipo de T es: " + objt.getClass().getName());
    }
    
        public static void main(String args[]){
            ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
            intObj.classType();
            
            ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
            strObj.classType();
            
            ArrayList<String> lista = new ArrayList<String>();
            lista.add("Holi");
            lista.add("Soy");
            lista.add("Caro");
            lista.add("Toy");
            lista.add("Triste");
            lista.add("F");
            lista.remove("Holi");
            
            Iterator<String> it = lista.iterator();
            while(it.hasNext()){
                String ele = it.next();
                System.out.println(ele + " ");
            }
            
            LinkedList<String> listaEn = new LinkedList<String>();
            listaEn.add("1");
            listaEn.addFirst("2");
            listaEn.add("3");
            listaEn.addLast("4");
            listaEn.remove("1");
            System.out.println("Lista enlazada: "+listaEn);
                    
        }   
}
