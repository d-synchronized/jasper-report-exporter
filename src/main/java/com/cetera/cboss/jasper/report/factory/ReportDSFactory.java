package com.cetera.cboss.jasper.report.factory;

import com.cetera.cboss.jasper.report.ds.loader.ReportDSLoader;
import com.cetera.cboss.report.ds.vo.BaseReportVO;

/**
 * A factory for creating ReportDS objects.
 *
 * @param <ReportTemplateData> the generic type
 */
public class ReportDSFactory<ReportTemplateData extends BaseReportVO> {

	/** The report data source. */
	private ReportDSLoader<ReportTemplateData> reportDataSource;

	/**
	 * Initialize report DS factory.
	 *
	 * @param reportDataSource the report data source
	 */
	public void initializeReportDSFactory(final ReportDSLoader<ReportTemplateData> reportDataSource) {
		this.reportDataSource = reportDataSource;
	}

	/**
	 * Fetch report datasource.
	 *
	 * @return the report DS loader
	 */
	public ReportDSLoader<ReportTemplateData> fetchReportDatasource() {
		if (this.reportDataSource == null) {
			throw new RuntimeException("FATAL ERROR : Report Engine Datasource not set.");
		}
		return this.reportDataSource;
	}

}
