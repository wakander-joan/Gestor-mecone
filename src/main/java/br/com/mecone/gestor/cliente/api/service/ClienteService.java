package br.com.mecone.gestor.cliente.api.service;

import java.util.UUID;

import br.com.mecone.gestor.cliente.api.application.DTO.ClienteRequest;
import br.com.mecone.gestor.cliente.api.application.DTO.ClienteResponse;

public interface ClienteService {
	ClienteResponse postCliente(UUID idEmpresa, ClienteRequest clienteRequest);
}
