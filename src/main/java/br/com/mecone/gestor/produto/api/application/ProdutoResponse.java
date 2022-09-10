package br.com.mecone.gestor.produto.api.application;

import java.util.UUID;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Builder
@Value
@Getter
public class ProdutoResponse {
	private UUID idEmpresaPertencente;
	private UUID idProduto;
	private String descricao;
	private int codigo;
}
