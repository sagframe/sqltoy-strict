/**
 * 
 */
package com.strict.framework.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.strict.framework.model.Result;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhong
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
public class BaseController {
	protected final Logger logger = LoggerFactory.getLogger(BaseController.class);

	/**
	 * @TODO 操作成功
	 * @param <T>
	 * @param data
	 * @return
	 */
	protected <T> Result<T> success(T data) {
		return new Result<T>().setMessage("成功").setResultCode("1").setData(data);
	}

	/**
	 * @TODO 操作失败
	 * @param <T>
	 * @param errorMsg
	 * @return
	 */
	protected <T> Result<T> failure(String errorMsg) {
		return new Result<T>().setMessage(errorMsg).setResultCode("0");
	}
}
