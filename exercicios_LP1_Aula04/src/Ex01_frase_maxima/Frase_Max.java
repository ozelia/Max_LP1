
/*
1. Escreva um programa que leia uma frase com no
máximo 20 caracteres. Caso o usuário informar
uma frase com mais de 20 caracteres, ele deve
entrar com uma nova frase. A leitura deve ser
realizada no método main.

*/
package Ex01_frase_maxima;

import javax.swing.JOptionPane;

public class Frase_Max {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase com até 20 caracteres");
        if (frase.length() > 20) {
            JOptionPane.showInputDialog("Digite outra frase!");

        } else {
            JOptionPane.showMessageDialog(null, "Muito bem");
        }

    }

}
