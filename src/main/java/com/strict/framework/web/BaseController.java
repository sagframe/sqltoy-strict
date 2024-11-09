/**
 * 
 */
package com.strict.framework.web;

import org.sagacity.sqltoy.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.strict.framework.model.Result;
import com.strict.framework.model.ResultCode;

/**
 * @project sqltoy-strict
 * @description 演示公司级框架提供web基础类，便于在其中进行扩展提供web层常用工具封装
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
public class BaseController {
	protected final Logger logger = LoggerFactory.getLogger(BaseController.class);

	// 提供常用词
	// 功能主页
	protected final String MAIN = "main";
	// 新增页面
	protected final String ADD = "add";
	// 编辑页面
	protected final String EDIT = "edit";

	// 信息查询展示页面
	protected final String VIEW = "view";
	// 判断唯一性
	protected final String ISUNIQUE = "isUnique";
	// 查询
	protected final String SEARCH = "search";
	// 删除
	protected final String DELETE = "delete";

	/**
	 * @TODO 操作成功
	 * @param <T>
	 * @param data
	 * @return
	 */
	protected <T> Result<T> success(T data) {
		return new Result<T>().setMessage("成功").setCode(ResultCode.SUCCESS).setData(data);
	}

	/**
	 * @TODO 操作失败
	 * @param <T>
	 * @param errorMsg
	 * @param args
	 * @return
	 */
	protected <T> Result<T> failure(String errorMsg, Object... args) {
		return new Result<T>().setMessage(StringUtil.fillArgs(errorMsg, args)).setCode(ResultCode.ERROR);
	}
}
