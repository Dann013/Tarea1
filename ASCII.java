
package mx.unam;

import java.util.Scanner;


public class ASCII {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una cadena de caracteres:");
        String entrada = teclado.nextLine();
      
        
        System.out.println("Tecleaste: " + entrada);
        
        
         for (int indice = 0; indice < entrada.length(); indice++) {
               
       
             System.out.println((int)entrada.charAt(indice));
       
         }
        
        
        
    }
    
}
