package br.com.mecone.gestor.cliente.api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.mecone.gestor.cliente.api.application.DTO.ClienteRequest;
import br.com.mecone.gestor.cliente.api.application.DTO.ClienteResponse;
import br.com.mecone.gestor.cliente.api.repository.ClienteRepository;
import br.com.mecone.gestor.cliente.domain.Cliente;
import br.com.mecone.gestor.empresa.api.service.EmpresaApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;
	private final EmpresaApplicationService empresaApplicationService;
	
	
	@Override
	public ClienteResponse postCliente(UUID idEmpresa, ClienteRequest clienteRequest) {
		log.info("[start] ClienteApplicationService - postCliente");
		empresaApplicationService.getEmpresa(idEmpresa);
		Cliente cliente = clienteRepository.postCliente(new Cliente(idEmpresa, clienteRequest));
		log.info("[finish] ClienteApplicationService - postCliente");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}
}
