package com.opl.retail.api.exceptions.matches;

public class MatchException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = -3494092473797863483L;

	public MatchException() {
		super();
	}

	public MatchException(String message) {
		super(message);
	}
	public MatchException(Throwable cause) {
		super(cause);
	}
	
}
