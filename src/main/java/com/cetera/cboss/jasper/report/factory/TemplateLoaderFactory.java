package com.cetera.cboss.jasper.report.factory;

import com.cetera.cboss.jasper.report.ds.loader.TemplateLoader;
import com.cetera.cboss.jasper.report.ds.loader.exception.TemplateLoaderException;

/**
 * A factory for creating TemplateLoader objects.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class TemplateLoaderFactory {

	/** The template loader. */
	private TemplateLoader templateLoader;

	/**
	 * Initialize template loader.
	 *
	 * @param <ReportTemplateLoader> the generic type
	 * @param reportTemplateLoader the report template loader
	 */
	public <ReportTemplateLoader extends TemplateLoader> void initializeTemplateLoader(final ReportTemplateLoader reportTemplateLoader) {
		this.templateLoader = reportTemplateLoader;
	}

	/**
	 * Fetch template loader.
	 *
	 * @param <ReportTemplateLoader> the generic type
	 * @return the template loader
	 * @throws TemplateLoaderException the template loader exception
	 */
	public <ReportTemplateLoader extends TemplateLoader> TemplateLoader fetchTemplateLoader() throws TemplateLoaderException {
		if (templateLoader == null) {
			throw new TemplateLoaderException("Error occurred while trying to create report engine , Error - 'Template Loader Missing'");
		}
		return templateLoader;
	}

}
