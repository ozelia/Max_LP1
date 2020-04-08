/*
3. A partir do exercício 1, crie um método que
receba a frase e retorna a quantidade de
caracteres da frase sem os espaços em branco.

*/
package Ex03_qtd_caracter;

import javax.swing.JOptionPane;

public class QtdCAracter {
    
   private String frase;
   
    public void tamanhoSemEspaco() {
        
        frase = JOptionPane.showInputDialog(null,"Digite uma frase: ");
        
        int contador = 0;
        for(int i = 0; i < frase.length(); i++){
        if(frase.charAt(i) != ' '){
        contador++;
        
        
        } 
       
        }
         JOptionPane.showMessageDialog(null,"A frase tem: "+ " "+contador +" " + " Caracteres");
         
    }

}
