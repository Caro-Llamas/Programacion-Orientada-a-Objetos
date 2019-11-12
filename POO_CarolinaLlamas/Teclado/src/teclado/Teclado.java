/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Teclado extends JFrame{

    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        teclado.setSize(1000, 400);
        teclado.setVisible(true);
       
    }

    public Teclado() {
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        JPanel keyboard = new JPanel(new GridLayout(4,10));
        Dimension dim = new Dimension(10,10);
        Color color = new Color(232, 139, 206);
        //presionado 196, 139, 139
        
        //Nnumbers
        JButtonT one = new JButtonT("1", dim, color);
        JButtonT two = new JButtonT("2", dim, color);
        JButtonT three = new JButtonT("3", dim, color);
        JButtonT four = new JButtonT("4", dim, color);
        JButtonT five = new JButtonT("5", dim, color);
        JButtonT six = new JButtonT("6", dim, color);
        JButtonT seven = new JButtonT("7", dim, color);
        JButtonT eight = new JButtonT("8", dim, color);
        JButtonT nine = new JButtonT("9", dim, color);
        JButtonT zero = new JButtonT("0", dim, color);
        
        //Letters
        JButtonT q = new JButtonT("Q", dim, color);
        JButtonT w = new JButtonT("W", dim, color);
        JButtonT e = new JButtonT("E", dim, color);
        JButtonT r = new JButtonT("R", dim, color);
        JButtonT t = new JButtonT("T", dim, color);
        JButtonT y = new JButtonT("Y", dim, color);
        JButtonT u = new JButtonT("U", dim, color);
        JButtonT i = new JButtonT("I", dim, color);
        JButtonT o = new JButtonT("O", dim, color);
        JButtonT p = new JButtonT("P", dim, color);
        
        JButtonT a = new JButtonT("A", dim, color);
        JButtonT s = new JButtonT("S", dim, color);
        JButtonT d = new JButtonT("D", dim, color);
        JButtonT f = new JButtonT("F", dim, color);
        JButtonT g = new JButtonT("G", dim, color);
        JButtonT h = new JButtonT("H", dim, color);
        JButtonT j = new JButtonT("J", dim, color);
        JButtonT k = new JButtonT("K", dim, color);
        JButtonT up = new JButtonT("^", dim, color);
        JButtonT l = new JButtonT("L", dim, color);
        
        JButtonT z = new JButtonT("Z", dim, color);
        JButtonT x = new JButtonT("X", dim, color);
        JButtonT c = new JButtonT("C", dim, color);
        JButtonT v = new JButtonT("V", dim, color);
        JButtonT b = new JButtonT("B", dim, color);
        JButtonT n = new JButtonT("N", dim, color);
        JButtonT m = new JButtonT("M", dim, color);
        JButtonT left = new JButtonT("<", dim, color);
        JButtonT down = new JButtonT("v", dim, color);
        JButtonT right = new JButtonT(">", dim, color);
        
        keyboard.add(one);
        keyboard.add(two);
        keyboard.add(three);
        keyboard.add(four);
        keyboard.add(five);
        keyboard.add(six);
        keyboard.add(seven);
        keyboard.add(eight);
        keyboard.add(nine);
        keyboard.add(zero);
        
        keyboard.add(q);
        keyboard.add(w);
        keyboard.add(e);
        keyboard.add(r);
        keyboard.add(t);
        keyboard.add(y);
        keyboard.add(u);
        keyboard.add(i);
        keyboard.add(o);
        keyboard.add(p);
        
        keyboard.add(a);
        keyboard.add(s);
        keyboard.add(d);
        keyboard.add(f);
        keyboard.add(g);
        keyboard.add(h);
        keyboard.add(j);
        keyboard.add(k);
        keyboard.add(up);
        keyboard.add(l);
        
        keyboard.add(z);
        keyboard.add(x);
        keyboard.add(c);
        keyboard.add(v);
        keyboard.add(b);
        keyboard.add(n);
        keyboard.add(m);
        keyboard.add(left);
        keyboard.add(down);
        keyboard.add(right);
        
        setLayout(new BorderLayout());
        add(keyboard, BorderLayout.CENTER);
        
        ListenerNumbers orejon = new ListenerNumbers();
        AdaptadorTeclasLetras al = new AdaptadorTeclasLetras();
        
        one.addKeyListener(al);
        two.addKeyListener(al);
        three.addKeyListener(al);
        four.addKeyListener(al);
        five.addKeyListener(al);
        six.addKeyListener(al);
        seven.addKeyListener(al);
        eight.addKeyListener(al);
        nine.addKeyListener(al);
        zero.addKeyListener(al);
        
        
        //one.addKeyListener(al);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
