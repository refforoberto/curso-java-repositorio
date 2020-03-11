package classe;

public class Data {
	
	 int dia;
	 int mes;
	 int ano;
	 
	 public String obterDataFormatada( String separador) {
		 
		 return dia + separador + mes + separador + ano;
		
	}

}
