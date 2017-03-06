package com.cetera.cboss.jasper.report.core.exception;

/**
 * The Class ReportEngineException.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ReportEngineException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -864055972043628388L;

	/**
	 * Instantiates a new report engine exception.
	 */
	public ReportEngineException() {
		super();
	}

	/**
	 * Instantiates a new report engine exception.
	 *
	 * @param message the message
	 */
	public ReportEngineException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new report engine exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public ReportEngineException(String message, Throwable cause) {
		super(message, cause);
	}

}
