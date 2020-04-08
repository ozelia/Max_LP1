
package fat;

import javax.swing.JOptionPane;



public class Fat {

    public static void main(String[] args) {
        	int intcontador = 1, fat, valor;
	valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com numero", "entrada", JOptionPane.INFORMATION_MESSAGE));
	fat = 1;
	String result = "o fatorial de " + valor + " é :";
	while (intcontador <= valor) {
		fat = fat + (fat * (valor - 1) );
		valor--;
	}
	JOptionPane.showMessageDialog(null, result + fat, "Resultado", JOptionPane.INFORMATION_MESSAGE);
}
}
    
        
        
    
    

