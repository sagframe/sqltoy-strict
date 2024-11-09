/**
 * 
 */
package com.strict.modules.system;

import org.junit.jupiter.api.Test;
import org.sagacity.sqltoy.dao.LightDao;
import org.sagacity.sqltoy.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.fastjson2.JSON;
import com.strict.modules.system.entity.StaffInfo;
import com.strict.modules.system.service.StaffInfoService;
import com.strict.modules.system.vo.StaffInfoVO;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhongxuchen
 * @version v1.0, Date:2020-10-9
 * @modify 2020-10-9,修改说明
 */
@SpringBootTest
public class StaffInfoServiceTest {
	@Autowired
	StaffInfoService staffInfoService;

	@Autowired
	LightDao lightDao;

	/**
	 * @TODO 通过保存机构演示节点路径、节点等级、是否叶子节点等数据的生成
	 */
	@Test
	public void testSearch() {
		StaffInfoVO staffInfoVO = new StaffInfoVO().setStaffName("陈");
		Page result = staffInfoService.page(new Page(), staffInfoVO);
		System.err.println(JSON.toJSONString(result));
	}

	@Test
	public void testLoad() {
		StaffInfo staff = lightDao.load(new StaffInfo("S0001"));
		System.err.println(JSON.toJSONString(staff));
	}
}
