package br.com.mecone.gestor.produto.api.application;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.mecone.gestor.produto.domain.Grupo;
import br.com.mecone.gestor.produto.domain.Produto;
import lombok.Value;

@Value
public class ProdutoListResponse {
	private int codigo;
	private String descricao;
	private String referencia;
	private String fabricante;
	private String aplicacao;
	private Grupo grupo;
	private double preco;
	private static int estoque;
	private String localEstoque; 
	private UUID idProduto;
	
	public static List<ProdutoListResponse> convert (List<Produto> produtos){
		return produtos.stream()
				.map(ProdutoListResponse::new)
				.collect(Collectors.toList());
	}

	public ProdutoListResponse(Produto produto) {
		this.codigo = produto.getCodigo();
		this.descricao = produto.getDescricao();
		this.referencia = produto.getReferencia();
		this.fabricante = produto.getFabricante();
		this.aplicacao = produto.getAplicacao();
		this.grupo = produto.getGrupo();
		this.preco = produto.getPreco();
		this.localEstoque = produto.getLocalEstoque();
		this.estoque = produto.getEstoque();
		this.idProduto = produto.getIdProduto();
	}
	
	
}
