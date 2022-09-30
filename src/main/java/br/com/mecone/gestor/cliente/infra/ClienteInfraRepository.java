package br.com.mecone.gestor.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.mecone.gestor.cliente.api.repository.ClienteRepository;
import br.com.mecone.gestor.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;
	
	@Override
	public Cliente postCliente(Cliente cliente) {
		log.info("[start] ClienteInfraRepository - postCliente");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finish] ClienteInfraRepository - postCliente");
		return cliente;
	}

}
