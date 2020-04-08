/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06;

import javax.swing.JOptionPane;

/**
 *
 * @author Positivo
 */
public class Ex06medCaracterFrase {
       private String frase ;
       
    public void MedCharacter () {
   //     A partir do exercício 1, crie um método que
//receba a frase e um caractere e retorne o
//percentual da ocorrência deste caractere na frase
      int qntt = 0;
      frase = JOptionPane.showInputDialog(null, "Digite uma frase");
      String parametro =   JOptionPane.showInputDialog(null, "Digite um parametro");
         //       char[] omagod ;
          //     omagod = frase.toCharArray();
              int qntFrase = frase.length();
             
              frase = frase.trim();
                String [] array;
             array = frase.split( " ");
            int n = array.length;
          
            int index = 0;
                  
          for (int i= 0; i<n;i++){
              qntt++;
            
              for(int j= 0; j <= array[i].length() ;j++){
                if (array[i].indexOf(parametro, j) == j) {
                    index++;

                }  }
          }
              
       float porcentagem = ((float) index /(float) qntFrase)  * 100f;
         
          int porcentagemf = (int) porcentagem;
       
 //    JOptionPane.showMessageDialog(null,"A frase é: " + Arrays.toString(omagod)  + "\n A quantidaed de letras é: "+ qntt);
     
     
      JOptionPane.showMessageDialog(null,"A frase é: " + frase + "\n O parametro é: "+ parametro+ "\n A porcentagem de caracteres é "+ porcentagemf+"% ");
     }
    
}
