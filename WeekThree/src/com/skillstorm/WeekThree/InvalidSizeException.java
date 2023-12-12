package com.skillstorm.WeekThree;

public class InvalidSizeException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String getMessage;
	
	public InvalidSizeException() {
		super();
	}
	
	public InvalidSizeException(String message) {
		super(message);
	}
	
	public String getMessage(String getMessage) {
		this.getMessage = getMessage;
		return getMessage;
	}
}
