package br.com.mecone.gestor.cliente.api.application;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.mecone.gestor.cliente.api.application.DTO.ClienteRequest;
import br.com.mecone.gestor.cliente.api.application.DTO.ClienteResponse;
import br.com.mecone.gestor.cliente.api.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(UUID idEmpresa, ClienteRequest clienteRequest) {
		log.info("[start] ClienteController  - postCliente");
		ClienteResponse cliente= clienteService.postCliente(idEmpresa, clienteRequest);
		log.info("[finish] ClienteController  - postCliente");
		return cliente;
	}

}
