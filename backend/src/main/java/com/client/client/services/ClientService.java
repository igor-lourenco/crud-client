package com.client.client.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.client.client.dto.ClientDTO;
import com.client.client.entities.Client;
import com.client.client.repositories.ClientRepository;
import com.client.client.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {  // CAMADA SERVIÇO

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional <Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Cliente não existe"));
		return new ClientDTO(entity) ;
	}
}
