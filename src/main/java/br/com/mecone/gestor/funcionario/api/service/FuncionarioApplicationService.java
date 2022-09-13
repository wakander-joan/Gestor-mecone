package br.com.mecone.gestor.funcionario.api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.mecone.gestor.funcionario.api.application.FuncionarioRequeste;
import br.com.mecone.gestor.funcionario.api.application.FuncionarioResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {

	@Override
	public FuncionarioResponse criaFuncionario(UUID idEmpresa, FuncionarioRequeste funcionarioRequeste) {
		log.info("[start] FuncionarioApplicationService - criaFuncionario");
		log.info("[finish] FuncionarioApplicationService - criaFuncionario");
		return null;
	}

}
