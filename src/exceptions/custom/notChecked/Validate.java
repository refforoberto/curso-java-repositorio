package exceptions.custom.notChecked;

import lambdas.Aluno;

public class Validate {

	private Validate() {
	}

	public static void student(Aluno student) {

		if (student == null) {
			throw new IllegalArgumentException("The student is null");
		}
		
		if (student.getNome() == null || student.getNome().trim().isEmpty()) {
			throw new EmptyStringException("name");
		}
		
		if (student.getNota() < 0 || student.getNota() > 10) {
			throw new NumberOutOfRangeException("grade");
		}

	}
}
