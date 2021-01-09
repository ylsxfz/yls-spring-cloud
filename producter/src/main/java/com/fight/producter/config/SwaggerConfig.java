package com.fight.producter.config;

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


/**
 * @Author yls
 * @Description 集成swagger2 文档
 * 页面访问地址为：http://localhost:8620/swagger-ui.html
 * @Date 2020/4/5 9:15
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /*******************************************************默认api-start*************************************************************/
    /**
     * 功能描述:
     * 〈swagger2 接口文档管理器〉
     *
     * @return : springfox.documentation.spring.web.plugins.Docket
     * @author : yls
     * @date : 2020/07/12 10:48
     */
    @Bean
    public Docket defaultApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(defaultApiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 功能描述:
     * 〈apiInfo对象主要是设置我们api文档的标题，描述，访问的地址，创建者等信息〉
     * @author : yls
     * @date : 2020/11/09 20:54
     * @param
     * @return : springfox.documentation.service.ApiInfo
     */
    @SuppressWarnings("deprecation")
    private ApiInfo defaultApiInfo() {
        return new ApiInfoBuilder()
                .title("producter-API测试文档")
                .description("producter-微服务测试文档")
                .contact(new Contact("生产者系统主页", "http://localhost:8620/", "test@qq.com"))
                .version("v1.0")
                .license("Apache2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }
    /*******************************************************默认api-end*************************************************************/



}