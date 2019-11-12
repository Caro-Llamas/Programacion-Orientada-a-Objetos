/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class ListenerAction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonT aux = (JButtonT) e.getSource();
        
        if("1".equals(aux.getText())){
            aux.setSelected(true);
         
        }else if("2".equals(aux.getText())){
            aux.setSelected(true);
        }
    }
    
}
