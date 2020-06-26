package exceptions.custom.checked;

@SuppressWarnings("serial")
public class EmptyStringException extends Exception {
	
	private String attribute;
	
	public EmptyStringException(String attribute) {
		this.attribute = attribute;		
	}
	
	@Override
	public String getMessage() {
		return  "The " + this.attribute + " is empty";
	}

}
