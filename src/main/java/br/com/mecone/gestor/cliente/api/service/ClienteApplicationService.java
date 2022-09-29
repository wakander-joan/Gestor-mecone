package br.com.mecone.gestor.cliente.api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.mecone.gestor.cliente.api.application.DTO.ClienteRequest;
import br.com.mecone.gestor.cliente.api.application.DTO.ClienteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse postCliente(UUID idEmpresa, ClienteRequest clienteRequest) {
		log.info("[start] ClienteApplicationService - postCliente");
		log.info("[finish] ClienteApplicationService - postCliente");
		return null;
	}

}
