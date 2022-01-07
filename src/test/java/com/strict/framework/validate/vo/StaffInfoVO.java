/**
 * 
 */
package com.strict.framework.validate.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @project sagacity-core
 * @description 请在此说明类的功能
 * @author zhong
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class StaffInfoVO implements Serializable {
	private String staffId;

	private String staffName;

	private String email;

	private String organId;

	private String mobile;

	private List<TeamInfoVO> teamInfoVOs;

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
	 * @return the staffName
	 */
	public String getStaffName() {
		return staffName;
	}

	/**
	 * @param staffName the staffName to set
	 */
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the organId
	 */
	public String getOrganId() {
		return organId;
	}

	/**
	 * @param organId the organId to set
	 */
	public void setOrganId(String organId) {
		this.organId = organId;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the teamInfoVOs
	 */
	public List<TeamInfoVO> getTeamInfoVOs() {
		return teamInfoVOs;
	}

	/**
	 * @param teamInfoVOs the teamInfoVOs to set
	 */
	public void setTeamInfoVOs(List<TeamInfoVO> teamInfoVOs) {
		this.teamInfoVOs = teamInfoVOs;
	}

}
