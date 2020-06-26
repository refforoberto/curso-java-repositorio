package exceptions.custom.notChecked;

import lambdas.Aluno;

public class ValidateTest {
	public static void main(String[] args) {
		Aluno student = new Aluno("s", 1);

		try {
			Validate.student(student);
			Validate.student(null);
		} catch (NumberOutOfRangeException | EmptyStringException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		System.out.println("End");

	}

}
