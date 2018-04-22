package com.rls.sys.common.service.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: Swagger2 配置
 * @Description : 构建restful风格的api
 * @date ：2018/4/16 21:08
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rls.sys.common.service"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("rls-sys-service")
                .description("Spring Boot中使用Swagger2构建RESTful APIs接口测试文档")
                .termsOfServiceUrl("https://github.com/Lizhendahaoren/rls")
                .version("1.0")
                .build();
    }
}
