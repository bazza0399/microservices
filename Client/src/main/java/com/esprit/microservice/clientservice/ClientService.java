package com.esprit.microservice.clientservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public Client addClient(Client client) {
		return clientRepository.save(client);
	}
	public Client updateClient(int id, Client newClient) {
		if (clientRepository.findById(id).isPresent()) {
			Client existingClient = clientRepository.findById(id).get();
			existingClient.setNom(newClient.getNom());
			existingClient.setPrenom(newClient.getPrenom());
			existingClient.setEmail(newClient.getEmail());

			return clientRepository.save(existingClient);
		} else
			return null;
	}
	public String deleteClient(int id) {
		if (clientRepository.findById(id).isPresent()) {
			clientRepository.deleteById(id);
			return "client supprimé";
		} else
			return "client non supprimé";
	}
	
	public List<Client> getClients(){
		return clientRepository.findAll();
	}
}
