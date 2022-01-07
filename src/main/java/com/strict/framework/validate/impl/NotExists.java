/**
 * 
 */
package com.strict.framework.validate.impl;

import org.sagacity.sqltoy.utils.StringUtil;

import com.strict.framework.validate.AbstractValify;
import com.strict.framework.validate.ValidateResult;

/**
 * @project sagacity-core
 * @description 验证参数不在数组范围内
 * @author zhongxuchen
 * @version 1.0, Date:2021-3-25
 * @update 2021-3-25,zhong,修改说明
 */
public class NotExists extends AbstractValify {

	private Object value;

	private Object[] scopeValues;

	public NotExists(Object value, Object[] scopeValues) {
		this.value = value;
		this.scopeValues = scopeValues;
		this.message = "参数值非法";
	}

	@Override
	public ValidateResult validate() {
		ValidateResult result = new ValidateResult();
		if (value == null || scopeValues == null) {
			result.setSuccess(false);
			result.setMessage(message);
			return result;
		}
		// 只要有一个存在即表示错误
		for (Object val : scopeValues) {
			if (value.equals(val)) {
				result.setSuccess(false);
				result.setMessage(message);
				break;
			}
		}
		return result;
	}

	public NotExists tips(String message) {
		if (StringUtil.isNotBlank(message)) {
			this.message = message;
		}
		return this;
	}

}
