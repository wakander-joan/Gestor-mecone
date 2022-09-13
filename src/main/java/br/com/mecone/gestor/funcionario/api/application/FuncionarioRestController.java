package br.com.mecone.gestor.funcionario.api.application;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.mecone.gestor.funcionario.api.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioRestController implements FuncionarioAPI {
	private final FuncionarioService funcionarioService;

	@Override
	public FuncionarioResponse criaFuncionario(UUID idEmpresa, FuncionarioRequeste funcionarioRequeste) {
		log.info("[start] FuncionarioRestController - criaFuncionario");
		FuncionarioResponse funcionario = funcionarioService.criaFuncionario(idEmpresa, funcionarioRequeste);
		log.info("[finish] FuncionarioRestController - criaFuncionario");
		return funcionario;
	}

}
