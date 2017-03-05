package com.cetera.cboss.jasper.report.ds.loader.impl;

import java.util.List;

import com.cetera.cboss.jasper.report.ds.loader.ReportDSLoader;
import com.cetera.cboss.jasper.report.main.test.TaskGDCReportDetail;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * The Class ReportBeanDSLoader.
 */
public class ReportBeanDSLoader extends ReportDSLoader<TaskGDCReportDetail> {

	/**
	 * Instantiates a new report bean DS loader.
	 *
	 * @param reportTemplateData the report template data
	 */
	public ReportBeanDSLoader(List<TaskGDCReportDetail> reportTemplateData) {
		super(reportTemplateData);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cetera.cboss.jasper.report.ds.loader.ReportDSLoader#
	 * loadReportDatasource()
	 */
	@Override
	public JRDataSource loadReportDatasource() {
		final JRDataSource reportDS = new JRBeanCollectionDataSource(reportTemplateData);
		return reportDS;
	}

}
