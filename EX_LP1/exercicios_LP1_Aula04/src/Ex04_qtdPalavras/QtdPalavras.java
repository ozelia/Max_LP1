/*
4. A partir do exercício 1, crie um método que
receba a frase e retorne a quantidade de palavras
da frase.
*/
package Ex04_qtdPalavras;

import javax.swing.JOptionPane;

public class QtdPalavras {

    private String frase;
    
    public void qtdPalavras() {
    int palavras = 0;       
    
     frase = JOptionPane.showInputDialog("Digite uma frase: ");
     
     if(!(" ".equals(frase.substring(0,1))) || !(" ".equals(frase.substring(frase.length()-1)))){
     
         for(int i = 0; i < frase.length(); i++){
         
             if(frase.charAt(i)==' '){
             palavras ++;
             
             }
         
         }
         palavras = palavras + 1;
     }
     
     
        JOptionPane.showMessageDialog(null,"Você digitou "+" " +palavras +" "+ "palavras.");

      
      
            
            
            
            
        }
      
    }

