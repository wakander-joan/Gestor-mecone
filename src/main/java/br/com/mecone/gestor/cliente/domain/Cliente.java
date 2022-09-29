package br.com.mecone.gestor.cliente.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import br.com.mecone.gestor.cliente.api.application.DTO.ClienteRequest;
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
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private UUID idEmpresa;
	@NotBlank
	private String nome;
	@CPF
	@NotBlank
	private String cpf;
	private String razaoSocial;
	@Email
	@NotBlank
	private String email;
	private String telefone;
	@NotBlank
	private String celular;
	@NotBlank
	private Sexo sexo;
	
	public Cliente( UUID idEmpresa,ClienteRequest clienteRequest) {
		this.idEmpresa = idEmpresa;
		this.nome = clienteRequest.getNome();
		this.cpf = clienteRequest.getCpf();
		this.razaoSocial = clienteRequest.getRazaoSocial();
		this.email = clienteRequest.getEmail();
		this.telefone = clienteRequest.getTelefone();
		this.celular = clienteRequest.getCelular();
		this.sexo = clienteRequest.getSexo();
	}
	
}





