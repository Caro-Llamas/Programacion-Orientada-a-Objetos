/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

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
    
    //public class MainClass{
        public static void main(String args[]){
            ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
            intObj.classType();
            
            ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
            strObj.classType();
            
        }
    //}
}
