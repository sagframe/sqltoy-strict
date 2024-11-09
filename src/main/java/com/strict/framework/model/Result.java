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
	 * 处理状态（true:成功、false：失败）
	 */
	private boolean success;

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

	public Result<T> success(boolean success) {
		this.success = success;
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

	public boolean isSuccess() {
		return success;
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

	public static Result error(String code, String message) {
		return new Result().setCode(code).success(false).setMessage(message);
	}

	public static <T> Result success(T data) {
		Result<T> result = new Result<T>();
		result.setData(data);
		result.success(true);
		result.setCode(ResultCode.SUCCESS);
		return result;
	}
}
