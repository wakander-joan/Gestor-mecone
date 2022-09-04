package br.com.mecone.gestor.empresa.api.service;

import org.springframework.stereotype.Service;

import br.com.mecone.gestor.empresa.api.application.EmpresaRequest;
import br.com.mecone.gestor.empresa.api.application.EmpresaResponse;
import br.com.mecone.gestor.empresa.api.repository.EmpresaRepository;
import br.com.mecone.gestor.empresa.domain.Empresa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

  
@Log4j2
@RequiredArgsConstructor
@Service
public class EmpresaApplicationService implements EmpresaService {
	private final EmpresaRepository empresaRepository;

	@Override
	public EmpresaResponse postEmpresa(EmpresaRequest empresaRequest) {
		log.info("[start] EmpresaApplicationService - postEmpresa");
		Empresa empresa = empresaRepository.salva(new Empresa(empresaRequest));
		log.info("[finish] EmpresaApplicationService - postEmpresa");
		return EmpresaResponse.builder().idEmpresa(empresa.getIdEmpresa()).build();
	}
}
