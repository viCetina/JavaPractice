/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui199;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
/*
Panel >>    FlowLayout();
            FlowLayout(int alineacion);
            FlowLayout(int alineacion, hgap, vgap);

Frame y
Dialog >>   BorderLayout(int alineacion);

Componentes AWT:
-Panel
-Frame
-Button
-Canvas
-CheckBox
-BeckBoxMenuItem
-Choice
-Component
-Container
-Dialog
-Frame
-Label
-List
-Menu
-MenuItem
-Panel
-Scrollbar
-ScrollPanel
-TextArea
-TextField
-Window (Clase base de todas las ventanas de GUI)

 */
public class Gui199Main {

    /**
     * @param args the command line arguments
     */
    
    public JFrame f;
    public JLabel l;
    public JButton b1;
    public JButton b2;
    public JPanel p;
    public JPanel p1;
    
    public JMenuBar mb;
    public JMenu m1;
    public JMenu m2;
    public JMenu m3;
    
    public JMenuItem mi1;
    public JMenuItem mi2;
    public JMenuItem mi3;
    
    public JMenuItem mi4;
    public JMenuItem mi5;
    
    public JMenuItem mi6;
    public JMenuItem mi7;
    
    public Gui199Main(){
        f = new JFrame ("Titulo");
        l = new JLabel("Etiqueta");
        b1 = new JButton("Si");
        b2 = new JButton("No");
        p = new JPanel();
        p1 = new JPanel();
        
        mb = new JMenuBar();
        m1 = new JMenu("Archivo");
        m2 = new JMenu("edicion");
        m3 = new JMenu("Ayuda");
        
        mi1 = new JMenuItem("Abrir");
        mi2 = new JMenuItem("Guardar");
        mi3 = new JMenuItem("Cerrar");
        
        mi4 = new JMenuItem("Formato");
        mi5 = new JMenuItem("Margenes");
        
        mi6 = new JMenuItem("FAQ");
        mi7 = new JMenuItem("Soporte");
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        
        m2.add(mi4);
        m2.add(mi5);
        
        m3.add(mi6);
        m3.add(mi7);
        
        p1.setBackground(Color.red);
        p.setBackground(Color.blue);
        
        p.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p.add(b1);
        p.add(b2);
        
        f.add(p,BorderLayout.SOUTH);
        f.add(p1,BorderLayout.CENTER);
        f.setJMenuBar(mb);
        p1.add(l);
        f.setSize(400, 400);
        f.pack();
        f.setVisible(true);
    }
    
     
    public static void main(String[] args) {
      Gui199Main v = new Gui199Main();
    }
    
}
