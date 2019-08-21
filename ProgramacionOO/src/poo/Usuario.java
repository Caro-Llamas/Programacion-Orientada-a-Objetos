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
    private String correo;
    private String contraseña;
    private String corre_recup;
    
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
    
    public String getCorreo(){
        return this.correo;
    }
    public String getContraseña(){
        return this.contraseña;
    }
    public String getCorreo_recup(){
        return this.corre_recup; 
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setContraseña(String contraseña){
         this.contraseña = contraseña;
    }
    public void setCorre_recup(String corre_recup){
        this.corre_recup = corre_recup;        
    }
}
