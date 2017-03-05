package com.cetera.cboss.jasper.report.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import com.cetera.cboss.jasper.report.core.exception.ReportEngineException;
import com.cetera.cboss.jasper.report.ds.loader.ReportDSLoader;
import com.cetera.cboss.jasper.report.ds.loader.exception.TemplateLoaderException;
import com.cetera.cboss.jasper.report.factory.ReportDSFactory;
import com.cetera.cboss.jasper.report.factory.ReportTemplateExporterFactory;
import com.cetera.cboss.jasper.report.factory.TemplateLoaderFactory;
import com.cetera.cboss.report.ds.constant.ExportType;
import com.cetera.cboss.report.ds.vo.BaseReportVO;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 * The Class ReportEngineCore.
 */
public class ReportEngineCore {

	/** The report template exporter factory. */
	private ReportTemplateExporterFactory reportTemplateExporterFactory;

	/** The report DS factory. */
	private ReportDSFactory<? extends BaseReportVO> reportDSFactory;

	/** The template loader factory. */
	private TemplateLoaderFactory templateLoaderFactory;

	/**
	 * Instantiates a new report engine core.
	 *
	 * @param reportTemplateExporterFactory the report template exporter factory
	 * @param reportDSFactory the report DS factory
	 * @param templateLoaderFactory the template loader factory
	 */
	public ReportEngineCore(final ReportTemplateExporterFactory reportTemplateExporterFactory, final ReportDSFactory<? extends BaseReportVO> reportDSFactory,
	        final TemplateLoaderFactory templateLoaderFactory) {
		this.reportTemplateExporterFactory = reportTemplateExporterFactory;
		this.reportDSFactory = reportDSFactory;
		this.templateLoaderFactory = templateLoaderFactory;
	}

	/**
	 * Generate report output.
	 *
	 * @param <ReportVO> the generic type
	 * @param exportTypes the export types
	 * @return the output stream[]
	 * @throws ReportEngineException the report engine exception
	 * @throws TemplateLoaderException the template loader exception
	 */
	public <ReportVO extends BaseReportVO> OutputStream[] generateReportOutput(final ExportType... exportTypes) throws ReportEngineException, TemplateLoaderException {

		final JasperPrint jasperPrint = compileExportReport(templateLoaderFactory.fetchTemplateLoader().loadTemplate());
		final OutputStream[] exportedReportsStream = new OutputStream[exportTypes.length];

		int index = 0;
		for (final ExportType exportType : exportTypes) {
			final OutputStream outputStream = reportTemplateExporterFactory.fetchReportExporter().exportReport(jasperPrint, exportType, "D://exports");
			exportedReportsStream[index] = outputStream;
			index++;
		}
		return exportedReportsStream;
	}

	/**
	 * Compile export report.
	 *
	 * @param <ReportVO> the generic type
	 * @param jrxmlSourceStream the jrxml source stream
	 * @return the jasper print
	 * @throws ReportEngineException the report engine exception
	 * @throws TemplateLoaderException the template loader exception
	 */
	public <ReportVO extends BaseReportVO> JasperPrint compileExportReport(final InputStream jrxmlSourceStream) throws ReportEngineException, TemplateLoaderException {
		final ReportDSLoader<?> reportDSLoader = reportDSFactory.fetchReportDatasource();
		final JRDataSource jrDataSource = reportDSLoader.loadReportDatasource();
		final Map<String, Object> templateParams = this.templateLoaderFactory.fetchTemplateLoader().getLoadTemplateRequest().getTemplateParameters();

		JasperPrint jasperPrint = null;
		try {
			final JasperDesign jasperDesign = JRXmlLoader.load(jrxmlSourceStream);
			final JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			jasperPrint = JasperFillManager.fillReport(jasperReport, templateParams, jrDataSource);
		} catch (final JRException jrException) {
			throw new ReportEngineException("Error occurred while executing the report compilation and output, Error - ", jrException);
		}
		return jasperPrint;
	}

	/**
	 * Gets the report template exporter factory.
	 *
	 * @return the report template exporter factory
	 */
	public ReportTemplateExporterFactory getReportTemplateExporterFactory() {
		return reportTemplateExporterFactory;
	}

	/**
	 * Sets the report template exporter factory.
	 *
	 * @param reportTemplateExporterFactory the new report template exporter factory
	 */
	public void setReportTemplateExporterFactory(ReportTemplateExporterFactory reportTemplateExporterFactory) {
		this.reportTemplateExporterFactory = reportTemplateExporterFactory;
	}

	/**
	 * Gets the report DS factory.
	 *
	 * @return the report DS factory
	 */
	public ReportDSFactory<? extends BaseReportVO> getReportDSFactory() {
		return reportDSFactory;
	}

	/**
	 * Sets the report DS factory.
	 *
	 * @param reportDSFactory the new report DS factory
	 */
	public void setReportDSFactory(ReportDSFactory<? extends BaseReportVO> reportDSFactory) {
		this.reportDSFactory = reportDSFactory;
	}

}
