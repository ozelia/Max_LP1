/*
3. A partir do exercício 1, crie um método que
receba a frase e retorna a quantidade de
caracteres da frase sem os espaços em branco.

*/
package Ex03_qtd_caracter;

import javax.swing.JOptionPane;

public class QtdCAracter {

    private String frase;
    private int qtdCaracter;

    public int tamanhoSemEspaco() {

        frase = JOptionPane.showInputDialog("Digite uma frase: ");
        qtdCaracter = frase.length();

        String resposta = "A quantidade de caracteres da frase sem espaço é : " + frase.trim();

        JOptionPane.showMessageDialog(null, resposta);
        return 0;

    }

}
