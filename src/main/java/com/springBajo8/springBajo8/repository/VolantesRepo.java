package com.springBajo8.springBajo8.repository;

import com.springBajo8.springBajo8.domain.Volantes;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("volantes")
public interface VolantesRepo extends ReactiveMongoRepository<Volantes,String> {
}
