package com.pidev.phset.repositories;

import com.pidev.phset.entities.ReponseFAQ;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IReponseFAQRepository extends CrudRepository<ReponseFAQ,Integer> {
}
