/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensorpresa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class ExamenSorpresa extends JFrame {
    
    public static void main(String[] args) {
       ExamenSorpresa ex = new ExamenSorpresa();
       ex.setVisible(true);
       ex.setSize(400, 1000);
    }
    
    public ExamenSorpresa() {
        inicializarComponentes();
        
    }
    
    public void inicializarComponentes(){
        JPanel botones = new JPanel(new GridLayout(6, 1));
        Dimension dim = new Dimension(10,10);
        
        JButtonEx def = new JButtonEx("Defecto", dim, Color.PINK);
        JButtonEx info = new JButtonEx("Información", dim, Color.PINK);
        JButtonEx war = new JButtonEx("Advertencia", dim, Color.PINK);
        JButtonEx error = new JButtonEx("Error", dim, Color.PINK);
        JButtonEx que = new JButtonEx("Pregunta", dim, Color.PINK);
        JButtonEx noIcon = new JButtonEx("Nada", dim, Color.PINK);
        
        botones.add(def);
        botones.add(info);
        botones.add(war);
        botones.add(error);
        botones.add(que);
        botones.add(noIcon);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        add(botones, BorderLayout.CENTER);
        
        ListenerRosas orejon = new ListenerRosas();
        def.addActionListener(orejon);
        info.addActionListener(orejon);
        war.addActionListener(orejon);
        error.addActionListener(orejon);
        que.addActionListener(orejon);
        noIcon.addActionListener(orejon);
    }
    
    
    
    
}
