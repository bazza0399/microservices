package com.esprit.microservice.factureservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/factures")
public class FactureRestAPI {
	@Autowired
	FactureService factureService;
@Autowired
FactureRepository factureRepository;
//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public ResponseEntity<Facture> createCandidat(@RequestBody Facture facture) {
//		return new ResponseEntity<>(factureService.addFacture(facture), HttpStatus.OK);
//	}
	@GetMapping(value = "/getAllFactures")
	@ResponseStatus(HttpStatus.OK)
public ResponseEntity<List<Facture>> getAllFactures(){
		  List<Facture> factures = factureService.allFactures();
	        if (factures.isEmpty()) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        } else {
	            return new ResponseEntity<>(factures, HttpStatus.OK);
	        }
	    }
	
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Facture> updateFacture(@PathVariable(value = "id") int id, @RequestBody Facture facture) {
		return new ResponseEntity<>(factureService.updateFacture(id, facture), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteFacture(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(factureService.deleteFacture(id), HttpStatus.OK);
	}

	@PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Facture> createEvaluation(@RequestBody Facture facture) {
		Facture evaluation = this.factureService.addFacture(facture);
		return new ResponseEntity<>(evaluation, HttpStatus.CREATED);

	}
}
