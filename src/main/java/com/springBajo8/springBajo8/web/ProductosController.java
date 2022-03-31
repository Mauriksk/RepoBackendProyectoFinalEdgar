package com.springBajo8.springBajo8.web;


import com.springBajo8.springBajo8.domain.Productos;
import com.springBajo8.springBajo8.domain.citasDTOReactiva;
import com.springBajo8.springBajo8.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @PostMapping("/saveproducto")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Productos> save(@RequestBody Productos productos){
        return this.productosService.save(productos);
    }

    @GetMapping("getproductos")
    private Flux<Productos> findAll(){
        return this.productosService.findAll();
    }

    @PutMapping("actualizarproducto/{id}")
    private Mono<ResponseEntity<Productos>> update(@PathVariable("id") String id, @RequestBody Productos productos ){
        return this.productosService.update(id, productos)
                .flatMap(productos1 -> Mono.just(ResponseEntity.ok(productos1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }


}
