package com.baeldung.reactive.service.impl;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.baeldung.reactive.model.Foo;
import com.baeldung.reactive.service.IReactiveService;

import reactor.core.publisher.Flux;

@Service
public class ReactiveService implements IReactiveService {
	
	@Override
	public Flux<Foo> generateData() {
		Flux<Foo> events = Flux.fromStream(Stream.generate(() -> {
			int i = (int) (new Date().getTime() / 1000);
			return new Foo(i, "str_" + (i));
		}));
		return Flux.zip(events, Flux.interval(Duration.ofSeconds(1)), (k, v) -> k);
	}
}
