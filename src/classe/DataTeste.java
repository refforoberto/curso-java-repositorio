package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data dt1 = new Data();
		dt1.dia = 5;
		dt1.mes = 4;
		dt1.ano = 2020;
		
		Data dt2 = new Data();
		dt2.dia = 22;
		dt2.mes = 07;
		dt2.ano = 2021;
		
		
	     String df1 = dt1.obterDataFormatada("/");
	     String df2 = dt2.obterDataFormatada("-"); 	     
	     System.out.println(df1);
	     System.out.println(df2);
	}
}
