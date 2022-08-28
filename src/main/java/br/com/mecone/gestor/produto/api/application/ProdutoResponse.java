package br.com.mecone.gestor.produto.api.application;

import java.util.UUID;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Builder
@Value
public class ProdutoResponse {
	private UUID idProduto;
	private String descricao;
	private int codigo;
}
