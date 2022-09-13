package br.com.mecone.gestor.produto.api.application;

import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProdutoAlteraaRequest {
	@NotBlank
	private String descricao;
	@NotBlank
	private String referencia;
	@NotBlank
	private String aplicacao;
	@NotBlank
	private String localEstoque; 
}
