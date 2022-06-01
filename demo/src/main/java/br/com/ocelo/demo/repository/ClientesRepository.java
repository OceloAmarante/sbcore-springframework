package br.com.ocelo.demo.repository;

import org.springframework.stereotype.Repository;

import br.com.ocelo.demo.model.Cliente;

@Repository                           //aqui informa que essa clase vai acessar a base de dados
public class ClientesRepository {
	public void persistir(Cliente cliente) {
		//acessa a base e salva o cliente
		
	}

}
