/**
 * 
 */
package com.strict.modules.sagacity.service;

import java.util.List;

import com.strict.modules.sagacity.vo.DictDetailVO;

/**
 * @project sqltoy-strict
 * @description 字典明细数据服务
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
public interface DictDetailService {
	/**
	 * @TODO 根据字典类别获取字典分类下的明细记录
	 * @param dictType
	 * @return
	 */
	public List<DictDetailVO> getDictByType(String dictType);
}
