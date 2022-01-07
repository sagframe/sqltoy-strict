package com.strict.framework.validate;

/**
 * @project sagacity-core
 * @description 提供统一的验证抽象类
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public abstract class AbstractValify {
	/**
	 * 验证错误消息
	 */
	protected String message;

	/**
	 * 正则表达式
	 */
	protected String regex;

	/**
	 * 需要验证的数据
	 */
	protected Object[] values;

	/**
	 * 循环校验处理器
	 */
	protected ForeachHandler foreachHandler;

	/**
	 * @TODO 执行验证
	 * @return
	 */
	public abstract ValidateResult validate();
}
