package br.com.mecone.gestor.funcionario.api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.mecone.gestor.funcionario.api.application.FuncionarioRequeste;
import br.com.mecone.gestor.funcionario.api.application.FuncionarioResponse;
import br.com.mecone.gestor.funcionario.api.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;
	@Override
	public FuncionarioResponse criaFuncionario(UUID idEmpresa, FuncionarioRequeste funcionarioRequeste) {
		log.info("[start] FuncionarioApplicationService - criaFuncionario");
		FuncionarioResponse funcionario = funcionarioRepository.criaFuncionario(idEmpresa,funcionarioRequeste);
		log.info("[finish] FuncionarioApplicationService - criaFuncionario");
		return funcionario;
	}

}
