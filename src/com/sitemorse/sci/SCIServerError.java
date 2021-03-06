package com.sitemorse.sci;

/**
 * A subclass of SCIException that is thrown when the server sends
 * a specific error message that must be displayed to the user.
 */
public class SCIServerError extends SCIException {
	private static final long serialVersionUID = -3396387001939624977L;

	SCIServerError(String string) {
		super(string);
	}
}
