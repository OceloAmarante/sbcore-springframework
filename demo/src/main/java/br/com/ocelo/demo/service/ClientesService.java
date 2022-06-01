package br.com.ocelo.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ocelo.demo.model.Cliente;
import br.com.ocelo.demo.repository.ClientesRepository;

@Service
public class ClientesService {

	@Autowired
	private ClientesRepository repository;
	
	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		this.repository.persistir(cliente);
		
	}
	
	public void validarCliente(Cliente cliente) {
		//aplica validações
	}
	
	
}
