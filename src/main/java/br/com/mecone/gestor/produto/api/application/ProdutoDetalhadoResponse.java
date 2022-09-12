package br.com.mecone.gestor.produto.api.application;

import br.com.mecone.gestor.produto.domain.Grupo;
import br.com.mecone.gestor.produto.domain.Produto;
import br.com.mecone.gestor.produto.domain.TipoEstoque;
import lombok.Value;

@Value
public class ProdutoDetalhadoResponse {
	private int codigo;
	private String descricao;
	private String referencia;
	private String fabricante;
	private String aplicacao;
	private Grupo grupo;
	private double preco;
	private int estoque;
	private String localEstoque; 
	private TipoEstoque tipoEstoque;
	
	public ProdutoDetalhadoResponse (Produto produto) {
		this.codigo = produto.getCodigo();
		this.descricao = produto.getDescricao();
		this.referencia = produto.getReferencia();
		this.fabricante = produto.getFabricante();
		this.aplicacao = produto.getAplicacao();
		this.grupo = produto.getGrupo();
		this.preco = produto.getPreco();
		this.localEstoque = produto.getLocalEstoque();
		this.estoque = produto.getEstoque();
		this.tipoEstoque = produto.getTipoEstoque();
	}
}
