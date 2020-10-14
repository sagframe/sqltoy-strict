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
 * @description 请在此说明类的功能
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
	 * @TODO 通过保存机构演示节点路径、节点等级、是否叶子节点等数据的生成
	 */
	@Test
	public void testGetDictByType() {
		List<DictDetailVO> result = dictDetailService.getDictByType(DictTypes.ORDER_STATUS);
		for (DictDetailVO dict : result) {
			System.err.println(JSON.toJSONString(dict));
		}
	}
}
