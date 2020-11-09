/**
 * 
 */
package com.strict.modules.system;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.sagacity.sqltoy.model.PaginationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.alibaba.fastjson.JSON;
import com.strict.StrictApplication;
import com.strict.modules.system.service.StaffInfoService;
import com.strict.modules.system.vo.StaffInfoVO;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhongxuchen
 * @version v1.0, Date:2020-10-9
 * @modify 2020-10-9,修改说明
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = StrictApplication.class)
public class StaffInfoServiceTest {
	@Autowired
	StaffInfoService staffInfoService;

	/**
	 * @TODO 通过保存机构演示节点路径、节点等级、是否叶子节点等数据的生成
	 */
	@Test
	public void testSearch() {
		StaffInfoVO staffInfoVO = new StaffInfoVO().setStaffName("陈");
		PaginationModel result = staffInfoService.page(new PaginationModel(), staffInfoVO);
		System.err.println(JSON.toJSONString(result));
	}
}
