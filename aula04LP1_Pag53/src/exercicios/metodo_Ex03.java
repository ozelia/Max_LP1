/*
3. A partir do exercício 1, crie um método que
receba a frase e retorna a quantidade de
caracteres da frase sem os espaços em branco.

*/
package exercicios;

import javax.swing.JOptionPane;

public class Ex03 {

    private String frase;
    private int qtdCaracter;

    public  int tamanhoSemEspaço(String frase) {

        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        int qtdCaracter = frase.length();

        String resposta = "A quantidade de caracteres da frase sem espaço é : " + frase.trim();

        JOptionPane.showMessageDialog(null, resposta);

    }
}

/*
public static int nroChars(String msg){
msg = msg.trim();
int c=0;
for(i = 0;i < msg.length(); i++){

if (msg.charAt(i)!= " ")
c++
}
return c;
}
*/