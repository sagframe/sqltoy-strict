/**
 * 
 */
package com.strict.modules.system.service;

import org.sagacity.sqltoy.model.Page;

import com.strict.modules.system.vo.OrganInfoVO;

/**
 * @project sqltoy-strict
 * @description 机构信息维护
 * @author zhong
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
public interface OrganInfoService {
	/**
	 * @TODO 新增机构
	 * @param organInfoVO
	 */
	public void save(OrganInfoVO organInfoVO);

	/**
	 * @TODO 分页查询机构
	 * @param page
	 * @param organInfoVO
	 * @return
	 */
	public Page<OrganInfoVO> search(Page page, OrganInfoVO organInfoVO);
}
