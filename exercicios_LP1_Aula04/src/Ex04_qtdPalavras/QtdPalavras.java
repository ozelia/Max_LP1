/*
4. A partir do exercício 1, crie um método que
receba a frase e retorne a quantidade de palavras
da frase.
*/
package Ex04_qtdPalavras;

import javax.swing.JOptionPane;

public class QtdPalavras {

    private String frase;
    private int qtdPalavras;

    public int qtdPalavras() {

        int palavra = 0;

        frase = JOptionPane.showInputDialog("Digite uma frase: ");

        String[] qtdPalavras = frase.split(frase, 0);
        for (int i = 0; i < 9; i++) {
            System.out.println(qtdPalavras[i]);

        }
        return 0;
    }
}
