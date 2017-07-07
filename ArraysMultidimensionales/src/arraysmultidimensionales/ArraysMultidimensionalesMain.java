/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysmultidimensionales;

/**
 *
 * @author alumno
 */
public class ArraysMultidimensionalesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayMulti[][] = new int [4][4];
        
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti.length; j++) {
                arrayMulti[i][j]=j+i;
                //arrayMulti[x][y]=y+1;
                System.out.println(arrayMulti[i][j] + " ");
            }
            System.out.println("---");
        }
        
        double arrayMultiDbl[][] = new double [3][3];
        
        for (int i = 0; i < arrayMultiDbl.length; i++) {
            for (int j = 0; j < arrayMultiDbl.length; j++) {
                arrayMultiDbl[i][j]=(j+i);
                System.out.println(arrayMultiDbl[i][j] + " ");
            }
            System.out.println("---");
        }
        
        String arrayTxt[][] = new String[2][3];
        //String arrayTxt[][] = {{"Francia", "Paris", "Lyon"},{"Italia", "Paris", "Lyon"}};
        
        arrayTxt[0][0]="Francia";
        arrayTxt[0][1]="Paris";
        arrayTxt[0][2]="Lyon";
        
        arrayTxt[1][0]="Italia";
        arrayTxt[1][1]="Roma";
        arrayTxt[1][2]="Sicilia";
        
        for (int i = 0; i < arrayTxt.length; i++) {
            for (int j = 0; j < arrayTxt[i].length; j++) {
                System.out.println(arrayTxt[i][j] + " ");
            }
            System.out.println("---");
        }
    }
    
}
