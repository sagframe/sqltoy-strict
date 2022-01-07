/**
 * 
 */
package com.strict.framework.validate.vo;

import java.io.Serializable;

/**
 * @project sagacity-core
 * @description 请在此说明类的功能
 * @author zhong
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class TeamInfoVO implements Serializable {

	private String staffId;
	private String teamId;

	private String teamName;

	private int status;

	/**
	 * @return the staffId
	 */
	public String getStaffId() {
		return staffId;
	}

	/**
	 * @param staffId the staffId to set
	 */
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	/**
	 * @return the teamId
	 */
	public String getTeamId() {
		return teamId;
	}

	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
