package com.springBajo8.springBajo8.service;

import com.springBajo8.springBajo8.domain.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FacturaService {
    Mono<Factura> save(Factura factura);
    Flux<Factura> findAll();
}
