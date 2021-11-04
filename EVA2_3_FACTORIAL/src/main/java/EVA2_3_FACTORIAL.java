/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolivas
 */
public class EVA2_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 = " + factorial (5));
    }
    
    public static int factorial (int iVal){ // Mas lento, mas memeoria 
        if (iVal == 0 )
            return 1;
        else 
            return iVal  * factorial (iVal -1 );
    }
    
    public static int factorialFor (int iVal ){ // Mas rapido, ,menso memeoria 
        int iTemp  = 1;
        for (int i = iVal; i > 0  ; i--) {
            iTemp = iTemp * i;
        }
        return iTemp;
    }
}
