package br.com.mecone.gestor.produto.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Indexed;

import br.com.mecone.gestor.produto.api.application.ProdutoRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Builder
public class Produto {
	public static int codigoFix = 0;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idProduto;
	@NotNull
	private UUID idEmpresa;
	private int codigo = codigoFix++;
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
	@Getter
	private static int estoque = 0;
	@NotNull
	private TipoEstoque tipoEstoque;
	@NotBlank
	private String localEstoque; 
	
	public Produto(@Valid ProdutoRequest produtoRequest) {
		this.descricao = produtoRequest.getDescricao();
		this.referencia = produtoRequest.getReferencia();
		this.fabricante = produtoRequest.getFabricante();
		this.aplicacao = produtoRequest.getAplicacao();
		this.grupo = produtoRequest.getGrupo();
		this.preco = produtoRequest.getPreco();
		this.localEstoque = produtoRequest.getLocalEstoque();
		this.tipoEstoque = produtoRequest.getTipoEstoque();
		this.idEmpresa = produtoRequest.getIdEmpresa();
	}

}
