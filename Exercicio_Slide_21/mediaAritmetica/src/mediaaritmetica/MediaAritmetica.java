/*
2. Faça um programa em Java para solicitar dois
números pelo teclado e imprimir a média
aritmética
*/
package mediaaritmetica;

import javax.swing.JOptionPane;

public class MediaAritmetica {
    
    public static void main(String[] args) {
        String n1, n2;
        double nota01, nota02, media;
        
        n1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        nota01 = Double.parseDouble(n1);
        
        n2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        nota02 = Double.parseDouble(n2);
        
        media = (nota01 + nota02)/2;
                              
        
        JOptionPane.showMessageDialog(null,"A média é: " + media);
        System.exit(0);
       
        
        
    }
    
}
