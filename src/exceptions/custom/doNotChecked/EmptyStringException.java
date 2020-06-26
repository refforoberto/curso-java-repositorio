package exceptions.custom.doNotChecked;

@SuppressWarnings("serial")
public class EmptyStringException extends RuntimeException {
	
	private String attribute;
	
	public EmptyStringException(String attribute) {
		this.attribute = attribute;		
	}
	
	@Override
	public String getMessage() {
		return  "The " + this.attribute + " is empty";
	}

}
