package com.cetera.cboss.jasper.report.factory;

import com.cetera.cboss.jasper.report.exporter.ReportTemplateExporter;

/**
 * A factory for creating ReportTemplateExporter objects.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ReportTemplateExporterFactory {

	/** The report template exporter. */
	private ReportTemplateExporter reportTemplateExporter;

	/**
	 * Initialize report exporter.
	 *
	 * @param <Exporter> the generic type
	 * @param exporterClazz the exporter clazz
	 */
	public <Exporter extends ReportTemplateExporter> void initializeReportExporter(Exporter exporterClazz) {
		reportTemplateExporter = exporterClazz;
	}

	/**
	 * Fetch report exporter.
	 *
	 * @return the report template exporter
	 */
	public ReportTemplateExporter fetchReportExporter() {
		if (reportTemplateExporter == null) {
			reportTemplateExporter = new ReportTemplateExporter(null);
		}
		return reportTemplateExporter;
	}

}
