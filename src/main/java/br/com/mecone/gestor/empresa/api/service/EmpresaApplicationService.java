package br.com.mecone.gestor.empresa.api.service;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.mecone.gestor.empresa.api.application.EmpresaDetalhadaResponse;
import br.com.mecone.gestor.empresa.api.application.EmpresaRequest;
import br.com.mecone.gestor.empresa.api.application.EmpresaResponse;
import br.com.mecone.gestor.empresa.api.repository.EmpresaRepository;
import br.com.mecone.gestor.empresa.domain.Empresa;
import br.com.mecone.gestor.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class EmpresaApplicationService implements EmpresaService {
	private final EmpresaRepository empresaRepository;

	@Override
	public EmpresaResponse postEmpresa(EmpresaRequest empresaRequest) {
		log.info("[start] EmpresaApplicationService - postEmpresa");
		Empresa empresa = empresaRepository.salva(new Empresa(empresaRequest));
		log.info("[finish] EmpresaApplicationService - postEmpresa");
		return EmpresaResponse.builder().idEmpresa(empresa.getIdEmpresa()).build();
	}

	@Override
	public EmpresaDetalhadaResponse getEmpresa(UUID idEmpresa) {
		log.info("[start] EmpresaApplicationService - getEmpresa");
		Empresa empresaDetalhada = empresaRepository.getProdutoByEmpresa(idEmpresa)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Empresa não encontrada!"));
		log.info("[finish] EmpresaApplicationService - getEmpresa");
		return new EmpresaDetalhadaResponse(empresaDetalhada);
	}
}
