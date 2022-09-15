package br.com.mecone.gestor.funcionario.api.repository;

import java.util.UUID;

import br.com.mecone.gestor.funcionario.api.application.FuncionarioRequeste;
import br.com.mecone.gestor.funcionario.api.application.FuncionarioResponse;

public interface FuncionarioRepository {
	FuncionarioResponse criaFuncionario(UUID idEmpresa, FuncionarioRequeste funcionarioRequeste);
}
