/**
 * 
 */
package com.strict.framework.validate;

import java.io.Serializable;

/**
 * @project sagacity-core
 * @description 验证结果对象
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class ValidateResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2248830761953035400L;

	/**
	 * 错误信息
	 */
	private String message;

	/**
	 * 验证结果
	 */
	private boolean success = true;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

}
