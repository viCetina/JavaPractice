/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayuni;

/**
 *
 * @author victoria.cetina
 */
public class ArrayUniMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arrayAge; // declaracion
        arrayAge = new int[10]; // instanciacion
        arrayAge[0] = 10; // iniciacion
        arrayAge[1] = 15;
        arrayAge[2] = 20;
        arrayAge[3] = 25;
        arrayAge[4] = 30;
        
        String [] arrayName = new String[10]; //Declaracion, instanciacion y inicializacion
        arrayName[0] = "Ann";
        arrayName[1] = "Joe";
        arrayName[2] = "Lis";
        arrayName[3] = "Sam";
        arrayName[4] = "Dave";
        
        for(int i = 0; i < arrayAge.length; i++) { // bucle para imprimir el array
            System.out.println(arrayAge[i]);
        }
        
        for (String n : arrayName) {  // Iteracion for mejorada
            System.out.println(n);
        }
        
    }
    
}
