package com.opl.retail.api.exceptions.notification;

/**
 * @author Sanket
 *
 */
public class NotificationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotificationException() {
	}

	public NotificationException(String message) {
		super(message);
	}

	public NotificationException(Throwable cause) {
		super(cause);
	}

	public NotificationException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotificationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
