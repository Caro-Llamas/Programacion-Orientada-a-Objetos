/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author usuario
 */
public class AdaptadorTeclasLetras implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        JButtonT aux = (JButtonT) e.getSource();
        String a = e.getKeyChar()+"";
        if(a.equals("1")){
            aux.setBackground(Color.red);
        }
        if(a.equals("2")){
            aux.setBackground(Color.red);
        }
        if(a.equals("3")){
            aux.setBackground(Color.red);
        }
        if(a.equals("4")){
            aux.setBackground(Color.red);
        }
        if(a.equals("5")){
            aux.setBackground(Color.red);
        }
        if(a.equals("6")){
            aux.setBackground(Color.red);
        }
        if(a.equals("7")){
            aux.setBackground(Color.red);
        }
        if(a.equals("8")){
            aux.setBackground(Color.red);
        }
        if(a.equals("9")){
            aux.setBackground(Color.red);
        }
        if(a.equals("0")){
            aux.setBackground(Color.red);
        }
        //System.out.println("KeyTyped "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        JButtonT aux = (JButtonT) e.getSource();
        String a = e.getKeyChar()+"";
        if(a.equals(aux.getText()+"")){
            aux.setBackground(Color.red);
        }
        System.out.println("KeyPressed "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JButtonT aux = (JButtonT) e.getSource();
         Color color = new Color(232, 139, 206);
         aux.setBackground(color);
    }
    
}
