package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String v1 = JOptionPane.showInputDialog("Digite um n�mero");
		String v2 = JOptionPane.showInputDialog("Digite outro n�mero");
		
		System.out.println(v1 + v2);
		
		Double n1 = Double.parseDouble(v1);
		Double n2 = Double.parseDouble(v2);
		
		Double soma = n1 + n2;
		Double media = soma / 2;
		
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + media);
	}

}
