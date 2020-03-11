package classe;

public class Data {
	
	 int dia;
	 int mes;
	 int ano;
	 
	 Data() {
		 dia = 01;
		 mes = 01;
		 ano = 1970;
	 }
	 
	 Data (int diaAtual, int mesAtual, int anoAtual) {
		 dia = diaAtual;
		 mes = mesAtual;
		 ano = anoAtual;	 
	 }
	 
	 public String obterDataFormatada() {
		 
		 return  String.format("%d/%d/%d", dia, mes, ano);
		
	}

}
