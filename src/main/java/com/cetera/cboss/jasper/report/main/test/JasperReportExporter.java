package com.cetera.cboss.jasper.report.main.test;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;

import com.cetera.cboss.jasper.report.core.ReportEngineCore;
import com.cetera.cboss.jasper.report.core.exception.ReportEngineException;
import com.cetera.cboss.jasper.report.ds.loader.exception.TemplateLoaderException;
import com.cetera.cboss.jasper.report.ds.loader.impl.ClasspathTemplateLoader;
import com.cetera.cboss.jasper.report.ds.loader.impl.ReportBeanDSLoader;
import com.cetera.cboss.jasper.report.exporter.ReportTemplateExporter;
import com.cetera.cboss.jasper.report.factory.ReportDSFactory;
import com.cetera.cboss.jasper.report.factory.ReportTemplateExporterFactory;
import com.cetera.cboss.jasper.report.factory.TemplateLoaderFactory;
import com.cetera.cboss.report.ds.constant.ExportType;
import com.cetera.cboss.report.ds.vo.LoadTemplateRequest;

/**
 * The Class JasperReportExporter.
 */
public class JasperReportExporter {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws ReportEngineException the report engine exception
	 * @throws FileNotFoundException the file not found exception
	 * @throws TemplateLoaderException the template loader exception
	 */
	public static void main(final String args[]) throws ReportEngineException, FileNotFoundException, TemplateLoaderException {

		final LoadTemplateRequest loadTemplateRequest = new LoadTemplateRequest("task_gdc_report.jrxml", "C://Users//dishant.anand//spring-rnd//jasper-report-helper//src//main//resources//",
		        new HashMap<>());

		// Plug in the template loader to load the template.
		final ClasspathTemplateLoader classpathTemplateLoader = new ClasspathTemplateLoader(loadTemplateRequest);
		final TemplateLoaderFactory templateLoaderFactory = new TemplateLoaderFactory();
		templateLoaderFactory.initializeTemplateLoader(classpathTemplateLoader);

		// Plug in the template exporter to export to various formats.
		final ReportTemplateExporterFactory reportTemplateExporterFactory = new ReportTemplateExporterFactory();
		reportTemplateExporterFactory.initializeReportExporter(new ReportTemplateExporter());

		// Plug in the report DS to fetch the report details that needs to be
		// filled in the report.
		final ReportDSFactory<TaskGDCReportDetail> reportDSFactory = new ReportDSFactory<TaskGDCReportDetail>();
		final List<TaskGDCReportDetail> taskGDCReportDetails = TestReportFactory.fetchTaskGDCReportDetails();
		final ReportBeanDSLoader reportBeanDSLoader = new ReportBeanDSLoader(taskGDCReportDetails);
		reportDSFactory.initializeReportDSFactory(reportBeanDSLoader);

		final ReportEngineCore reportEngineCore = new ReportEngineCore(reportTemplateExporterFactory, reportDSFactory, templateLoaderFactory);

		final OutputStream[] outputStreams = reportEngineCore.generateReportOutput(ExportType.PDF);

		System.out.println(outputStreams);
	}

}
