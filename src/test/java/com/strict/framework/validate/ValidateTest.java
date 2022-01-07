/**
 * 
 */
package com.strict.framework.validate;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.strict.framework.validate.vo.StaffInfoVO;
import com.strict.framework.validate.vo.TeamInfoVO;

/**
 * @project sagacity-core
 * @description 验证器测试类
 * @author zhongxuchen
 * @version 1.0, Date:2021-1-28
 * @update 2021-1-28,zhong,修改说明
 */
public class ValidateTest {
	/**
	 * 简单参数验证
	 */
	@Test
	public void testValidate() {
		String errorMessage = "";
		// 异常抛错模式
		try {
			// 验证简单参数验证
			Validator.create().idCard("身份证格式不正确", "45988").mail("员工邮箱格式不正确", "chenrf@gmail.com").run();
		} catch (Exception e) {
			errorMessage = e.getMessage();
		}
		System.err.println(errorMessage);
	}

	/**
	 * 简单参数+集合 混合验证
	 */
	@Test
	public void testIterator() {
		List<StaffInfoVO> staffInfoVOs = new ArrayList<StaffInfoVO>();
		StaffInfoVO staff1 = new StaffInfoVO();
		staff1.setStaffId("S001");
		staff1.setStaffName("张三");
		staff1.setMobile("13988889999");
		staffInfoVOs.add(staff1);
		StaffInfoVO staff2 = new StaffInfoVO();
		staff2.setStaffId("S002");
		staff2.setStaffName("李四");
		staff2.setEmail("lisi@sohu");
		staff2.setMobile("13988889999");
		staffInfoVOs.add(staff2);

		String errorMessage = "";
		// 异常抛错模式
		try {
			// 验证:简单参数+集合
			Validator.create()
					//设置全局提示(可选)
			        .tips("员工信息保存发生异常!")
			        //开始验证，格式统一为:check(String errMsg,Object...values),可以对多个参数进行验证
			        //邮件,还包括idCard、telNo等常用
			        .mail("邮箱格式不正确", "chenrf@gmail.com")
			        //非空验证
					.notEmpty("员工信息不能为空", staffInfoVOs)
					//正则表达式验证
					.regex("格式不正确", RegexTypes.MOBILE, "13988889999")
					//通用性验证
					.bool("批量保存记录长度必须大于等于2", staffInfoVOs.size()>=2)
					//针对集合校验
					.foreach(staffInfoVOs, (vo, builder) -> {
						//可以多个参数验证
						builder.notEmpty("员工id、姓名不能为空!", vo.getStaffId(), vo.getStaffName()).mail("员工邮箱格式不正确!",
								vo.getEmail());
					})
					//run表示执行验证
					.run();
		} catch (Exception e) {
			errorMessage = e.getMessage();
		}
		System.err.println(errorMessage);
	}

	/**
	 * 简单参数+集合+集合下面嵌套集合
	 */
	@Test
	public void testDeeplyIterator() {
		List<StaffInfoVO> vos = new ArrayList<StaffInfoVO>();
		StaffInfoVO staff1 = new StaffInfoVO();
		staff1.setStaffId("S001");
		staff1.setStaffName("张三");
		staff1.setMobile("13988889999");
		List<TeamInfoVO> teamInfos = new ArrayList<TeamInfoVO>();
		TeamInfoVO teamInfo = new TeamInfoVO();
		teamInfo.setStaffId("S001");
		teamInfo.setTeamId("T001");
		teamInfo.setTeamName("测试组");
		teamInfos.add(teamInfo);
		TeamInfoVO teamInfo1 = new TeamInfoVO();
		teamInfo1.setStaffId("S001");
		teamInfo1.setTeamId("T002");
		teamInfo1.setTeamName("开发组");
		teamInfos.add(teamInfo1);
		staff1.setTeamInfoVOs(teamInfos);
		vos.add(staff1);
		StaffInfoVO staff2 = new StaffInfoVO();
		staff2.setStaffId("S002");
		staff2.setStaffName("李四");
		staff2.setEmail("lisi@sohu.com");
		staff2.setMobile("13988889999");
		List<TeamInfoVO> teamInfos1 = new ArrayList<TeamInfoVO>();
		TeamInfoVO teamInfo2 = new TeamInfoVO();
		teamInfo2.setStaffId("S002");
		teamInfo2.setTeamId("T001");
		teamInfo2.setTeamName("测试组");
		teamInfos1.add(teamInfo2);
		TeamInfoVO teamInfo3 = new TeamInfoVO();
		teamInfo3.setStaffId("S001");
		// teamInfo3.setTeamId("T002");
		teamInfo3.setTeamName("开发组");
		teamInfos1.add(teamInfo3);
		staff2.setTeamInfoVOs(teamInfos1);
		vos.add(staff2);

		String errorMessage = "";
		// 异常抛错模式
		try {
			// 演示:简单参数验证+集合+集合嵌套
			Validator.create().mail("员工邮箱格式不正确", "chenrf@gmail.com").foreach(vos, (vo, builder) -> {
				builder.notEmpty("员工id不能为空", vo.getStaffId(), vo.getStaffName()).mail("", vo.getEmail())
						.foreach(vo.getTeamInfoVOs(), (vo1, builder1) -> {
							builder1.notEmpty("员工技能组不能为空", vo1.getTeamId());
						});
			}).run();
		} catch (Exception e) {
			errorMessage = e.getMessage();
		}
		System.err.println(errorMessage);
	}
}
