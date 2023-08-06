package com.strict.framework.service;

import org.sagacity.sqltoy.dao.LightDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author zhongxu
 *
 */
public class BaseService {
	/**
	 * 定义全局日志,在Service层代码继承BaseService,直接在程序中使用log.info,log.error等
	 */
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 为service提供统一的Dao操作
	 */
	@Autowired(required = false)
	protected LightDao lightDao;
}
