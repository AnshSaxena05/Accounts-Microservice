package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservices REST API Documnetation",
				description = "Accounts Microservices REST API Documnetation",
				version = "v1.0.0",
				contact= @Contact(name = "Ansh S",
				                  email = "anshs5103@gmai.com",
				                  url = "https://github.com/anshs5103"),
				license = @License(name = "Apache 2.0",
						           url = "https://www.apache.org/licenses/LICENSE-2.0")
		),
		externalDocs = @ExternalDocumentation(
				description =  "AnshBank Accounts microservice REST API Documentation",
				url = "https://github.com/anshs5103"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
		System.out.println("Welcome Back Sir");
	}

}
