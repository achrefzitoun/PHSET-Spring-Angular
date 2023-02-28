package com.pidev.phset.repositories;

import com.pidev.phset.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends CrudRepository<Course,Integer> {
}
