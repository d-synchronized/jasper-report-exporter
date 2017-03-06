package com.cetera.cboss.jasper.report.ds.loader;

import java.io.InputStream;

import com.cetera.cboss.jasper.report.ds.loader.exception.TemplateLoaderException;
import com.cetera.cboss.report.ds.vo.LoadTemplateRequest;

/**
 * The Class TemplateLoader.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public abstract class TemplateLoader {

	/** The load template request. */
	protected LoadTemplateRequest loadTemplateRequest;

	/**
	 * Instantiates a new template loader.
	 *
	 * @param loadTemplateRequest the load template request
	 */
	public TemplateLoader(final LoadTemplateRequest loadTemplateRequest) {
		this.loadTemplateRequest = loadTemplateRequest;
	}

	/**
	 * Load template.
	 *
	 * @return the input stream
	 * @throws TemplateLoaderException the template loader exception
	 */
	public abstract InputStream loadTemplate() throws TemplateLoaderException;

	/**
	 * Gets the load template request.
	 *
	 * @return the load template request
	 */
	public LoadTemplateRequest getLoadTemplateRequest() {
		return loadTemplateRequest;
	}

}
