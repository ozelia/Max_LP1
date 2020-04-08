/*
2. A partir do exercício anterior, crie um método que
receba a frase e retorna a quantidade de
caracteres da frase (contando com os espaços).

*/
package Ex02_qtd_caracter;

import javax.swing.JOptionPane;

public class QtdCaracter {

    private String frase;
    private String resposta;

    public int tamanhoDaFrase() {

        frase = JOptionPane.showInputDialog("Digite uma frase: ");
        int qtdCaracter = frase.length();

        resposta = "A quantidade de caracteres da frase é : ";

        JOptionPane.showMessageDialog(null, resposta + qtdCaracter);
        return 0;

    }

    public void tamanhoSemEspaco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
