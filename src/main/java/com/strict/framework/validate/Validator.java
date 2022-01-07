package com.strict.framework.validate;

import java.util.ArrayList;
import java.util.List;

import org.sagacity.sqltoy.utils.StringUtil;

import com.strict.framework.validate.impl.Bool;
import com.strict.framework.validate.impl.Exists;
import com.strict.framework.validate.impl.Foreach;
import com.strict.framework.validate.impl.NotEmpty;
import com.strict.framework.validate.impl.NotExists;
import com.strict.framework.validate.impl.Regex;

/**
 * @project sagacity-core
 * @description 验证构造器
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class Validator {
	/**
	 * 记录验证器
	 */
	private List<AbstractValify> validates = new ArrayList<AbstractValify>();

	/**
	 * 全局消息提醒
	 */
	private String globalTips;

	public static Validator create() {
		return new Validator();
	}

	/**
	 * @TODO 设置全局提示
	 * @param globalTips
	 * @return
	 */
	public Validator tips(String globalTips) {
		this.globalTips = globalTips;
		return this;
	}

	/**
	 * @TODO 邮件认证
	 * @param message
	 * @param mails
	 * @return
	 */
	public Validator mail(String message, String... mails) {
		validates.add(new Regex(RegexTypes.MAIL, mails).tips(message));
		return this;
	}

	/**
	 * @TODO 身份证认证
	 * @param message
	 * @param ids
	 * @return
	 */
	public Validator idCard(String message, String... ids) {
		validates.add(new Regex(RegexTypes.ID, ids).tips(message));
		return this;
	}

	/**
	 * @TODO 手机号码
	 * @param message
	 * @param mobileNo
	 * @return
	 */
	public Validator mobile(String message, String... mobileNo) {
		validates.add(new Regex(RegexTypes.MOBILE, mobileNo).tips(message));
		return this;
	}

	/**
	 * @TODO 电话号码
	 * @param message
	 * @param telNo
	 * @return
	 */
	public Validator telNo(String message, String... telNo) {
		validates.add(new Regex(RegexTypes.TEL, telNo).tips(message));
		return this;
	}

	/**
	 * @TODO 逻辑校验
	 * @param message
	 * @param logic
	 * @return
	 */
	public Validator bool(String message, boolean logic) {
		validates.add(new Bool(logic).tips(message));
		return this;
	}

	/**
	 * @TODO 判断值是否在给定的数组范围内
	 * @param message
	 * @param value
	 * @param scopeValues
	 * @return
	 */
	public Validator in(String message, Object value, Object[] scopeValues) {
		validates.add(new Exists(value, scopeValues).tips(message));
		return this;
	}

	/**
	 * @TODO 判断值是否不在给定范围数据中
	 * @param message
	 * @param value
	 * @param scopeValues
	 * @return
	 */
	public Validator notIn(String message, Object value, Object[] scopeValues) {
		validates.add(new NotExists(value, scopeValues).tips(message));
		return this;
	}

	/**
	 * @TODO 非空
	 * @param message
	 * @param values
	 * @return
	 */
	public Validator notEmpty(String message, Object... values) {
		validates.add(new NotEmpty(values).tips(message));
		return this;
	}

	/**
	 * @TODO 正则表达式校验
	 * @param message
	 * @param regex
	 * @param values
	 * @return
	 */
	public Validator regex(String message, String regex, String... values) {
		validates.add(new Regex(regex, values).tips(message));
		return this;
	}

	/**
	 * @TODO 集合内部属性验证
	 * @param <T>
	 * @param items
	 * @param foreachHandler
	 * @return
	 */
	public <T> Validator foreach(List<T> items, ForeachHandler<T> foreachHandler) {
		validates.add(new Foreach(items, foreachHandler));
		return this;
	}

	/**
	 * @TODO 验证执行
	 * @throws IllegalArgumentException
	 */
	public void run() throws IllegalArgumentException {
		if (validates.isEmpty()) {
			return;
		}
		StringBuilder errorMsg = new StringBuilder();
		ValidateResult result;
		boolean success = true;
		ForeachHandler handler;
		List items;
		for (AbstractValify validate : validates) {
			if (validate instanceof Foreach) {
				handler = validate.foreachHandler;
				items = (List) validate.values[0];
				if (items != null && !items.isEmpty()) {
					// 类似于递归执行
					Validator builder = Validator.create();
					for (int j = 0; j < items.size(); j++) {
						handler.foreach(items.get(j), builder);
						builder.run();
					}
				}
			} else {
				// 执行单个验证
				result = validate.validate();
				// 错误组织错误信息
				if (!result.isSuccess()) {
					success = false;
					if (StringUtil.isNotBlank(result.getMessage())) {
						if (errorMsg.length() > 0) {
							errorMsg.append("\n");
						}
						errorMsg.append(result.getMessage());
					}
				}
			}
		}
		// 不正确抛出异常
		if (!success) {
			String message = errorMsg.toString();
			// 组合全局错误提示
			if (StringUtil.isNotBlank(globalTips)) {
				message = globalTips.concat(message);
			}
			throw new IllegalArgumentException(StringUtil.isBlank(message) ? "请求参数不合法请检查!" : message);
		}
	}
}
