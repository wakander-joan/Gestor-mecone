package br.com.mecone.gestor.empresa.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mecone.gestor.empresa.domain.Empresa;

public interface EmpresaSpringDataJPARepository extends  JpaRepository<Empresa, UUID>{
}
