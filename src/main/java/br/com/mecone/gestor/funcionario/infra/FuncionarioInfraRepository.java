package br.com.mecone.gestor.funcionario.infra;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.mecone.gestor.funcionario.api.application.FuncionarioRequeste;
import br.com.mecone.gestor.funcionario.api.application.FuncionarioResponse;
import br.com.mecone.gestor.funcionario.api.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {

	@Override
	public FuncionarioResponse criaFuncionario(UUID idEmpresa, FuncionarioRequeste funcionarioRequeste) {
		log.info("[start] FuncionarioInfraRepository - criaFuncionario");
		log.info("[finish] FuncionarioInfraRepository - criaFuncionario");
		return null;
	}

}
