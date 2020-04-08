/*1. Faça um programa em Java para solicitar um
número pelo teclado e imprimir a tabuada.*/

package tabuada;

import java.util.Scanner;

public class Tabuada {
   
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe um número para tabuada: ");
        
        int num = teclado.nextInt();
        
        int i = 1;
        while(i <= 10){
            
            int resultado = num * i;
            
            System.out.printf("%d * %d = %d\n",num,  i, resultado);
                   i ++; 
        
        }
                    
           

             
            
    }
    
}





