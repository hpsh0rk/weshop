package com.sh0rk.common.config;

import io.swagger.annotations.Api;
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

import java.util.Collections;

/**
 * Swaager 配置类
 * @author sh0rk
 *
 * controller添加@Api,@ApiOperation
 * pojo：VO，DO，DTO，添加@ApiModel,@ApiModelProperty
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                // api基本信息
                .apiInfo(apiInfo())
                .pathMapping("/")


                .select()

                // 扫描筛选，只扫描加了@Api的类,所以Api的url都可以
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())

                .build();
    }

    /**
     * Api基本信息
     * @return ApiInfo
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("WeShop系统")
                .description("WeShop系统接口一览")
                .version("1.0")
                .build();
    }
}
