package com.pidev.phset.repositories;

import com.pidev.phset.entities.Training;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrainingRepository extends CrudRepository<Training,Integer> {
}
