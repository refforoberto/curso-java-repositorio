package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data dt1 = new Data();
		
		
		Data dt2 = new Data(22, 07, 2021);
	
		
	     String df1 = dt1.obterDataFormatada();
	     String df2 = dt2.obterDataFormatada(); 	     
	     System.out.println(df1);
	     System.out.println(df2);
	}
}
