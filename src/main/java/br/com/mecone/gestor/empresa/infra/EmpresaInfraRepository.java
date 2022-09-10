package br.com.mecone.gestor.empresa.infra;

import java.util.Optional;
import java.util.UUID;

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

	@Override
	public Optional<Empresa> getProdutoByEmpresa(UUID idEmpresa) {	
		log.info("[start] EmpresaInfraRepository - getEmpresa");
		Optional<Empresa> empresa = empresaSpringDataJPARepository.findByIdEmpresa(idEmpresa);
		log.info("[finish] EmpresaInfraRepository - getEmpresa");
		return empresa;
	}
}
