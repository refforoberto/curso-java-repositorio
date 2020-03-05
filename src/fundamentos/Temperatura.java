package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
        
		final double FATOR = 32.00;
		final double OPERADOR = (5.0 / 9.0);		
		double fTemp = 86;
		
		double cTemp = (fTemp - FATOR) * OPERADOR;
		
		System.out.println("Temperatura convertida é " + cTemp + " Cº");
		
	}
}
