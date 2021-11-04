/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolivas
 */
public class EVA2_1_FOR_RESURSIVO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fakeForDown(5);
    }
    
    public static void fakeForDown (int ival){
        System.out.println(ival + "-");
        if (ival > 1){
        fakeForDown(ival - 1);
        }
    }
    
}
