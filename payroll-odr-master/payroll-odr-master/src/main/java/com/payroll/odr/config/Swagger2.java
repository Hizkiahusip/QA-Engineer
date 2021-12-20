package com.payroll.odr.config;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Profile({"!production"})
public class Swagger2 {

    @Value("${swagger.host}")
    private String HOST;
    
    @Bean
    public Docket api() {              
        return new Docket(DocumentationType.SWAGGER_2)   
        .host(HOST)       
        .select()                                       
        .apis(RequestHandlerSelectors.basePackage("com.payroll.odr.controller"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo())
        .securitySchemes(Arrays.asList(apiKey()))
        .securityContexts(Arrays.asList(securityContext()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
            "KlikPayroll CMA",
            "Api Documentation for KlikPayroll CMA", 
            "", // "API TOS", 
            "", // "Terms of service", 
            "", // new Contact("John Doe", "www.example.com", "myeaddress@company.com"),
            "", // "License of API", 
            "" // "API license URL", 
            // Collections.emptyList()
            );
    }

    private ApiKey apiKey() {
        return new ApiKey("Bearer", "Authorization", "header");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
            .securityReferences(defaultAuth())
            .forPaths(PathSelectors.any())
            .build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope
            = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(
            new SecurityReference("Bearer", authorizationScopes));
    }

}