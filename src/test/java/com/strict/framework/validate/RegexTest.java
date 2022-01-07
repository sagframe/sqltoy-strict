/**
 * 
 */
package com.strict.framework.validate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sagacity.sqltoy.utils.StringUtil;

/**
 * @project sagacity-core
 * @description 请在此说明类的功能
 * @author zhong
 * @version 1.0, Date:2021-1-29
 * @update 2021-1-29,zhong,修改说明
 */
public class RegexTest {
	@Test
	public void testIdCard() {
		String id = "321027197904163935";
		Boolean result = StringUtil.matches(id, RegexTypes.ID);
		Assertions.assertEquals(true, result);
	}

	@Test
	public void testEmail() {

	}

	@Test
	public void testMobile() {

	}

	@Test
	public void testTel() {

	}
}
