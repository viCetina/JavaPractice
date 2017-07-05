/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator2;

/**
 *
 * @author alumno
 */
public class Financiera extends Cientifica{
    public int mod(int numberOne, int numberTwo){
        System.out.println("Method Modulo One");
        return numberOne % numberTwo;
    } 

    public float mod(float numberOne, float numberTwo){
        System.out.println("Method Modulo Two");
        return numberOne % numberTwo;
    }  
    
    public float mod(int numberOne, float numberTwo){
        System.out.println("Method Modulo Three");
        return numberOne % numberTwo;
    }
    
    @Override
    public int sum(int numberOne, int numberTwo){
        System.out.println("Method Sum financiera One");
        return numberOne + numberTwo;
    }
    
}
