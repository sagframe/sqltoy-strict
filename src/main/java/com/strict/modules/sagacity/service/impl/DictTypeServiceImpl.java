/**
 * 
 */
package com.strict.modules.sagacity.service.impl;

import org.sagacity.sqltoy.dao.SqlToyLazyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.strict.modules.sagacity.entity.DictType;
import com.strict.modules.sagacity.service.DictTypeService;
import com.strict.modules.sagacity.vo.DictTypeVO;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhong
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
@Service("dictTypeService")
public class DictTypeServiceImpl implements DictTypeService {

	@Autowired
	private SqlToyLazyDao sqlToyDao;

	@Transactional
	public void save(DictTypeVO dictTypeVO) {
		DictType dictType = sqlToyDao.convertType(dictTypeVO, DictType.class);
		dictType.setStatus(1);
		sqlToyDao.save(dictType);
	}

	@Override
	public boolean isUnique(DictTypeVO dictTypeVO) {
		DictType dictType = sqlToyDao.convertType(dictTypeVO, DictType.class);
		return sqlToyDao.isUnique(dictType, "dictType");
	}

}
