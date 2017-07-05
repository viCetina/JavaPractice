/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author alumno
 */
public class Edificar {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        
        Mercado superAzcuenaga = new Mercado(8, 23, 80, "Lunes", 'C', "COTO");
        
        Mercado SuperCallaoI = new Mercado(9, 22, 70);
        Mercado SuperCallaoS = new Mercado("Martes", "DISCO");
        Mercado SuperCallaoC = new Mercado('J');
        
        Mercado SuperJuninI = new Mercado(8, 23, 20);
        Mercado SuperJuninS = new Mercado("Lunes", "VEA");
        Mercado SuperJuninC = new Mercado('C');
        
    }
    
}
