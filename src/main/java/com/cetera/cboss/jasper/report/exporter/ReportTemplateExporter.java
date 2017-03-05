package com.cetera.cboss.jasper.report.exporter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.lang.StringUtils;

import com.cetera.cboss.jasper.report.core.exception.ReportEngineException;
import com.cetera.cboss.report.ds.constant.ExportType;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 * The Class ReportTemplateExporter.
 */
public class ReportTemplateExporter {

	/**
	 * Export report.
	 *
	 * @param jasperPrint the jasper print
	 * @param exportType the export type
	 * @param outputDirectory the output directory
	 * @return the output stream
	 * @throws ReportEngineException the report engine exception
	 */
	public OutputStream exportReport(final JasperPrint jasperPrint, final ExportType exportType, final String outputDirectory) throws ReportEngineException {
		try {
			final String tempDirectory = StringUtils.isNotBlank(outputDirectory) ? outputDirectory : System.getProperty("java.io.tmpdir");
			final FileOutputStream fileOutputStream = new FileOutputStream(tempDirectory);
			switch (exportType) {
				case PDF:
					JasperExportManager.exportReportToPdfStream(jasperPrint, fileOutputStream);
					return fileOutputStream;

				case DOCX:
					return null;

				case ODT:
					return null;

				case XLS:
					return null;

				default:
					throw new ReportEngineException("Error occurred while exporting report to '" + exportType.toString() + "', Error - Export Type not supported");
			}
		} catch (final IOException ioException) {
			throw new ReportEngineException("Error occurred while exporting report to '" + exportType.toString() + "', Error - ", ioException);
		} catch (JRException jrException) {
			throw new ReportEngineException("Error occurred while exporting report to '" + exportType.toString() + "', Error", jrException);
		}
	}

}
