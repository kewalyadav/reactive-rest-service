package com.baeldung.reactive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import com.baeldung.reactive.controller.ReactiveController;

@Configuration
public class ReactiveRouterConfig {

	@Bean
	RouterFunction<?> routes(ReactiveController reactiveController) {
		return RouterFunctions.route(RequestPredicates.GET("/foo"), reactiveController::generateData);
	}
}
