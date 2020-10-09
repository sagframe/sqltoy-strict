/**
 * 
 */
package com.strict.modules.sagacity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strict.framework.model.Result;
import com.strict.framework.web.BaseController;
import com.strict.modules.sagacity.service.DictTypeService;
import com.strict.modules.sagacity.vo.DictTypeVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
@Api(tags = "数据字典信息维护")
@RestController
@RequestMapping("/sagacity/dictType")
public class DictTypeController extends BaseController {
	@Autowired
	private DictTypeService dictTypeService;

	@ApiOperation("新增字典分类信息")
	@RequestMapping(ADD)
	public Result save(@RequestBody DictTypeVO dictTypeVO) {
		try {
			dictTypeService.save(dictTypeVO);
			return super.success(dictTypeVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.failure("新建字典分类:{} 发生错误!", dictTypeVO.getDictType());
	}
}
