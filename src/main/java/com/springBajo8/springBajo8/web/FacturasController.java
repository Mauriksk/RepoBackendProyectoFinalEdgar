package com.springBajo8.springBajo8.web;


import com.springBajo8.springBajo8.domain.Factura;
import com.springBajo8.springBajo8.domain.Productos;
import com.springBajo8.springBajo8.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FacturasController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping("/savefactura")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Factura> save(@RequestBody Factura factura){
        return this.facturaService.save(factura);
    }

}
