package br.com.mecone.gestor.empresa.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import br.com.mecone.gestor.empresa.api.application.EmpresaRequest;
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
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idEmpresa;
	@NotBlank
	private String cnpj;
	@NotBlank
	private String nomeFantasia;
	@NotBlank
	private String senha;
	@NotBlank
	@Email
	private String email;
	private String empresaPai;
	
	public Empresa(EmpresaRequest empresaRequest) {
		this.cnpj = empresaRequest.getCnpj();
		this.nomeFantasia = empresaRequest.getNomeFantasia();
		this.senha = empresaRequest.getSenha();
		this.email = empresaRequest.getEmail();
		this.empresaPai = empresaRequest.getEmpresaPai();
	}
	
	
}
