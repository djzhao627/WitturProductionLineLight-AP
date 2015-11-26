/**
 * 
 */
package com.lewei.model;

/**
 * 预警信息模型
 * 
 * @author djzhao
 * @time 2015年11月3日
 */
public class WarningInfo {

	/** 预警信息ID */
	private int InfoID;

	/** 预警内容 */
	private String Content;
	
	/** 产线ID，-1表示所有线别 */
	private int LineID;

	/** 状态标识（默认1） */
	private int Status;

	/**
	 * @return the infoID
	 */
	public int getInfoID() {
		return InfoID;
	}

	/**
	 * @param infoID
	 *            the infoID to set
	 */
	public void setInfoID(int infoID) {
		InfoID = infoID;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return Content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		Content = content;
	}

	/**
	 * @return the lineID
	 */
	public int getLineID() {
		return LineID;
	}

	/**
	 * @param lineID the lineID to set
	 */
	public void setLineID(int lineID) {
		LineID = lineID;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return Status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		Status = status;
	}
}
