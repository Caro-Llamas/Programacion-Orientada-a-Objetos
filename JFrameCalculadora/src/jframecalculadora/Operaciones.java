/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframecalculadora;

/**
 *
 * @author usuario
 */
public class Operaciones {
    private float operando1;
    private float operando2;
    private float resultado;
    
    public float getSuma(float op1, float op2){
        op1 = operando1;
        op2 = operando2;
        this.resultado = op1 + op2;
        return (this.resultado);
    }
    
    public float getResta(float op1, float op2){
        op1 = operando1;
        op2 = operando2;
        this.resultado = op1 - op2;
        return (this.resultado);
    }
    
    public float getMulti(float op1, float op2){
        op1 = operando1;
        op2 = operando2;
        this.resultado = op1 * op2;
        return (this.resultado);
    }
    
    public float getDiv(float op1, float op2){
        op1 = operando1;
        op2 = operando2;
        
        if(op2 == 0){
            return(0);
        }
        else{
            this.resultado = op1 / op2;
            return (this.resultado);
        }
        
    }
    
}
