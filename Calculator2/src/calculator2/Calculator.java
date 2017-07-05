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
public class Calculator {
    
    // suma
    public int sum(int numberOne, int numberTwo){
        System.out.println("Method Sum One");
        return numberOne + numberTwo;
    } 

    public float sum(float numberOne, float numberTwo){
        System.out.println("Method Sum Two");
        return numberOne + numberTwo;
    }  
    
    public float sum(int numberOne, float numberTwo){
        System.out.println("Method Sum Three");
        return numberOne + numberTwo;
    } 
        
    // resta
    public int dif(int numberOne, int numberTwo){
        System.out.println("Method Dif One");
        return numberOne - numberTwo;
    } 

    public float dif(float numberOne, float numberTwo){
        System.out.println("Method Dif Two");
        return numberOne - numberTwo;
    }  
    
    public float dif(int numberOne, float numberTwo){
        System.out.println("Method Dif Three");
        return numberOne - numberTwo;
    }
        
    //Div
    public int div(int numberOne, int numberTwo){
        System.out.println("Method Div One");
        return numberOne / numberTwo;
    } 

    public float div(float numberOne, float numberTwo){
        System.out.println("Method Div Two");
        return numberOne / numberTwo;
    }  
    
    public float div(int numberOne, float numberTwo){
        System.out.println("Method Div Three");
        return numberOne / numberTwo;
    }   
}