package com.boot.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="sahipler")
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
