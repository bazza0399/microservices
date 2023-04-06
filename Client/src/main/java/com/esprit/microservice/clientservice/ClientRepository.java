package com.esprit.microservice.clientservice;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client, Integer> {
	@Query("select c from Client c where c.nom like :nom")
	public Page<Client> clientByNom(@Param("nom") String n, Pageable pageable);
	   
}
