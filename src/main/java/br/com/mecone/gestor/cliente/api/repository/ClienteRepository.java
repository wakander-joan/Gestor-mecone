package br.com.mecone.gestor.cliente.api.repository;

import br.com.mecone.gestor.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente postCliente(Cliente cliente);
}
