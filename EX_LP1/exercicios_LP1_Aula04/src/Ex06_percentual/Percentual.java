/*A partir do exercício 1, crie um método que
receba a frase e um caractere e retorne o
percentual da ocorrência deste caractere na frase.*/
package Ex06_percentual;

import javax.swing.JOptionPane;

public class Percentual {

    private String frase;
    private String caracter;

    public void percent_caracter() {

        int qtd = 0;

        frase = JOptionPane.showInputDialog(null, "Digte uma Frase: ");
        caracter = JOptionPane.showInputDialog(null, "Informe uma letra: ");

        int tamFrase = frase.length();

        frase = frase.trim();
        String[] array;
        array = frase.split(" ");

        int num = array.length;
        int index = 0; //fazer a busca

        for (int i = 0; i < num; i++) {

            for (int j = 0; j <= array[i].length(); j++) {

                if (array[i].indexOf(caracter, j) == j) {

                    index++;

                }

            }
        }

        float porcento = ((float) index / (float) tamFrase) * 100f;

        int porcentof = (int) porcento;

        JOptionPane.showMessageDialog(null, "A letra aparece num percentual de: " + porcento + "%" + "na frase");

    }

}
