/*A partir do exercício 1, crie um método que
receba a frase e um caractere e retorne o
percentual da ocorrência deste caractere na frase.*/
package ex06;

import javax.swing.JOptionPane;

public class Ex06medCaracterFrase {

    private String frase;
    private String parametro;

    public void MedCharacter() {

        int qtd = 0;
        frase = JOptionPane.showInputDialog(null, "Digite uma frase");
        parametro = JOptionPane.showInputDialog(null, "Digite um parametro");

        int tamFrase = frase.length();

        frase = frase.trim();
        String[] array;
        array = frase.split(" ");
        int n = array.length;

        int index = 0;

        for (int i = 0; i < n; i++) {
            qtd++;

            for (int j = 0; j <= array[i].length(); j++) {
                if (array[i].indexOf(parametro, j) == j) {
                    index++;

                }
            }
        }

        float porcentagem = ((float) index / (float) tamFrase) * 100f;

        int porcentagemf = (int) porcentagem;

          
        JOptionPane.showMessageDialog(null, " A letra aparece num percentual de: " + porcentagem + "% "+ "na frase");
    }

}
