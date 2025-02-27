package edu.ib.networktechnologies.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

@Configuration
public class SwaggerConfiguration {

        @Bean
        public OpenAPI customOpenApi() {
            return new OpenAPI()
                    .info(new Info().title("Library API").version("1.0.0"))
                    .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
                    .components(new Components().addSecuritySchemes("bearerAuth", new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")));
        }


}
