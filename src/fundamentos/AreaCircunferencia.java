package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		final double PI = 3.14159;
		double raio = 3.4;

		double area = PI * raio * raio;
		System.out.println("A área clculada é: " + area + " M2.");

		raio = 10;
		area = PI * raio * raio;
		System.out.println("A área clculada é: " + area + " M2.");

	}

}
