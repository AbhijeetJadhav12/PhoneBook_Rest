package org.techhub.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	public OpenAPI generateDoc() {

		return new OpenAPI().info(new Info().title("Phone Book App").description("Api doc of Phonebook app"));
	}

}
