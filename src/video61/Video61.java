/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video61;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gleez
 */
public class Video61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoConColor mimarco = new MarcoConColor(); 
        mimarco.setVisible(true); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true); 
    }
    
}

class MarcoConColor extends JFrame{
    
    public MarcoConColor(){
        setTitle("prueba de Dibujo"); 
        
        setSize(500,500); 
        
        LaminaConColor milamina = new LaminaConColor(); 
        add(milamina); 
        milamina.setBackground(Color.PINK);
    }
}

class LaminaConColor extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g; 
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.RED);
        g2.fill(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double(); 
        elipse.setFrame(rectangulo); 
        g2.setPaint(new Color(0,140,255)); 
        g2.fill(elipse); 
      
        
       
        
    
    }
}
