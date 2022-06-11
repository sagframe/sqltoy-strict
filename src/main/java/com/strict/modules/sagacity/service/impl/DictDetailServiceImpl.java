/**
 * 
 */
package com.strict.modules.sagacity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strict.framework.service.BaseService;
import com.strict.modules.sagacity.dao.DictDetailDao;
import com.strict.modules.sagacity.service.DictDetailService;
import com.strict.modules.sagacity.vo.DictDetailVO;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
@Service("dictDetailService")
public class DictDetailServiceImpl extends BaseService implements DictDetailService {
	@Autowired
	private DictDetailDao dictDetailDao;

	@Override
	public List<DictDetailVO> getDictByType(String dictType) {
		return dictDetailDao.getDictByType(dictType);
	}

}
