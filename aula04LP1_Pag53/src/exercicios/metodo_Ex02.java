
package exercicios;

import javax.swing.JOptionPane;

public class Ex02 {

    private String frase;
    private String resposta;

    public void tamanhoDaFrase() {
        frase = JOptionPane.showInputDialog("Digite uma frase: ");
        int qtdCaracter = frase.length();

        resposta = "A quantidade de caracteres da frase é : ";

        JOptionPane.showMessageDialog(null, resposta + qtdCaracter);

    }
}
