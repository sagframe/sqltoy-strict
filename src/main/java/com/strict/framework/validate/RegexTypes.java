package com.strict.framework.validate;

/**
 * @project sagacity-core
 * @description 验证器常量定义
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class RegexTypes {

	// 邮件
	public final static String MAIL = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
	// 电话
	public final static String TEL = "^(\\(\\d{3,4}-)|\\d{3,4}-)?\\d{7,8}$";

	// 手机号码
	public final static String MOBILE = "^1[1-9][0-9]\\d{8}$";

	// 整数
	public final static String INT = "^\\-?[0-9]*";
	// 数字
	public final static String NUMBER = "^\\-?[0-9]*\\.?[0-9]*";
	// 身份证
	public final static String ID = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";

	// 非中文
	public final static String UNCHINA = "^\\w+$";
	// 全字母
	public final static String CHARS = "^[A-Za-z]+$";

	// 数字和字母
	public final static String NUMCHARS = "^[A-Za-z0-9]+$";
}
