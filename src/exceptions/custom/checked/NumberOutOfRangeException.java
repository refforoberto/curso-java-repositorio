package exceptions.custom.checked;

@SuppressWarnings("serial")
public class NumberOutOfRangeException extends Exception {
	
	private String attribute;
	
	public NumberOutOfRangeException(String attribute) {
		this.attribute = attribute;		
	}
	
	@Override
	public String getMessage() {
		return  "The " + this.attribute + " is outside the allowed range";
	}

}
