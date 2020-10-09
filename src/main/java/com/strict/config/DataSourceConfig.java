/**
 * 
 */
package com.strict.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

/**
 * @project sqltoy-strict
 * @description 数据源配置(比如多个数据源),单一数据源参见quickstart演示项目，无需增加Config，这里演示多个数据源如何配置(很多初学者很困惑)
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
@Configuration
public class DataSourceConfig {
	/**
	 * 配置主数据源
	 * 
	 * @return
	 */
	@Bean(name = "dataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.primary")
	public static DataSource dataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	// 演示多个数据源的配置，将注释打开即可
	/**
	 * 配置secondary 数据源
	 * 
	 * @return
	 */
	@Bean(name = "secondary")
	@ConfigurationProperties(prefix = "spring.datasource.secondary")
	public static DataSource dataSourceSkyline() {
		return DruidDataSourceBuilder.create().build();
	}
}
