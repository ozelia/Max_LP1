/*
4. A partir do exercício 1, crie um método que
receba a frase e retorne a quantidade de palavras
da frase.
*/
package exercicios;

import javax.swing.JOptionPane;

public class Ex04 {
    
    private String frase  ;
    private int qtdPalavras;
     
    public int qtdPalavras(){
    
         int palavra = 0;
     

       String frase = JOptionPane.showInputDialog("Digite uma frase: ");


        String[] qtdPalavras = frase.split(frase ,  0);
        for (int i = 0 ; i< 9 ; i++){
               System.out.println(qtdPalavras [i]);
    
    }
        
         // for (int i = 0; i < frase.length(); i++) {
         //   if(frase.charAt(i) == " ")&&(frase.charAt(i+1) != " "){
                
         //           palavra ++;}

          //      String resposta = "Voce Digitou: " + palavra + "palavras";

          //      JOptionPane.showMessageDialog(null, frase + palavra);
        
        
        
    
    
    
    
    
    

