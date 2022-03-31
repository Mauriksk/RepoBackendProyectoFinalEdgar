package com.springBajo8.springBajo8.service.impl;

import com.springBajo8.springBajo8.domain.Productos;
import com.springBajo8.springBajo8.repository.ProductosRepo;
import com.springBajo8.springBajo8.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductosServiceImplement implements ProductosService {

    @Autowired
    @Qualifier("productos")
    private ProductosRepo productosRepo;

    @Override
    public Mono<Productos> save(Productos productos) {
        return this.productosRepo.save(productos);
    }

    @Override
    public Flux<Productos> findAll() {
        return this.productosRepo.findAll();
    }

    @Override
    public Mono<Productos> update(String id, Productos productos) {
        return this.productosRepo.findById(id).flatMap(productos1 -> {
            productos.setId(id);
            return save(productos);
        });
    }
}
