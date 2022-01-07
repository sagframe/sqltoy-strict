package com.strict.framework.validate;

/**
 * @project sagacity-core
 * @description 集合验证处理器
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
@FunctionalInterface
public interface ForeachHandler<T> {
	public void foreach(T obj, Validator builder);
}
