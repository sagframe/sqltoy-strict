/**
 * 
 */
package com.strict.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @project sqltoy-strict
 * @description 配置swagger3.0
 * @author zhong
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
@Configuration
public class SwaggerConfig {
	//Swagger的访问路径为:port/swagger-ui/index.html 或port/swagger-ui
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("sqltoy严格分层型演示范例").description("演示VO和POJO严格分层的服务型项目基本套路").contact(new Contact("zhongxuchen",
						"https://github.com/sagframe/sagacity-sqltoy", "zhongxuchen@hotmail.com"))
				.version("1.0").build();
	}
}
