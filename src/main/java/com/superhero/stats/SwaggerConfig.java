package com.superhero.stats;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(PathSelectors.any()).build();
	}

//	private Predicate<String> postPaths() {
//		return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
//	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Marvel Superhero Stats API developed by Pradnesh Mhatre")
				.description("Marvel Superhero Stats API for learning and development purpose, Data Credits: Kaggle.com")
				.termsOfServiceUrl("Generic")
				.contact("pradnesh0729@gmail.com").license("Apache 2.0")
				.licenseUrl("pradnesh0729@gmail.com").version("1.0").build();
	}

}
