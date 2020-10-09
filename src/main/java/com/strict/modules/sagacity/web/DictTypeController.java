/**
 * 
 */
package com.strict.modules.sagacity.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strict.framework.web.BaseController;

import io.swagger.annotations.Api;

/**
 * @project sqltoy-strict
 * @description 请在此说明类的功能
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
@Api(tags = "数据字典信息维护")
@RestController
@RequestMapping("dictType")
public class DictTypeController extends BaseController {

}
