package br.com.mecone.gestor.produto.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Produto {
	public static int codigoFix = 0;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idProduto;
	@NotBlank
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
	
	private static int estoque = 0;
	
	@NotNull
	private TipoEstoque tipoEstoque;
	@NotBlank
	private String localEstoque; 
	
}
