/**
 * 
 */
package com.strict.modules.sagacity.dao;

import java.util.List;

import org.sagacity.sqltoy.model.EntityQuery;
import org.sagacity.sqltoy.support.SqlToyDaoSupport;
import org.springframework.stereotype.Repository;

import com.strict.modules.sagacity.entity.DictDetail;
import com.strict.modules.sagacity.vo.DictDetailVO;

/**
 * @project sqltoy-strict
 * @description 提供dao演示，绝大部分场景下sqltoy通过lazydao即可完成dao的功能，但一些特殊场景开发者仍可以自行定义dao
 * @author zhongxuchen
 * @version v1.0, Date:2020-10-13
 * @modify 2020-10-13,修改说明
 */
@Repository("dictDetailDao")
public class DictDetailDao extends SqlToyDaoSupport {
	/**
	 * @TODO 根据字典类别获取字典明细数据
	 * @param dictType
	 * @return
	 */
	public List<DictDetailVO> getDictByType(String dictType) {
		List<DictDetail> dictDetails = findEntity(DictDetail.class,
				EntityQuery.create().where("dictType=?").values(dictType));
		// return convertType(dictDetails, DictDetailVO.class);
		return null;
	}
}
