package fundamentos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		String valor1  = s.next().replace(",", ".");
		
		System.out.println("Digite um valor");
		String valor2  = s.next().replace(",",".");
		
		System.out.println("Digite um valor");
		String valor3  = s.next().replace(",",".");
		
		double n1 = Double.parseDouble(valor1);
		double n2 = Double.parseDouble(valor2);
		double n3 = Double.parseDouble(valor3);
		
		
		System.out.println("A média é: " +  (n1 + n2 + n3) / 3);
		s.close();

		

	}
}
