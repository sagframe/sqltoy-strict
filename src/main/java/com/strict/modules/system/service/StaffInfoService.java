/**
 * 
 */
package com.strict.modules.system.service;

import org.sagacity.sqltoy.model.PaginationModel;

import com.strict.modules.system.vo.StaffInfoVO;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhong
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
public interface StaffInfoService {
	public PaginationModel<StaffInfoVO> page(PaginationModel pageModel, StaffInfoVO staffInfoVO);
}
