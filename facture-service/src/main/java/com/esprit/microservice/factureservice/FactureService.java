package com.esprit.microservice.factureservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class FactureService {
	@Autowired
	private FactureRepository factureRepository;

	public Facture addFacture(Facture facture) {
		return factureRepository.save(facture);
	}
	public Facture updateFacture(int id, Facture newFacture ) {
		if (factureRepository.findById(id).isPresent()) {
			Facture oldFacture = factureRepository.findById(id).get();
			return factureRepository.save(oldFacture);
		} else
			return null;
	}
//	public Page<Facture> listFactures(int ownerId) {
//		Pageable firstPageWithManyElements = PageRequest.of(0, 15);
//	return factureRepository.factureByownerId(ownerId, firstPageWithManyElements);
//	}
	
	public String deleteFacture(int id) {
		if (factureRepository.findById(id).isPresent()) {
			factureRepository.deleteById(id);
			return "invoice deleted";
		} else
			return "invoice does not even exist dumbAss !";
	}
	public List<Facture> allFactures(){
		return factureRepository.findAll();
	}
	}
