package br.com.mecone.gestor.cliente.api.application.DTO;

import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import br.com.mecone.gestor.cliente.domain.Sexo;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ClienteRequest {
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
}
