/**
 * 
 */
package com.strict.modules.sagacity.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.strict.framework.service.BaseService;
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
public class DictTypeServiceImpl extends BaseService implements DictTypeService {

	@Transactional
	public void save(DictTypeVO dictTypeVO) {
		DictType dictType = lazyDao.convertType(dictTypeVO, DictType.class);
		dictType.setStatus(1);
		lazyDao.save(dictType);
	}

	@Override
	public boolean isUnique(DictTypeVO dictTypeVO) {
		DictType dictType = lazyDao.convertType(dictTypeVO, DictType.class);
		return lazyDao.isUnique(dictType, "dictType");
	}

}
