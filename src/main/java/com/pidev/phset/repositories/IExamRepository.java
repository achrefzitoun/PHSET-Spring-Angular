package com.pidev.phset.repositories;

import com.pidev.phset.entities.Exam;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IExamRepository extends CrudRepository<Exam,Integer> {
}
