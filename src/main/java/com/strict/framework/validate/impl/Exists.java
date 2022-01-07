/**
 * 
 */
package com.strict.framework.validate.impl;

import org.sagacity.sqltoy.utils.StringUtil;

import com.strict.framework.validate.AbstractValify;
import com.strict.framework.validate.ValidateResult;

/**
 * @project sagacity-core
 * @description 判断参数是否在给定范围内
 * @author zhongxuchen
 * @version 1.0, Date:2021-3-25
 * @update 2021-3-25,zhong,修改说明
 */
public class Exists extends AbstractValify {
	private Object value;

	private Object[] scopeValues;

	public Exists(Object value, Object[] scopeValues) {
		this.value = value;
		this.scopeValues = scopeValues;
		this.message = "参数值不在给定的范围内";
	}

	@Override
	public ValidateResult validate() {
		ValidateResult result = new ValidateResult();
		result.setSuccess(false);
		result.setMessage(message);
		if (value == null || scopeValues == null) {
			return result;
		}
		// 只要有一个存在即表示正确
		for (Object val : scopeValues) {
			if (value.equals(val)) {
				result.setSuccess(true);
				result.setMessage(null);
				break;
			}
		}
		return result;
	}

	public Exists tips(String message) {
		if (StringUtil.isNotBlank(message)) {
			this.message = message;
		}
		return this;
	}
}
