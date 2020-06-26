package exceptions;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		try {
			System.out.println(7 / in.nextInt());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally #001");
		}

		try {
			System.out.println(7 / in.nextInt());

		} finally {
			System.out.println("Finally #002");
			in.close();
		}

	}
}
