package br.com.mecone.gestor.empresa.api.service;

import org.springframework.stereotype.Service;

import br.com.mecone.gestor.empresa.api.application.EmpresaRequest;
import br.com.mecone.gestor.empresa.api.application.EmpresaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

  
@Log4j2
@RequiredArgsConstructor
@Service
public class EmpresaApplicationService implements EmpresaService {

	@Override
	public EmpresaResponse postEmpresa(EmpresaRequest empresaRequest) {
		log.info("[start] EmpresaApplicationService - postEmpresa");
		//EmpresaResponse empresaCriada = empresaRepository.postEmpresa(empresaRequest);
		log.info("[finish] EmpresaApplicationService - postEmpresa");
		return null;
	}

}
