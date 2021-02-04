/**
 * 
 */
package com.strict.modules.sagacity;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.alibaba.fastjson.JSON;
import com.strict.StrictApplication;
import com.strict.modules.GlobalConstants.DictTypes;
import com.strict.modules.sagacity.service.DictDetailService;
import com.strict.modules.sagacity.vo.DictDetailVO;

/**
 * @project sqltoy-strict
 * @description 测试基于service的调用
 * @author zhong
 * @version v1.0, Date:2020-10-14
 * @modify 2020-10-14,修改说明
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = StrictApplication.class)
public class DictDetailServiceTest {
	@Autowired
	DictDetailService dictDetailService;

	/**
	 * @TODO 测试获取字典明细数据，演示service、dao完整通路效果
	 */
	@Test
	public void testGetDictByType() {
		List<DictDetailVO> result = dictDetailService.getDictByType(DictTypes.ORDER_STATUS);
		for (DictDetailVO dict : result) {
			System.err.println(JSON.toJSONString(dict));
		}
	}
}
