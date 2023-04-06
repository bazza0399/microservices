package com.esprit.microservice.factureservice;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Integer>{
//	@Query("select f from Facture f where f.ownerId = :ownerId")
//	public Page<Facture> factureByownerId(@Param("ownerId") Integer o, Pageable pageable);
}
