package com.sitemorse.sci;


/**
 * All exceptions thrown by SCIClient are subclasses of this exception.
 * They may be encapsulating other Java exceptions, or be a string message.
 * If they are an error message direct from the SCI server they will be of
 * type SCIServerError. These must be displayed to the user.
 */
public class SCIException extends Exception {
	private static final long serialVersionUID = 8955498931115729307L;

	SCIException(Throwable e) {
		super(e);
	}

	SCIException(String string) {
		super(string);
	}
}
