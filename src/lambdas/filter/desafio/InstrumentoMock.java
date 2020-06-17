package lambdas.filter.desafio;

import java.util.Arrays;
import java.util.List;

public abstract class InstrumentoMock {

	public static List<Instrumento> retornarInstrumentos() {
		return Arrays.asList(
				new Instrumento("Viol�o Di Giorgio", "Viol�o acustico cordas de nylon", Categoria.CORDAS, 800),
				new Instrumento("Viol�o Crafter", "Viol�o el�trico cordas de a�o", Categoria.CORDAS, 1200),
				new Instrumento("Viol�o Estudante", "Viol�o para iniciantes", Categoria.CORDAS, 330),
				new Instrumento("Bateria pearl", "Bateria completa", Categoria.RITMO, 3000),
				new Instrumento("Bongo", "Bongo", Categoria.RITMO, 134),
				new Instrumento("Saxofone", "Saxofone baritono", Categoria.SOPRO, 3677),
				new Instrumento("Microfone", "Microfone sem fio", Categoria.VOCAL, 1400)
		);
	}

}
