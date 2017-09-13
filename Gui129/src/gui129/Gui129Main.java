/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui129;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author alumno
 */
public class Gui129Main {
    private JFrame f;
    private JLabel e;
    private JButton b1;
    private JButton b2;
    
    
    public Gui129Main(String title){
        f = new JFrame (title);
        e = new JLabel("Etiqueta");
        b1 = new JButton("Boton 1");
        b2 = new JButton("Boton 2");
    }
    
    public void launchFrame(){
        f.setLayout(null);
        f.setBounds(100, 100, 500, 300);
        
        e.setLayout(null);
        e.setBounds(10, 50, 100, 20);
        
        b1.setLayout(null);
        b1.setBounds(110, 50, 100, 20);
        b1.setBackground(Color.red);
        
        b2.setLayout(null);
        b2.setBounds(220, 50, 100, 20);
        b1.setBackground(Color.blue);
        
        f.setVisible(true);
        e.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        
        f.add(e);
        f.add(b1);
        f.add(b2);
    }
    
    public static void main(String[] args) {
        Gui129Main guiWindow = new Gui129Main("Practica 12/9");
        guiWindow.launchFrame();
    }
    
/* 
    f.add(elemento); agrega los componentes al frame.
    
    FlowLayout: administrador de disposicion de Panel.
     frame por defecto no esta visible, hay que usar setBounds y f.set visible(true).
        f.pack(); define el tamaño para los componentes (default size se ajusta al contenido)
        para usar esto setLayout no puede ser null.
        f.setLayout(new FlowLayout(***));
        *f.setLayout(new FlowLayout());
        *f.setLayout(new FlowLayout(int aling));
            f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        *f.setLayout(new FlowLayout(int aling, int hgap, int vgap));
            f.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
    
    GridLayout: administrador de disposicion que provee flexibilidad para los componentes.
        f.setLayout(new GridLayout(3,2));
        toma como argumento las filas y columnas de la grilla ue ocupara todo el frame.
    
    BorderLayout: administrador de disposicion de Window, Dialog y Frame.
        private Frame f;
        private Button b1,b2,b3,b4,b5;
            f.add(b1,BorderLayout.NORTH);
            f.add(b1,BorderLayout.SOUTH);
            f.add(b1,BorderLayout.WEST);
            f.add(b1,BorderLayout.EAST);
            f.add(b1,BorderLayout.CENTER);
    CardLayout: administrador de disposicion...
    
*/
    
}
