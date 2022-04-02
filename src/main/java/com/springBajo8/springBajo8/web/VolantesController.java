package com.springBajo8.springBajo8.web;

import com.springBajo8.springBajo8.domain.Factura;
import com.springBajo8.springBajo8.domain.Productos;
import com.springBajo8.springBajo8.domain.Volantes;
import com.springBajo8.springBajo8.service.FacturaService;
import com.springBajo8.springBajo8.service.VolantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class VolantesController {

    @Autowired
    private VolantesService volantesService;

    @PostMapping("/savevolantes")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Volantes> save(@RequestBody Volantes volante){return this.volantesService.save(volante);};

    @GetMapping("/getvolantes")
    private Flux<Volantes> findAll(){return this.volantesService.findAll();};

}
