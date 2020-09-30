/**
 * 
 */
package com.strict.framework.model;

import java.io.Serializable;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhong
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
public class Result<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -316607953346586682L;

	private String resultCode;

	private String message;

	private T data;

	public Result() {

	}

	/**
	 * @return the resultCode
	 */
	public String getResultCode() {
		return resultCode;
	}

	/**
	 * @param resultCode the resultCode to set
	 */
	public Result<T> setResultCode(String resultCode) {
		this.resultCode = resultCode;
		return this;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public Result<T> setMessage(String message) {
		this.message = message;
		return this;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public Result<T> setData(T data) {
		this.data = data;
		return this;
	}

}
