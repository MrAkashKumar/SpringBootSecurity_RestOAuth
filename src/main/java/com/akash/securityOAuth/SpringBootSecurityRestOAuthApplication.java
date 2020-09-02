package com.akash.securityOAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableAuthorizationServer
public class SpringBootSecurityRestOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityRestOAuthApplication.class, args);
	}

}
