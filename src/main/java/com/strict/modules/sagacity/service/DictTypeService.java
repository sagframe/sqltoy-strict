/**
 * 
 */
package com.strict.modules.sagacity.service;

import com.strict.modules.sagacity.vo.DictTypeVO;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhong
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
public interface DictTypeService {
	/**
	 * @TODO 新增字典分类
	 * @param dictTypeVO
	 */
	public void save(DictTypeVO dictTypeVO);

	/**
	 * @TODO 判断字典分类是否已经存在
	 * @param dictTypeVO
	 * @return
	 */
	public boolean isUnique(DictTypeVO dictTypeVO);
}
