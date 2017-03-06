package com.cetera.cboss.jasper.report.main.test;

import com.cetera.cboss.report.ds.vo.BaseReportVO;

/**
 * The Class TaskGDCReportDetail.
 * 
 * @author <a href="mailto:d.synchronized@gmail.com">Dishant Anand</a>
 */
public class TaskGDCReportDetail extends BaseReportVO {

	/** The coordinator name. */
	private String coordinatorName;

	/** The number of tasks. */
	private int numberOfTasks;

	/** The total GDC. */
	private double totalGDC;

	/**
	 * Gets the coordinator name.
	 *
	 * @return the coordinator name
	 */
	public String getCoordinatorName() {
		return coordinatorName;
	}

	/**
	 * Sets the coordinator name.
	 *
	 * @param coordinatorName the new coordinator name
	 */
	public void setCoordinatorName(String coordinatorName) {
		this.coordinatorName = coordinatorName;
	}

	/**
	 * Gets the number of tasks.
	 *
	 * @return the number of tasks
	 */
	public int getNumberOfTasks() {
		return numberOfTasks;
	}

	/**
	 * Sets the number of tasks.
	 *
	 * @param numberOfTasks the new number of tasks
	 */
	public void setNumberOfTasks(int numberOfTasks) {
		this.numberOfTasks = numberOfTasks;
	}

	/**
	 * Gets the total GDC.
	 *
	 * @return the total GDC
	 */
	public double getTotalGDC() {
		return totalGDC;
	}

	/**
	 * Sets the total GDC.
	 *
	 * @param totalGDC the new total GDC
	 */
	public void setTotalGDC(double totalGDC) {
		this.totalGDC = totalGDC;
	}

}
