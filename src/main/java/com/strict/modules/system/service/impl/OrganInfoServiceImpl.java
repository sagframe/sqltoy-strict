/**
 * 
 */
package com.strict.modules.system.service.impl;

import org.sagacity.sqltoy.dao.SqlToyLazyDao;
import org.sagacity.sqltoy.model.PaginationModel;
import org.sagacity.sqltoy.model.TreeTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.strict.modules.system.entity.OrganInfo;
import com.strict.modules.system.service.OrganInfoService;
import com.strict.modules.system.vo.OrganInfoVO;

/**
 * @project sqltoy-strict
 * @description 机构信息表维护和查询服务
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
@Service("organInfoService")
public class OrganInfoServiceImpl implements OrganInfoService {
	@Autowired
	private SqlToyLazyDao sqlToyDao;

	/**
	 * 新增机构信息，并通过树结构wrapTreeTable构造节点路径、层级、是否叶子节点
	 */
	@Transactional
	public void save(OrganInfoVO organInfoVO) {
		//将vo转为pojo
		OrganInfo organInfo = sqlToyDao.convertType(organInfoVO, OrganInfo.class);
		sqlToyDao.save(organInfo);
		//构造节点路径、层级、是否叶子节点标志
		sqlToyDao.wrapTreeTableRoute(new TreeTableModel(organInfo).pidField("organPid"));
	}

	@Override
	public PaginationModel<OrganInfoVO> search(PaginationModel page, OrganInfoVO organInfoVO) {
		return null;
	}

}
