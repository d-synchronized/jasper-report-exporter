package com.cetera.cboss.jasper.report.ds.loader.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.cetera.cboss.jasper.report.ds.loader.TemplateLoader;
import com.cetera.cboss.jasper.report.ds.loader.exception.TemplateLoaderException;
import com.cetera.cboss.report.ds.vo.LoadTemplateRequest;

/**
 * The Class ClasspathTemplateLoader.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ClasspathTemplateLoader extends TemplateLoader {

	/**
	 * Instantiates a new classpath template loader.
	 *
	 * @param loadTemplateRequest the load template request
	 */
	public ClasspathTemplateLoader(LoadTemplateRequest loadTemplateRequest) {
		super(loadTemplateRequest);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cetera.cboss.jasper.report.ds.loader.TemplateLoader#loadTemplate()
	 */
	@Override
	public InputStream loadTemplate() throws TemplateLoaderException {
		final String templateName = loadTemplateRequest.getTemplateName();
		final String templateLocation = loadTemplateRequest.getTemplateLocation();

		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(templateLocation + File.separatorChar + templateName);
		} catch (final FileNotFoundException fileNotFoundException) {
			throw new TemplateLoaderException("Error occurred while fetching the report template from the classpath/filesystem, Error - ", fileNotFoundException);
		}
		return inputStream;
	}

}
