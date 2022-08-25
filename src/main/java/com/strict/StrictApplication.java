package com.strict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @project sqltoy-quickstart
 * @description 演示一个严谨的项目基本套路，主要演示POJO和VO严格分层
 * @author zhongxuchen
 * @version v1.0, Date:2020年7月17日
 * @modify 2020年7月17日,修改说明
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.strict.config", "com.strict.modules" })
@EnableTransactionManagement
public class StrictApplication {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(StrictApplication.class, args);
	}
}
