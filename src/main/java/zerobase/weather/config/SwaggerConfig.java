/****************************************************
 **                                                 **
 **        weather                          **
 **        SwaggerConfig                                  **
 **        Made by Toji                          **
 **        2024-03-03 :오전 7:10                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package zerobase.weather.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build().apiInfo(apiInfo());
        return new OpenAPI()
                .info(new Info()
                        .title("Swagger TEST")
                        .description("Welcome Log Company")
                        .version("1.0"));
    }

//    private ApiInfo apiInfo() {
//        String description = "Welcome Log Company";
//        return new ApiInfoBuilder()
//                .title("SWAGGER TEST")
//                .description(description)
//                .version("1.0")
//                .build();
//    }
}
