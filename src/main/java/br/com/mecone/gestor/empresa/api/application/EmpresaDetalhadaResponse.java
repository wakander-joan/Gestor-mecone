package br.com.mecone.gestor.empresa.api.application;

import java.util.UUID;

import br.com.mecone.gestor.empresa.domain.Empresa;
import lombok.Value;

@Value
public class EmpresaDetalhadaResponse {
	
	private UUID idEmpresa;
	private String cnpj;
	private String nomeFantasia;
	private String senha;
	private String email;
	private String empresaPai;
	
	public EmpresaDetalhadaResponse( Empresa empresaDetalhada) {
		super();
		this.idEmpresa = empresaDetalhada.getIdEmpresa();
		this.cnpj = empresaDetalhada.getCnpj();
		this.nomeFantasia = empresaDetalhada.getNomeFantasia();
		this.senha = empresaDetalhada.getSenha();
		this.email = empresaDetalhada.getEmail();
		this.empresaPai = empresaDetalhada.getEmpresaPai();
	}
	
	
	
}
