/**
 * 
 */
package com.strict.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * @project sqltoy-strict
 * @description 配置swagger3.0
 * @author zhongxuchen
 * @version v1.0, Date:2020-9-30
 * @modify 2020-9-30,修改说明
 */
@Configuration
public class SpringDocConfig {
	// Swagger的访问路径为:port/swagger-ui/index.html 或port/swagger-ui/

	@Bean
	public GroupedOpenApi userApi() {
		String[] paths = { "/**" };
		String[] packagedToMatch = { "com.strict.modules" };
		return GroupedOpenApi.builder().group("sqltoy-strict演示").pathsToMatch(paths).packagesToScan(packagedToMatch)
				.build();
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("sqltoy严格分层型演示范例").version("1.0")
				.description("演示VO和POJO严格分层的服务型项目基本套路").termsOfService("https://github.com/sagframe/sagacity-sqltoy")
				.license(new License().name("Apache 2.0").url("https://github.com/sagframe/sagacity-sqltoy")));
	}
//    
//	@Bean
//	public GroupedOpenApi createRestApi() {
//		return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).select()
//				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).paths(PathSelectors.any())
//				.build();
//	}
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder()
//				.title("sqltoy严格分层型演示范例").description("演示VO和POJO严格分层的服务型项目基本套路").contact(new Contact("zhongxuchen",
//						"https://github.com/sagframe/sagacity-sqltoy", "zhongxuchen@hotmail.com"))
//				.version("1.0").build();
//	}
}
