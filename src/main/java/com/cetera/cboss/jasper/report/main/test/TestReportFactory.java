package com.cetera.cboss.jasper.report.main.test;

import java.util.ArrayList;
import java.util.List;

/**
 * A factory for creating TestReport objects.
 */
public class TestReportFactory {

	/**
	 * Fetch task GDC report details.
	 *
	 * @return the list
	 */
	public static List<TaskGDCReportDetail> fetchTaskGDCReportDetails() {
		final List<TaskGDCReportDetail> taskGDCReportDetails = new ArrayList<>();

		final TaskGDCReportDetail taskGDCReportDetail = new TaskGDCReportDetail();
		taskGDCReportDetail.setCoordinatorName("Dishant Anand");
		taskGDCReportDetail.setNumberOfTasks(2);
		taskGDCReportDetail.setTotalGDC(20.00);
		taskGDCReportDetails.add(taskGDCReportDetail);

		final TaskGDCReportDetail taskGDCReportDetail1 = new TaskGDCReportDetail();
		taskGDCReportDetail1.setCoordinatorName("Tajinder Singh");
		taskGDCReportDetail1.setNumberOfTasks(10);
		taskGDCReportDetail1.setTotalGDC(120.00);
		taskGDCReportDetails.add(taskGDCReportDetail1);

		final TaskGDCReportDetail taskGDCReportDetail2 = new TaskGDCReportDetail();
		taskGDCReportDetail2.setCoordinatorName("Anand Kumar");
		taskGDCReportDetail2.setNumberOfTasks(10);
		taskGDCReportDetail2.setTotalGDC(110.00);
		taskGDCReportDetails.add(taskGDCReportDetail2);

		final TaskGDCReportDetail taskGDCReportDetail3 = new TaskGDCReportDetail();
		taskGDCReportDetail3.setCoordinatorName("Manish Tomar");
		taskGDCReportDetail3.setNumberOfTasks(12);
		taskGDCReportDetail3.setTotalGDC(420.00);
		taskGDCReportDetails.add(taskGDCReportDetail3);

		return taskGDCReportDetails;
	}

}
