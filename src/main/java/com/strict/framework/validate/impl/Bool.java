package com.strict.framework.validate.impl;

import org.sagacity.sqltoy.utils.StringUtil;

import com.strict.framework.validate.AbstractValify;
import com.strict.framework.validate.ValidateResult;

/**
 * @project sagacity-core
 * @description 逻辑验证器
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class Bool extends AbstractValify {
	public Bool(Boolean logic) {
		this.values = new Boolean[] { logic };
		this.message = "参数非法";
	}

	public Bool tips(String message) {
		if (StringUtil.isNotBlank(message)) {
			this.message = message;
		}
		return this;
	}

	@Override
	public ValidateResult validate() {
		ValidateResult result = new ValidateResult();
		for (Object val : values) {
			if (!(Boolean) val) {
				result.setSuccess(false);
				result.setMessage(message);
				break;
			}
		}
		return result;
	}

}
