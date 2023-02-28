package com.pidev.phset.repositories;

import com.pidev.phset.entities.Certificate;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ICertificateRepository extends CrudRepository<Certificate,Integer> {
}
