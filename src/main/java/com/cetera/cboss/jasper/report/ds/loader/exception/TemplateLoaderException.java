package com.cetera.cboss.jasper.report.ds.loader.exception;

/**
 * The Class TemplateLoaderException.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class TemplateLoaderException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 720203468180324592L;

	/**
	 * Instantiates a new template loader exception.
	 */
	public TemplateLoaderException() {
		super();
	}

	/**
	 * Instantiates a new template loader exception.
	 *
	 * @param message the message
	 */
	public TemplateLoaderException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new template loader exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public TemplateLoaderException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new template loader exception.
	 *
	 * @param cause the cause
	 */
	public TemplateLoaderException(Throwable cause) {
		super(cause);
	}

}
