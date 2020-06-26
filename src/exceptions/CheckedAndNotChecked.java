package exceptions;

public class CheckedAndNotChecked {
	public static void main(String[] args) {
		
		try {
			throwError1();
		} catch (RuntimeException e) {
			System.out.println("An exception happened: " + e.getMessage());
		}
		try {
			throwError2();
		} catch (Exception e) {
			System.out.println("An exception happened: " + e.getMessage());
		}
		System.out.println("End");

	}
	
	
	/**
	 * Not checked exception
	 */
	private static void  throwError1() {
		throw new RuntimeException("Error #1");
		
	}
	
	/**
	 * 
	 * Checked exception. You need to sign the method with throws and indocate type of exception
	 */
	private static void  throwError2() throws Exception {
		throw new Exception("Error #2");		
	}
}
