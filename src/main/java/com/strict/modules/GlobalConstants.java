/**
 * 
 */
package com.strict.modules;

/**
 * @project sqltoy-strict
 * @description 用来统一定义系统常量，避免在代码中硬编码，导致无法统一管理和变更
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
public class GlobalConstants {
	// 定义状态常量
	public interface Status {
		/**
		 * 生效、启用
		 */
		public int ENABLED = 1;

		/**
		 * 停用、无效
		 */
		public int DISABLED = 0;
	}

	public interface DictTypes {
		/**
		 * 订单状态
		 */
		public String ORDER_STATUS = "ORDER_STATUS";
	}
}
