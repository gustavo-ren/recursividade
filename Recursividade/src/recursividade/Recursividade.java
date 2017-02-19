/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author Gustavo
 */
public class Recursividade {

    /**
     * @param args the command line arguments
     */
    
    public static long calculo(int ofJedi){
        
       if(ofJedi == 1) return ofJedi;
       
       return ofJedi*calculo(ofJedi-1);
    }
    public static void main(String[] args) {
        System.out.println(calculo(6));
    }
    
}
