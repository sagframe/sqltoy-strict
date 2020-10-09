/**
 * 
 */
package com.strict.modules.system;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.strict.StrictApplication;
import com.strict.modules.system.service.OrganInfoService;
import com.strict.modules.system.vo.OrganInfoVO;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhong
 * @version v1.0, Date:2020-10-9
 * @modify 2020-10-9,修改说明
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = StrictApplication.class)
public class OrganInfoServiceTest {
	@Autowired
	OrganInfoService organInfoService;

	/**
	 * @TODO 通过保存机构演示节点路径、节点等级、是否叶子节点等数据的生成
	 */
	@Test
	public void testSaveOrgan() {
		OrganInfoVO organ = new OrganInfoVO();
		organ.setOrganId("100015");
		organ.setOrganCode("100015");
		organ.setOrganPid("100007");
		organ.setOrganName("ERP开发部");
		organ.setStatus(1);
		organInfoService.save(organ);
	}
}
