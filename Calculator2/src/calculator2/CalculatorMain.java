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
public class CalculatorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator Calculator = new Calculator();
        Cientifica CalculatorC = new Cientifica();
        Financiera CalculatorF = new Financiera();
        
        System.out.println(Calculator.sum(2,2));
        System.out.println(Calculator.sum(2.7f,2.8f));
        System.out.println(Calculator.sum(1,2.6f));
        
        System.out.println(Calculator.dif(2,2));
        System.out.println(Calculator.dif(2.7f,2.8f));
        System.out.println(Calculator.dif(1,2.6f));
        
        System.out.println(Calculator.div(2,2));
        System.out.println(Calculator.div(2.7f,2.8f));
        System.out.println(Calculator.div(1,2.6f));
        
        System.out.println(CalculatorC.tim(2,2));
        System.out.println(CalculatorC.tim(2.7f,2.8f));
        System.out.println(CalculatorC.tim(1,2.6f));
        
        System.out.println(CalculatorF.mod(2,2));
        System.out.println(CalculatorF.mod(2.7f,2.8f));
        System.out.println(CalculatorF.mod(1,2.6f));
        System.out.println(CalculatorF.sum(2,2));
    }
    
}
