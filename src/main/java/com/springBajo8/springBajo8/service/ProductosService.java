package com.springBajo8.springBajo8.service;

import com.springBajo8.springBajo8.domain.Productos;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ProductosService {
    Mono<Productos> save(Productos productos);
    Flux<Productos> findAll();
    Mono<Productos> update(String id, Productos productos);
    Mono<Productos> delete(String id);
}
