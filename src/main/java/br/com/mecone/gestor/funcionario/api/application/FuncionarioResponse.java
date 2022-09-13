package br.com.mecone.gestor.funcionario.api.application;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FuncionarioResponse {
	private UUID idFuncionario;
}
