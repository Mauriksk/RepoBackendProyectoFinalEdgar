package com.springBajo8.springBajo8.repository;

import com.springBajo8.springBajo8.domain.Factura;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("facturas")
public interface FacturasRepo extends ReactiveMongoRepository<Factura,String> {
}
