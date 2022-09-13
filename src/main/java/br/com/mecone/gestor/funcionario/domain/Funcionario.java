package br.com.mecone.gestor.funcionario.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.mecone.gestor.funcionario.api.application.FuncionarioRequeste;
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
public class Funcionario {
	private static int geradorCodigo = 0;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idFuncionario;
	@NotBlank
	private UUID idEmpresa;
	@NotBlank
	private String nome;
	@NotNull
	private Cargo cargo;
	
	private int codigoFuncionario = geradorCodigo++;

	public Funcionario(UUID idEmpresa, FuncionarioRequeste funcionarioRequeste) {
		this.idEmpresa = idEmpresa;
		this.nome = funcionarioRequeste.getNome();
		this.cargo = funcionarioRequeste.getCargo();
	}
	
	

}

