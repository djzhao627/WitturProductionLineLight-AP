/**
 * 
 */
package com.lewei.model;

/**
 * Ԥ����Ϣģ��
 * 
 * @author djzhao
 * @time 2015��11��3��
 */
public class WarningInfo {

	/** Ԥ����ϢID */
	private int InfoID;

	/** Ԥ������ */
	private String Content;
	
	/** ����ID��-1��ʾ�����߱� */
	private int LineID;

	/** ״̬��ʶ��Ĭ��1�� */
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
