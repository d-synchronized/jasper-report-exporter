package com.cetera.cboss.jasper.report.ds.loader;

import java.util.List;

import com.cetera.cboss.report.ds.vo.BaseReportVO;

/**
 * The Class JasperDataLoader.
 */
public abstract class JasperDataLoader {

	/**
	 * Fetch report data.
	 *
	 * @param <G> the generic type
	 * @param reportData the report data
	 * @return the list
	 */
	public abstract <G extends BaseReportVO> List<G> fetchReportData(final G reportData);

}
