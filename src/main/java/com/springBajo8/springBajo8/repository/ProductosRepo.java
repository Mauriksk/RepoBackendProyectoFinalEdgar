package com.springBajo8.springBajo8.repository;

import com.springBajo8.springBajo8.domain.Productos;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("productos")
public interface ProductosRepo extends ReactiveMongoRepository<Productos,String> {
}
