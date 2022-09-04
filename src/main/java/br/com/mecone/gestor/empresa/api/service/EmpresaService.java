package br.com.mecone.gestor.empresa.api.service;

import br.com.mecone.gestor.empresa.api.application.EmpresaRequest;
import br.com.mecone.gestor.empresa.api.application.EmpresaResponse;

public interface EmpresaService {
	EmpresaResponse postEmpresa(EmpresaRequest empresaRequest); 
}
