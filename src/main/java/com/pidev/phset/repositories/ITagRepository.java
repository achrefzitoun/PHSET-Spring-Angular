package com.pidev.phset.repositories;

import com.pidev.phset.entities.Tag;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ITagRepository extends CrudRepository<Tag,Integer> {
}
