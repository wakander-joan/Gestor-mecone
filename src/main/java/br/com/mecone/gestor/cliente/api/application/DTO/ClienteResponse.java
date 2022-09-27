package br.com.mecone.gestor.cliente.api.application.DTO;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteResponse {
	private UUID idCliente;
}
