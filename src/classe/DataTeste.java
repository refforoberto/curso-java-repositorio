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
		
		
		System.out.println(dt1.dia + "-" + dt1.mes + "-"+ dt1.ano);
		System.out.println(dt2.dia + "-" + dt2.mes + "-"+ dt2.ano);
		
	}
}
