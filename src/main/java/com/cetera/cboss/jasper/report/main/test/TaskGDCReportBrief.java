package com.cetera.cboss.jasper.report.main.test;

import java.util.List;

import com.cetera.cboss.report.ds.vo.BaseReportVO;

/**
 * The Class TaskGDCReportBrief.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class TaskGDCReportBrief extends BaseReportVO {

	/** The task GDC report details. */
	private List<TaskGDCReportDetail> taskGDCReportDetails;

	/**
	 * Gets the task GDC report details.
	 *
	 * @return the task GDC report details
	 */
	public List<TaskGDCReportDetail> getTaskGDCReportDetails() {
		return taskGDCReportDetails;
	}

	/**
	 * Sets the task GDC report details.
	 *
	 * @param taskGDCReportDetails the new task GDC report details
	 */
	public void setTaskGDCReportDetails(List<TaskGDCReportDetail> taskGDCReportDetails) {
		this.taskGDCReportDetails = taskGDCReportDetails;
	}

}
