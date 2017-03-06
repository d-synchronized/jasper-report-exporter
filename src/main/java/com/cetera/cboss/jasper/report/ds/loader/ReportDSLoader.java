package com.cetera.cboss.jasper.report.ds.loader;

import java.util.List;

import com.cetera.cboss.report.ds.vo.BaseReportVO;

import net.sf.jasperreports.engine.JRDataSource;

/**
 * The Class ReportDSLoader.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 *
 * @param <ReportTemplateData>
 *            the generic type
 */
public abstract class ReportDSLoader<ReportTemplateData extends BaseReportVO> {

    /** The report template data. */
    public List<ReportTemplateData> reportTemplateData;

    /**
     * Instantiates a new report DS loader.
     *
     * @param reportTemplateData
     *            the report template data
     */
    protected ReportDSLoader(final List<ReportTemplateData> reportTemplateData) {
        this.reportTemplateData = reportTemplateData;
    }

    /**
     * Load report datasource.
     *
     * @return the JR data source
     */
    public abstract JRDataSource loadReportDatasource();

}
