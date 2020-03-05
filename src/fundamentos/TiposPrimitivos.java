package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações de funcionário

		// Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = true;
		
		// tipo caractere
		char situacao = 'A';
		
		System.out.println("Funcionário " + id + " com a  situacao " + situacao + " pode estar em férias? " + estaDeFerias );
		System.out.println("Dias de empresa : " + anosDeEmpresa * 365);

		System.out.println("Viagens : " + numeroDeVoos / 2);
		System.out.println("Pontos real  : " + (pontosAcumulados / vendasAcumuladas) * salario);
		
	}

}
