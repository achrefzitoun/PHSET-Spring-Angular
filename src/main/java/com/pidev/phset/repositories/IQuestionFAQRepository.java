package com.pidev.phset.repositories;

import com.pidev.phset.entities.QuestionFAQ;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IQuestionFAQRepository extends CrudRepository<QuestionFAQ,Integer> {
}
