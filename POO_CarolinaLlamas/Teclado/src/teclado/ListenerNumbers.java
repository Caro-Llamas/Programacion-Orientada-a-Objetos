/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_0;
import static java.awt.event.KeyEvent.VK_1;
import static java.awt.event.KeyEvent.VK_2;
import static java.awt.event.KeyEvent.VK_3;
import static java.awt.event.KeyEvent.VK_4;
import static java.awt.event.KeyEvent.VK_5;
import static java.awt.event.KeyEvent.VK_6;
import static java.awt.event.KeyEvent.VK_7;
import static java.awt.event.KeyEvent.VK_8;
import static java.awt.event.KeyEvent.VK_9;
import java.awt.event.KeyListener;

/**
 *
 * @author usuario
 */
public class ListenerNumbers implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        JButtonT aux = (JButtonT) e.getSource();
       if(e.getKeyCode()==VK_1){
           //if("2".equals(aux.getText())){
               aux.setBackground(Color.red);
           //}
       }else if(e.getKeyCode()==VK_2){
           aux.setBackground(Color.red);
       }
    }

    @Override
    public void keyPressed(KeyEvent e) {
       JButtonT aux = (JButtonT) e.getSource();
       ListenerAction num = new ListenerAction();
       if(e.getKeyCode()==VK_1){
            aux.addActionListener(num);
            aux.setBackground(Color.red);
       }else if(e.getKeyCode()==VK_2){
           aux.addActionListener(num);
           aux.setBackground(Color.red);
       }
       else if(e.getKeyCode()==VK_3){
           aux.setBackground(Color.red);
       }
       else if(e.getKeyCode()==VK_4){
           aux.setBackground(Color.red);
       }
       else if(e.getKeyCode()==VK_5){
           aux.setBackground(Color.red);
       }
       else if(e.getKeyCode()==VK_6){
           aux.setBackground(Color.red);
       }
       else if(e.getKeyCode()==VK_7){
           aux.setBackground(Color.red);
       }
       else if(e.getKeyCode()==VK_8){
           aux.setBackground(Color.red);
       }
       else if(e.getKeyCode()==VK_9){
           aux.setBackground(Color.red);
       }
       else if(e.getKeyCode()==VK_0){
           aux.setBackground(Color.red);
       }
       
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
         JButtonT aux = (JButtonT) e.getSource();
         Color color = new Color(232, 139, 206);
         aux.setBackground(color);
    }
    
    
}
