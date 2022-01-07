package com.strict.framework.validate.impl;

import java.util.List;

import com.strict.framework.validate.AbstractValify;
import com.strict.framework.validate.ForeachHandler;
import com.strict.framework.validate.ValidateResult;

/**
 * @project sagacity-core
 * @description 集合内部属性验证
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class Foreach extends AbstractValify {
	public <T> Foreach(List<T> list, ForeachHandler<T> foreachHandler) {
		this.values = new Object[] { list };
		this.foreachHandler = foreachHandler;
	}

	// 循环处理无需执行validate
	@Override
	public ValidateResult validate() {
		return new ValidateResult();
	}

}
