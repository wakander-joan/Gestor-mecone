package br.com.mecone.gestor.funcionario.api.application;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.mecone.gestor.funcionario.domain.Cargo;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FuncionarioRequeste {
	@NotBlank
	private String nome;
	@NotNull
	private Cargo cargo;
}
