package com.baeldung.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.baeldung.reactive.model.Foo;
import com.baeldung.reactive.service.IReactiveService;

import reactor.core.publisher.Mono;

@Component
public class ReactiveController {
	
	@Autowired
	private IReactiveService reactiveService;

	public Mono<ServerResponse> generateData(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM)
							 .body(reactiveService.generateData(), Foo.class);
	}
}
