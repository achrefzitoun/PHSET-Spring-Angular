package com.pidev.phset.repositories;

import com.pidev.phset.entities.ClassState;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClassStateRepository extends CrudRepository<ClassState, Integer> {
}
