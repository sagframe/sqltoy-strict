package com.strict.framework.validate.impl;

import org.sagacity.sqltoy.utils.StringUtil;

import com.strict.framework.validate.AbstractValify;
import com.strict.framework.validate.ValidateResult;

/**
 * @project sagacity-core
 * @description 验证参数值是否为空、null和空集合
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class NotEmpty extends AbstractValify {
	public NotEmpty(Object... values) {
		this.values = values;
		this.message = "参数值不能为空、null!";
	}

	public NotEmpty tips(String message) {
		if (StringUtil.isNotBlank(message)) {
			this.message = message;
		}
		return this;
	}

	@Override
	public ValidateResult validate() {
		ValidateResult result = new ValidateResult();
		try {
			for (Object value : this.values) {
				if (StringUtil.isBlank(value)) {
					result.setSuccess(false);
					result.setMessage(this.message);
					break;
				}
			}
		} catch (NullPointerException e) {
			result.setSuccess(false);
			result.setMessage(this.message);
		}
		return result;
	}

}
