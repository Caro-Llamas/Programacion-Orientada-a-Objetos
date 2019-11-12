/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensorpresa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author usuario
 */
public class JButtonEx extends JButton {
    
    public JButtonEx(String etiqueta, Dimension dim, Color color){
        super(etiqueta);
        setSize(dim);
        
        Font aux = getFont();
        String fuente = aux.getName();
        int estilo = aux.getStyle();
        Font aux2 = new Font(fuente, estilo, 20);
        setFont (aux2);
 
        //Color
        setBackground(color);
    }
    
}
