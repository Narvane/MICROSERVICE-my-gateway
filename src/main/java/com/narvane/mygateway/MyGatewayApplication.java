package com.narvane.mygateway;

import com.narvane.mygateway.properties.RoutesProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class MyGatewayApplication {

	@Autowired
	private RoutesProperties routesProperties;

	@Bean
	public RouteLocator myRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/my-school/**")
						.uri(routesProperties.getUrlMySchool()))
				.route(p -> p
						.path("/my-user/**")
						.uri(routesProperties.getUrlMyUser()))
				.route(p -> p
						.path("/my-report/**")
						.uri(routesProperties.getUrlMyReport()))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(MyGatewayApplication.class, args);
	}

}
