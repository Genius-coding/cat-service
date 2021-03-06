package org.sid.catservice.dao;

import org.sid.catservice.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {
    @RestResource(path = "/byDesignation")
    public List<Produit> findByDesignationContains(@Param("mc") String designation);
    @RestResource(path = "/byDesignationPage")
    public Page<Produit> findByDesignationContains(@Param("mc") String designation, Pageable pageable);

}
