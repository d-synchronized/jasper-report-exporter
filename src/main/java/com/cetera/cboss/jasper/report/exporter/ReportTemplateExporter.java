package com.cetera.cboss.jasper.report.exporter;

import org.apache.commons.lang.StringUtils;

import com.cetera.cboss.jasper.report.core.exception.ReportEngineException;
import com.cetera.cboss.report.ds.constant.ExportType;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 * The Class ReportTemplateExporter.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class ReportTemplateExporter {
   
    /** The output directory. */
    private String outputDirectory;
    
    /**
     * Instantiates a new report template exporter.
     *
     * @param outputDirectory the output directory
     */
    public ReportTemplateExporter(final String outputDirectory){
        this.outputDirectory = outputDirectory;
    }

	/**
	 * Export report.
	 *
	 * @param jasperPrint the jasper print
	 * @param exportType the export type
	 * @param outputDirectory the output directory
	 * @return the output stream
	 * @throws ReportEngineException the report engine exception
	 */
	public String exportReport(final JasperPrint jasperPrint, final ExportType exportType) throws ReportEngineException {
		try {
			final String fullyClassifiedFileName = StringUtils.isNotBlank(outputDirectory) ? outputDirectory : System.getProperty("java.io.tmpdir");
			switch (exportType) {
				case PDF:
					JasperExportManager.exportReportToPdfFile(jasperPrint, fullyClassifiedFileName);
					return fullyClassifiedFileName;

				case DOCX:
					return null;

				case ODT:
					return null;

				case XLS:
					return null;

				default:
					throw new ReportEngineException("Error occurred while exporting report to '" + exportType.toString() + "', Error - Export Type not supported");
			}
		} catch (JRException jrException) {
			throw new ReportEngineException("Error occurred while exporting report to '" + exportType.toString() + "', Error", jrException);
		}
	}

    /**
     * Gets the output directory.
     *
     * @return the output directory
     */
    public String getOutputDirectory() {
        return outputDirectory;
    }

}
