package com.pidev.phset.repositories;

import com.pidev.phset.entities.Interview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInterviewRepository extends CrudRepository<Interview,Integer> {
}
