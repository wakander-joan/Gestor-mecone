package br.com.mecone.gestor.empresa.api.application;

import java.util.UUID;

import br.com.mecone.gestor.empresa.domain.Empresa;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class EmpresaResponse {
	private UUID idEmpresa;
}
