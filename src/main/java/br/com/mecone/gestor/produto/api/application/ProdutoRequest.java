package br.com.mecone.gestor.produto.api.application;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.mecone.gestor.produto.domain.Grupo;
import br.com.mecone.gestor.produto.domain.TipoEstoque;
import lombok.Value;

@Value
public class ProdutoRequest {
	@NotBlank
	private String descricao;
	@NotBlank
	private String referencia;
	@NotBlank
	private String fabricante;
	@NotBlank
	private String aplicacao;
	@NotNull
	private Grupo grupo;
	@NotNull
	private double preco;
	@NotNull
	private TipoEstoque tipoEstoque;
	@NotBlank
	private String localEstoque; 

	
}
