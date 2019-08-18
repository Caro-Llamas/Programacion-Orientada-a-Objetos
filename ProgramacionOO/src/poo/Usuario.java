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
public class Usuario {
    public String correo;
    public String contraseña;
    public String corre_recup;
    
     public Usuario(){
        this.correo = "";
        this.contraseña = "";
        this.corre_recup = "";
        
    }
    
    public Usuario(String correo, String contraseña, String correo_recup){
        this.correo = correo;
        this.contraseña = contraseña;
        this.corre_recup = correo_recup;
        
    }
}
