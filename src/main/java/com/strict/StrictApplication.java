package com.strict;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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
@EnableWebMvc
public class StrictApplication extends SpringBootServletInitializer {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext application = SpringApplication.run(StrictApplication.class, args);
		Environment env = application.getEnvironment();
		String ip = InetAddress.getLocalHost().getHostAddress();
		String port = env.getProperty("server.port");
		port = (port == null) ? "8080" : port;
		String path = env.getProperty("server.servlet.context-path");
		System.out.println("\n----------------------------------------------------------\n\t"
				+ "Application is running! Access URLs:\n\tLocal: \t\thttp://localhost:" + port + path + "/\n\t"
				+ "External: \thttp://" + ip + ":" + port + path + "/\n"
				+ "----------------------------------------------------------");
	}
}
