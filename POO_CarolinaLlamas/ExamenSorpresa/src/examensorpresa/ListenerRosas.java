/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensorpresa;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ListenerRosas implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonEx aux = (JButtonEx) e.getSource();
        
        if("Defecto".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo por defecto.", "Hola", JOptionPane.DEFAULT_OPTION);
        }
        if("Información".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo informativo.", "Hola", JOptionPane.INFORMATION_MESSAGE);
        }
        if("Advertencia".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo de advertencia.", "Hola", JOptionPane.WARNING_MESSAGE);
        }
        if("Error".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo de errores.", "Hola", JOptionPane.ERROR_MESSAGE);  
        }
        if("Pregunta".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo de pregunta.", "Hola", JOptionPane.QUESTION_MESSAGE);   
        }
        if("Nada".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo sin ícono.", "Hola", JOptionPane.PLAIN_MESSAGE);   
        }

    }
    
}
