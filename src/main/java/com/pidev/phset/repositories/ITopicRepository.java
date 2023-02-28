package com.pidev.phset.repositories;

import com.pidev.phset.entities.Topic;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ITopicRepository extends CrudRepository<Topic,Integer> {
}
