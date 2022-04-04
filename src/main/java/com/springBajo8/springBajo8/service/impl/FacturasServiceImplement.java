package com.springBajo8.springBajo8.service.impl;

import com.springBajo8.springBajo8.domain.Factura;
import com.springBajo8.springBajo8.domain.Productos;
import com.springBajo8.springBajo8.repository.FacturasRepo;
import com.springBajo8.springBajo8.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FacturasServiceImplement implements FacturaService {

    @Autowired
    @Qualifier("facturas")
    private FacturasRepo facturasRepo;



    @Override
    public Mono<Factura> save(Factura factura) {
        return this.facturasRepo.save(factura);
    }

    @Override
    public Flux<Factura> findAll() {
        return this.facturasRepo.findAll();
    }
}
