package com.springBajo8.springBajo8.service;


import com.springBajo8.springBajo8.domain.Volantes;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface VolantesService {
    Mono<Volantes> save(Volantes volantes);
    Flux<Volantes> findAll();
}
