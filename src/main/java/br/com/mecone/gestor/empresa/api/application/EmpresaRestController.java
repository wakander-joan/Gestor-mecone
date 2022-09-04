package br.com.mecone.gestor.empresa.api.application;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class EmpresaRestController implements EmpresaAPI {

	@Override
	public EmpresaResponse postEmpresa(EmpresaRequest empresaRequest) {
		log.info("[start] EmpresaRestController - postEmpresa");
		log.info("[finish] EmpresaRestController - postEmpresa");
		return null;
	}

}
