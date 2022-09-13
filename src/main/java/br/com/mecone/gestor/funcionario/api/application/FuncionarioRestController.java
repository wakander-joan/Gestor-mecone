package br.com.mecone.gestor.funcionario.api.application;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioRestController implements FuncionarioAPI {

	@Override
	public FuncionarioResponse criaFuncionario(UUID idEmpresa, FuncionarioRequeste funcionarioRequeste) {
		log.info("[start] FuncionarioRestController - criaFuncionario");
		log.info("[finish] FuncionarioRestController - criaFuncionario");
		return null;
	}

}
