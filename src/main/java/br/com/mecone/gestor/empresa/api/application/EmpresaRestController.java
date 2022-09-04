package br.com.mecone.gestor.empresa.api.application;

import org.springframework.web.bind.annotation.RestController;

import br.com.mecone.gestor.empresa.api.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
@RestController
public class EmpresaRestController implements EmpresaAPI {
	private final EmpresaService empresaService;

	@Override
	public EmpresaResponse postEmpresa(EmpresaRequest empresaRequest) {
		log.info("[start] EmpresaRestController - postEmpresa");
		EmpresaResponse empresaCriada = empresaService.postEmpresa(empresaRequest);
		log.info("[finish] EmpresaRestController - postEmpresa");
		return empresaCriada;
	}
}
