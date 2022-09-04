package br.com.mecone.gestor.empresa.api.infra;

import org.springframework.stereotype.Repository;

import br.com.mecone.gestor.empresa.api.repository.EmpresaRepository;
import br.com.mecone.gestor.empresa.domain.Empresa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class EmpresaInfraRepository implements EmpresaRepository {
	private final EmpresaSpringDataJPARepository empresaSpringDataJPARepository;

	@Override
	public Empresa salva(Empresa empresa) {
		log.info("[start] EmpresaInfraRepository - salva");
		empresaSpringDataJPARepository.save(empresa);
		log.info("[finish] EmpresaInfraRepository - salva");
		return empresa;
	}	
}
