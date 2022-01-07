package com.strict.framework.validate.impl;

import org.sagacity.sqltoy.utils.StringUtil;

import com.strict.framework.validate.AbstractValify;
import com.strict.framework.validate.RegexTypes;
import com.strict.framework.validate.ValidateResult;

/**
 * @project sagacity-core
 * @description 验证字符串格式是否匹配
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class Regex extends AbstractValify {
	public Regex(String regex, String... values) {
		this.values = values;
		this.message = "输入参数格式不正确!";
		this.regex = regex;
		if (regex.equals(RegexTypes.MAIL)) {
			this.message = "邮箱格式不正确!";
		} else if (regex.equals(RegexTypes.MOBILE)) {
			this.message = "手机号码格式不正确!";
		} else if (regex.equals(RegexTypes.ID)) {
			this.message = "身份证号不正确,正确格式:18位数字!";
		}
	}

	public Regex tips(String message) {
		if (StringUtil.isNotBlank(message)) {
			this.message = message;
		}
		return this;
	}

	@Override
	public ValidateResult validate() {
		ValidateResult result = new ValidateResult();
		for (Object value : this.values) {
			if (value != null && !StringUtil.matches(value.toString(), this.regex)) {
				result.setSuccess(false);
				result.setMessage(StringUtil.fillArgs(this.message, value.toString()));
				break;
			}
		}
		return result;
	}
}
