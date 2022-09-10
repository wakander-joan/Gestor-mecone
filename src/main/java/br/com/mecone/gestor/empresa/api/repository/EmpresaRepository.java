package br.com.mecone.gestor.empresa.api.repository;

import java.util.Optional;
import java.util.UUID;

import br.com.mecone.gestor.empresa.domain.Empresa;

public interface EmpresaRepository {
	Empresa salva(Empresa empresa);
	Optional<Empresa> getProdutoByEmpresa(UUID idEmpresa);
}

