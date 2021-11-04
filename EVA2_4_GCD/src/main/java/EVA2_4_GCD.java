/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolivas
 */
public class EVA2_4_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El Maximo comun divisor de 180 y 48 es = " + gcd(180,48));
    }
    
    public static int gcd (int iDividendo, int iDivisor){
        //¿como calculamos el residuo?
       //Modulo ---> %
       if (iDivisor == 0) //DETENERLO
           return iDividendo;
       else{
            int iResi = iDividendo % iDivisor;//En java se lee de izquierda a derecha
             return gcd(iDivisor, iResi);
       }
    }
    
}
