package com.baeldung.reactive.service;

import com.baeldung.reactive.model.Foo;

import reactor.core.publisher.Flux;

public interface IReactiveService {

	Flux<Foo> generateData();
}
