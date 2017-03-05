package com.cetera.cboss.report.ds.vo;

import java.util.Map;

/**
 * The Class LoadTemplateRequest.
 */
public class LoadTemplateRequest {

	/** The template name. */
	private String templateName;

	/** The template location. */
	private String templateLocation;

	/** The username. */
	private String username;

	/** The password. */
	private String password;

	/** The template parameters. */
	private Map<String, Object> templateParameters;

	/**
	 * Instantiates a new load template request.
	 */
	public LoadTemplateRequest() {

	}

	/**
	 * Instantiates a new load template request.
	 *
	 * @param templateName the template name
	 * @param templateLocation the template location
	 * @param inputParams the input params
	 */
	public LoadTemplateRequest(final String templateName, final String templateLocation, final Map<String, Object> inputParams) {
		this.templateName = templateName;
		this.templateLocation = templateLocation;
		this.templateParameters = inputParams;
	}

	/**
	 * Gets the template name.
	 *
	 * @return the template name
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * Sets the template name.
	 *
	 * @param templateName the new template name
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	/**
	 * Gets the template location.
	 *
	 * @return the template location
	 */
	public String getTemplateLocation() {
		return templateLocation;
	}

	/**
	 * Sets the template location.
	 *
	 * @param templateLocation the new template location
	 */
	public void setTemplateLocation(String templateLocation) {
		this.templateLocation = templateLocation;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the template parameters.
	 *
	 * @return the template parameters
	 */
	public Map<String, Object> getTemplateParameters() {
		return templateParameters;
	}

	/**
	 * Sets the template parameters.
	 *
	 * @param templateParameters the template parameters
	 */
	public void setTemplateParameters(Map<String, Object> templateParameters) {
		this.templateParameters = templateParameters;
	}

}
