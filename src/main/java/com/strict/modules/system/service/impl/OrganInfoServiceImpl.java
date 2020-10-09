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

	@Transactional
	public void save(OrganInfoVO organInfoVO) {
		OrganInfo organInfo = sqlToyDao.convertType(organInfoVO, OrganInfo.class);
		sqlToyDao.save(organInfo);
		sqlToyDao.wrapTreeTableRoute(new TreeTableModel(organInfo).pidField("organPid"));
	}

	@Override
	public PaginationModel<OrganInfoVO> search(PaginationModel page, OrganInfoVO organInfoVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
