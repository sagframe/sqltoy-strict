/**
 * 
 */
package com.strict.modules.system.web;

import org.sagacity.sqltoy.model.PaginationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.strict.framework.model.Result;
import com.strict.framework.web.BaseController;
import com.strict.modules.system.service.StaffInfoService;
import com.strict.modules.system.vo.StaffInfoVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhong
 * @version v1.0, Date:2020-10-9
 * @modify 2020-10-9,修改说明
 */
@Api(tags = "员工信息维护和查询")
@RestController
@RequestMapping("/system/staffInfo")
public class StaffInfoController extends BaseController {
	@Autowired
	private StaffInfoService staffInfoService;

	@ApiOperation("分页查询员工信息")
	@RequestMapping(path = SEARCH, method = RequestMethod.POST)
	public Result save(@RequestBody PaginationModel pageModel, @RequestBody StaffInfoVO staffInfoVO) {
		try {
			PaginationModel<StaffInfoVO> result = staffInfoService.page(pageModel, staffInfoVO);
			return super.success(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.failure("分页查询员工信息异常，错误信息!");
	}
}
