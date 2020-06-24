package com.bwa.demo1.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * UI页面显示信息
     */
    private final String SWAGGER2_API_DESCRIPTION = "rest api 文档构建利器";
    private final String SWAGGER2_API_SERVICEURL = "http://blog.csdn.net/itguangit";
    private final String SWAGGER2_API_CONTACT = "itguang";
    private final String SWAGGER2_API_VERSION = "1.0";
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bwa.demo1.swagger"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试Swagger")
                .description(SWAGGER2_API_DESCRIPTION)
                .termsOfServiceUrl(SWAGGER2_API_SERVICEURL)
                .contact(new Contact("南斗六星-ND项目组", "http://www.dfssi.com.cn", "nd@email.com"))
                .version(SWAGGER2_API_VERSION)
                .build();
    }

}
