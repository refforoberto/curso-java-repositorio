package lambdas.stream.reduce;

public class Media {
	
	private int quantidade;
	private double total;
	
	
	public Media adicionar(double valor) {
		total+=valor;
		quantidade++;
		return this;
	}
	
	
	public double getValor() {
		return total / quantidade;		
	}
	
	public static Media combinar( Media media1, Media media2) {
		
	    Media mediaResultante = new Media();
		mediaResultante.quantidade = media1.quantidade + media2.quantidade;
		mediaResultante.total = media1.total + media2.total;
		
		return mediaResultante;
		
	}

}
