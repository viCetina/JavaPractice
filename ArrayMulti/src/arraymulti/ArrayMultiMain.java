/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymulti;

import java.util.Arrays;

/**
 *
 * @author victoria.cetina
 */
public class ArrayMultiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int generalArray[][] = new int[4][3];
        
        generalArray[0][0]=11;
        generalArray[0][1]=12;
        generalArray[0][2]=13;
    
        generalArray[1][0]=21;
        generalArray[1][1]=22;
        generalArray[1][2]=23;
        
        generalArray[2][0]=31;
        generalArray[2][1]=32;
        generalArray[2][2]=33;
        
        generalArray[3][0]=41;
        generalArray[3][1]=42;
        generalArray[3][2]=43;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(generalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
