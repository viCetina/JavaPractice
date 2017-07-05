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
public class Cientifica extends Calculator{
    
    public int tim(int numberOne, int numberTwo){
        System.out.println("Method Times One");
        return numberOne * numberTwo;
    } 

    public float tim(float numberOne, float numberTwo){
        System.out.println("Method Times Two");
        return numberOne * numberTwo;
    }  
    
    public float tim(int numberOne, float numberTwo){
        System.out.println("Method Times Three");
        return numberOne * numberTwo;
    }
}
