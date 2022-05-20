package org.sid.servicecompany.dao;

import org.sid.servicecompany.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompagnyRepository extends JpaRepository<Company, Long> {
}
