/**
 * 
 */
package com.strict.framework.model;

import java.io.Serializable;

/**
 * @project sqltoy-strict
 * @description 提供一个统一的返回结果对象(一般打包到公司级框架中,这里只是演示)
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
public class Result<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -316607953346586682L;

	/**
	 * 返回码
	 */
	private String code;

	/**
	 * 返回消息
	 */
	private String message;

	/**
	 * 返回内容体
	 */
	private T data;

	public Result() {

	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public Result<T> setCode(String code) {
		this.code = code;
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
