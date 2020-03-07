package fundamentos.operadores;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		boolean t1 = false;
		boolean t2 = false;
		
		
		boolean comprouTV32 = t1 ^ t2;
		boolean comprouTV50 = t1 && t2;
		boolean tomouSorvete = t1 || t2;
		boolean saudavel = !tomouSorvete;
		
		
		System.out.println("Comprou TV 32: " + comprouTV32);
		System.out.println("Comprou TV 50: " + comprouTV50);
		System.out.println("Tomou sorvete: " + tomouSorvete);
		System.out.println("Saudável: " + saudavel);
	}

}
