package br.com.mecone.gestor.produto.api.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mecone.gestor.produto.domain.Produto;

public interface ProdutoSpringDataJPARepository extends JpaRepository<Produto, UUID>{
	
}
