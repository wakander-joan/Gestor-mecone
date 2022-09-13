package br.com.mecone.gestor.funcionario.api.service;

import java.util.UUID;

import br.com.mecone.gestor.funcionario.api.application.FuncionarioRequeste;
import br.com.mecone.gestor.funcionario.api.application.FuncionarioResponse;

public interface FuncionarioService {
	FuncionarioResponse criaFuncionario(UUID idEmpresa, FuncionarioRequeste funcionarioRequeste);
}
