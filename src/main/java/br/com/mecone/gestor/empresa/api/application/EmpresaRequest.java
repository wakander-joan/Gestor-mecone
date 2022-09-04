package br.com.mecone.gestor.empresa.api.application;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class EmpresaRequest {
	@NotBlank
	private String cnpj;
	@NotBlank
	private String nomeFantasia;
	@NotBlank
	private String senha;
	@NotBlank
	private String email;
	
	private String empresaPai;
	
	@NotNull
	private boolean aceitaTermos;
}
