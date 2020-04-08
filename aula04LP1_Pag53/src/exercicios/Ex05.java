/*
5. A partir do exercício 1, crie um método que
receba a frase e um caractere e retorne a média
de letras das palavras que iniciam com o
caractere passado por parâmetro.

*/
package exercicios;

import javax.swing.JOptionPane;

public class Ex05 {
    private String msg;
    private char letra;
    
    public float calcularMedia(char letra) {

       String msg = JOptionPane.showInputDialog("Digite uma frase: ");
       letra = JOptionPane.showInputDialog("Digite uma letra: ").charAt(0);
       
       msg = msg.trim();
       int contador = 0;
       String vet[] = msg.split(" ");
       for(int i = 0; i < vet.length; i ++){
       if(vet[i].charAt(0)== letra){
        contador ++;
        
       }
       float media = contador / vet.length;
       
       }
       
        

    
    
    

 
       
