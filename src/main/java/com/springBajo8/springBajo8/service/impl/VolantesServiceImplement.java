package com.springBajo8.springBajo8.service.impl;

import com.springBajo8.springBajo8.domain.Productos;
import com.springBajo8.springBajo8.domain.Volantes;
import com.springBajo8.springBajo8.repository.VolantesRepo;
import com.springBajo8.springBajo8.service.VolantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VolantesServiceImplement implements VolantesService {

    @Autowired
    @Qualifier("volantes")
    VolantesRepo volantesRepo;

    @Override
    public Mono<Volantes> save(Volantes volantes) {
        return this.volantesRepo.save(volantes);
    }

    @Override
    public Flux<Volantes> findAll() {
        return this.volantesRepo.findAll();
    }

}
