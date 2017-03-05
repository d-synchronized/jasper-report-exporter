package com.cetera.cboss.jasper.report.ds.loader;

import java.util.List;

import com.cetera.cboss.report.ds.vo.BaseReportVO;

import net.sf.jasperreports.engine.JRDataSource;

public abstract class ReportDSLoader<ReportTemplateData extends BaseReportVO> {
	
	public List<ReportTemplateData> reportTemplateData;
	
	protected ReportDSLoader(final List<ReportTemplateData> reportTemplateData){
		this.reportTemplateData = reportTemplateData;
	}
	
	public abstract  JRDataSource loadReportDatasource();

}
